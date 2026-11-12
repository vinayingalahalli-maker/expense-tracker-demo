package com.northbeam.expensetracker.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RejectClaimRequest {
    @NotBlank(message = "reason is required")
    private String reason;
}
