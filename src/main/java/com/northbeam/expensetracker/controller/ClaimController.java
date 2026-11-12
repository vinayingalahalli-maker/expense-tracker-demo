package com.northbeam.expensetracker.controller;

import com.northbeam.expensetracker.dto.ClaimRequest;
import com.northbeam.expensetracker.dto.ClaimResponse;
import com.northbeam.expensetracker.dto.RejectClaimRequest;
import com.northbeam.expensetracker.service.ClaimService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/claims")
@RequiredArgsConstructor
public class ClaimController {

    private final ClaimService claimService;

    @GetMapping
    public ResponseEntity<List<ClaimResponse>> list() {
        return ResponseEntity.ok(claimService.listAll());
    }

    @PostMapping
    public ResponseEntity<ClaimResponse> create(@Valid @RequestBody ClaimRequest request,
                                                 @AuthenticationPrincipal String userId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(claimService.create(request, userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClaimResponse> get(@PathVariable String id) {
        return ResponseEntity.ok(claimService.getById(id));
    }

    @PostMapping("/{id}/submit")
    public ResponseEntity<ClaimResponse> submit(@PathVariable String id) {
        return ResponseEntity.ok(claimService.submit(id));
    }

    @PostMapping("/{id}/approve")
    public ResponseEntity<ClaimResponse> approve(@PathVariable String id,
                                                  @AuthenticationPrincipal String approverId) {
        return ResponseEntity.ok(claimService.approve(id, approverId));
    }

    @PostMapping("/{id}/reject")
    public ResponseEntity<ClaimResponse> reject(@PathVariable String id,
                                                 @Valid @RequestBody RejectClaimRequest request) {
        return ResponseEntity.ok(claimService.reject(id, request.getReason()));
    }

    @PostMapping("/{id}/reimburse")
    public ResponseEntity<ClaimResponse> reimburse(@PathVariable String id,
                                                    @AuthenticationPrincipal String reimbursedBy) {
        return ResponseEntity.ok(claimService.reimburse(id, reimbursedBy));
    }
}
