package com.northbeam.expensetracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class CategoryRequest {
    @NotBlank(message = "name is required")
    private String name;

    private String description;

    @Positive(message = "receipt_threshold must be a positive number")
    @JsonProperty("receipt_threshold")
    private Integer receiptThreshold;
}
