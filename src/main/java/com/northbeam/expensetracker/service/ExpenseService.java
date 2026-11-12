package com.northbeam.expensetracker.service;

import com.northbeam.expensetracker.domain.Category;
import com.northbeam.expensetracker.domain.Expense;
import com.northbeam.expensetracker.domain.ExpenseStatus;
import com.northbeam.expensetracker.dto.ExpenseRequest;
import com.northbeam.expensetracker.dto.ExpenseResponse;
import com.northbeam.expensetracker.dto.ExpenseUpdateRequest;
import com.northbeam.expensetracker.exception.ConflictException;
import com.northbeam.expensetracker.exception.ResourceNotFoundException;
import com.northbeam.expensetracker.exception.ValidationException;
import com.northbeam.expensetracker.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final CategoryService categoryService;

    public List<ExpenseResponse> listAll() {
        return expenseRepository.findAll().stream()
                .map(this::toResponse)
                .toList();
    }

    public ExpenseResponse getById(String id) {
        return expenseRepository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new ResourceNotFoundException("Expense " + id + " does not exist"));
    }

    public ExpenseResponse create(ExpenseRequest request) {
        Category category = categoryService.findDomainById(request.getCategoryId());

        // Receipt required if amount exceeds category threshold
        if (category.getReceiptThreshold() != null
                && request.getAmount().compareTo(BigDecimal.valueOf(category.getReceiptThreshold())) > 0
                && (request.getReceiptUrl() == null || request.getReceiptUrl().isBlank())) {
            throw new ValidationException(List.of(
                    new ValidationException.FieldError("receipt_url",
                            "A receipt is required for amounts above the category threshold of "
                                    + String.format("%.2f", category.getReceiptThreshold().doubleValue()))
            ));
        }

        Expense expense = Expense.builder()
                .categoryId(request.getCategoryId())
                .amount(request.getAmount())
                .currency(request.getCurrency())
                .date(request.getDate())
                .description(request.getDescription())
                .receiptUrl(request.getReceiptUrl())
                .status(ExpenseStatus.unclaimed)
                .build();

        return toResponse(expenseRepository.save(expense));
    }

    public ExpenseResponse update(String id, ExpenseUpdateRequest request) {
        Expense existing = expenseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Expense " + id + " does not exist"));

        if (existing.getStatus() != ExpenseStatus.unclaimed) {
            throw new ConflictException("Expense " + id + " is part of a submitted claim and cannot be modified");
        }

        if (request.getAmount() != null) existing.setAmount(request.getAmount());
        if (request.getCurrency() != null) existing.setCurrency(request.getCurrency());
        if (request.getDate() != null) existing.setDate(request.getDate());
        if (request.getDescription() != null) existing.setDescription(request.getDescription());
        if (request.getReceiptUrl() != null) existing.setReceiptUrl(request.getReceiptUrl());

        return toResponse(expenseRepository.save(existing));
    }

    public void delete(String id) {
        Expense existing = expenseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Expense " + id + " does not exist"));

        if (existing.getStatus() != ExpenseStatus.unclaimed) {
            throw new ConflictException("Expense " + id + " is part of a submitted claim and cannot be deleted");
        }

        expenseRepository.deleteById(id);
    }

    public Expense findDomainById(String id) {
        return expenseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Expense " + id + " does not exist"));
    }

    public void save(Expense expense) {
        expenseRepository.save(expense);
    }

    private ExpenseResponse toResponse(Expense e) {
        return ExpenseResponse.builder()
                .id(e.getId())
                .categoryId(e.getCategoryId())
                .amount(e.getAmount())
                .currency(e.getCurrency())
                .date(e.getDate())
                .description(e.getDescription())
                .receiptUrl(e.getReceiptUrl())
                .status(e.getStatus().name())
                .build();
    }
}
