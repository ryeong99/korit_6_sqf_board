package com.study.SpringSecurityMybatis.exception;

import lombok.Data;
import org.springframework.validation.FieldError;

import java.util.List;

@Data
public class ValidException extends RuntimeException {
    private List<FieldError> fieldErrors;

    public ValidException(String message, List<FieldError> fieldErrors) {
        super(message);
        this.fieldErrors = fieldErrors;
    }
}