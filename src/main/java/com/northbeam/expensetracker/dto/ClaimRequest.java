package com.northbeam.expensetracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class ClaimRequest {
    @NotBlank(message = "title is required")
    private String title;

    @NotEmpty(message = "expense_ids must not be empty")
    @JsonProperty("expense_ids")
    private List<String> expenseIds;
}
