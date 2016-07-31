package com.pasanlive.core.commons.validator;

/**
 * by: Pasan Buddhika Weerathunaga
 * Email: me@pasanlive.com
 */

/**
 * Validation result class
 */
public class ValidationResult {
    private boolean isValid;
    private String description;
    private ValidationFailException validationFailException;

    private ValidationResult() {
        this.isValid = true;
    }

    private ValidationResult(String description, ValidationFailException validationFailException) {
        this.isValid = false;
        this.description = description;
        this.validationFailException = validationFailException;
    }

    /**
     * Generate Valid result
     *
     * @return {ValidationResult} object with valid result data
     */
    public static ValidationResult createValidResult() {
        return new ValidationResult();
    }

    /**
     * Generate invalid result
     *
     * @param description description of invalid result
     * @param validationFailException {ValidationFailException}
     * @return {ValidationResult} object with invalid result data
     */
    public static ValidationResult createInvalidResult(String description, ValidationFailException validationFailException) {
        return new ValidationResult(description, validationFailException);
    }

    public boolean isValid() {
        return isValid;
    }

    public String getDescription() {
        return description;
    }

    public ValidationFailException getValidationFailException() {
        return validationFailException;
    }
}
