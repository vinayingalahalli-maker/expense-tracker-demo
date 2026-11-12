package com.northbeam.expensetracker.service;

import com.northbeam.expensetracker.domain.Claim;
import com.northbeam.expensetracker.domain.ClaimStatus;
import com.northbeam.expensetracker.domain.Expense;
import com.northbeam.expensetracker.domain.ExpenseStatus;
import com.northbeam.expensetracker.dto.ClaimRequest;
import com.northbeam.expensetracker.dto.ClaimResponse;
import com.northbeam.expensetracker.exception.ConflictException;
import com.northbeam.expensetracker.exception.ForbiddenException;
import com.northbeam.expensetracker.exception.ResourceNotFoundException;
import com.northbeam.expensetracker.exception.ValidationException;
import com.northbeam.expensetracker.repository.ClaimRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClaimService {

    private final ClaimRepository claimRepository;
    private final ExpenseService expenseService;

    public List<ClaimResponse> listAll() {
        return claimRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    public ClaimResponse getById(String id) {
        return claimRepository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new ResourceNotFoundException("Claim " + id + " does not exist"));
    }

    public ClaimResponse create(ClaimRequest request, String userId) {
        List<ValidationException.FieldError> errors = new ArrayList<>();

        for (String expenseId : request.getExpenseIds()) {
            Expense expense = expenseService.findDomainById(expenseId);
            if (expense.getDate().isBefore(LocalDate.now().minusDays(90))) {
                errors.add(new ValidationException.FieldError("expense_ids",
                        "Expense " + expenseId + " is older than 90 days and cannot be added to a claim"));
            }
        }

        if (!errors.isEmpty()) throw new ValidationException(errors);

        Claim claim = Claim.builder()
                .title(request.getTitle())
                .expenseIds(new ArrayList<>(request.getExpenseIds()))
                .status(ClaimStatus.draft)
                .createdBy(userId)
                .build();

        Claim saved = claimRepository.save(claim);

        // Mark expenses as claimed
        request.getExpenseIds().forEach(expId -> {
            Expense exp = expenseService.findDomainById(expId);
            exp.setStatus(ExpenseStatus.claimed);
            expenseService.save(exp);
        });

        return toResponse(saved);
    }

    public ClaimResponse submit(String id) {
        Claim claim = findDomain(id);
        if (claim.getStatus() != ClaimStatus.draft) {
            throw new ConflictException("Claim " + id + " is already submitted and cannot be submitted again");
        }
        claim.setStatus(ClaimStatus.submitted);
        return toResponse(claimRepository.save(claim));
    }

    public ClaimResponse approve(String id, String approverId) {
        Claim claim = findDomain(id);
        if (claim.getCreatedBy().equals(approverId)) {
            throw new ForbiddenException("An approver cannot approve their own claim");
        }
        if (claim.getStatus() != ClaimStatus.submitted) {
            throw new ConflictException("Only submitted claims can be approved");
        }
        claim.setStatus(ClaimStatus.approved);
        claim.setApprovedBy(approverId);
        return toResponse(claimRepository.save(claim));
    }

    public ClaimResponse reject(String id, String reason) {
        Claim claim = findDomain(id);
        if (claim.getStatus() != ClaimStatus.submitted) {
            throw new ConflictException("Only submitted claims can be rejected");
        }
        claim.setStatus(ClaimStatus.rejected);
        claim.setRejectionReason(reason);

        // Release expenses back to unclaimed
        claim.getExpenseIds().forEach(expId -> {
            Expense exp = expenseService.findDomainById(expId);
            exp.setStatus(ExpenseStatus.unclaimed);
            expenseService.save(exp);
        });

        return toResponse(claimRepository.save(claim));
    }

    public ClaimResponse reimburse(String id, String reimbursedBy) {
        Claim claim = findDomain(id);
        if (claim.getStatus() != ClaimStatus.approved) {
            throw new ConflictException("Only approved claims can be reimbursed");
        }
        claim.setStatus(ClaimStatus.reimbursed);
        claim.setReimbursedBy(reimbursedBy);

        // Mark expenses as reimbursed
        claim.getExpenseIds().forEach(expId -> {
            Expense exp = expenseService.findDomainById(expId);
            exp.setStatus(ExpenseStatus.reimbursed);
            expenseService.save(exp);
        });

        return toResponse(claimRepository.save(claim));
    }

    private Claim findDomain(String id) {
        return claimRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Claim " + id + " does not exist"));
    }

    private ClaimResponse toResponse(Claim c) {
        return ClaimResponse.builder()
                .id(c.getId())
                .title(c.getTitle())
                .status(c.getStatus().name())
                .expenseIds(c.getExpenseIds())
                .createdBy(c.getCreatedBy())
                .approvedBy(c.getApprovedBy())
                .rejectionReason(c.getRejectionReason())
                .reimbursedBy(c.getReimbursedBy())
                .build();
    }
}
