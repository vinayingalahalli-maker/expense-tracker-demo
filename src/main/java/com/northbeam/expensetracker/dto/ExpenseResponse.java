package com.northbeam.expensetracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class ExpenseResponse {
    private String id;

    @JsonProperty("category_id")
    private String categoryId;

    private BigDecimal amount;
    private String currency;
    private LocalDate date;
    private String description;

    @JsonProperty("receipt_url")
    private String receiptUrl;

    private String status;
}
