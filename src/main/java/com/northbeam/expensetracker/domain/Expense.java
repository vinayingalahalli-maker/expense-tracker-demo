package com.northbeam.expensetracker.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Expense {
    private String id;
    private String categoryId;
    private BigDecimal amount;
    private String currency;
    private LocalDate date;
    private String description;
    private String receiptUrl;
    private ExpenseStatus status;
}
