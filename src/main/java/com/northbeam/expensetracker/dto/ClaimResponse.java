package com.northbeam.expensetracker.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimResponse {
    private String id;
    private String title;
    private String status;

    @JsonProperty("expense_ids")
    private List<String> expenseIds;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("approved_by")
    private String approvedBy;

    @JsonProperty("rejection_reason")
    private String rejectionReason;

    @JsonProperty("reimbursed_by")
    private String reimbursedBy;
}
