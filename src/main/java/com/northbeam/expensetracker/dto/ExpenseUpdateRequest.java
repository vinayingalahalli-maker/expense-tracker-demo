package com.northbeam.expensetracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ExpenseUpdateRequest {
    private BigDecimal amount;
    private String currency;
    private LocalDate date;
    private String description;

    @JsonProperty("receipt_url")
    private String receiptUrl;
}
