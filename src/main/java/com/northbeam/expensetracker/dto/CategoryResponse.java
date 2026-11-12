package com.northbeam.expensetracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryResponse {
    private String id;
    private String name;
    private String description;

    @JsonProperty("receipt_threshold")
    private Integer receiptThreshold;
}
