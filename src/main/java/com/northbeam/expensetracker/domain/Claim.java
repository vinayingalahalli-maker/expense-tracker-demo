package com.northbeam.expensetracker.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Claim {
    private String id;
    private String title;
    private ClaimStatus status;
    private List<String> expenseIds;
    private String createdBy;
    private String approvedBy;
    private String rejectionReason;
    private String reimbursedBy;
}
