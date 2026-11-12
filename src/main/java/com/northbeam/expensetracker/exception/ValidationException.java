package com.northbeam.expensetracker.exception;

import lombok.Getter;

import java.util.List;

@Getter
public class ValidationException extends RuntimeException {
    private final List<FieldError> details;

    public ValidationException(List<FieldError> details) {
        super("validation_error");
        this.details = details;
    }

    public record FieldError(String field, String message) {}
}
