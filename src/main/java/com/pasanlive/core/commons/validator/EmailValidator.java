package com.pasanlive.core.commons.validator;

/**
 * by: Pasan Buddhika Weerathunaga
 * Email: me@pasanlive.com
 */
public class EmailValidator implements Validator {
    @Override
    public ValidationResult validate(String email) {
        return ValidationResult.createValidResult();
    }
}
