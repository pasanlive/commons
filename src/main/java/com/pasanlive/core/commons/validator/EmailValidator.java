package com.pasanlive.core.commons.validator;

/**
 * by: Pasan Buddhika Weerathunaga
 * Email: me@pasanlive.com
 */
public class EmailValidator implements Validator {
    @Override
    public ValidationResult validate(String email) {
//        String EMAIL_REGEX = "^[\\w_].[\\w-_\\.+][^..]*[\\w-_\\.][\\w-_]+@([\\w-]+\\.)+[\\w]+[\\w]$";
        String EMAIL_REGEX = "^[\\w_].[+\\w\\.\\-']+[^..]*[\\w-_]+@[a-zA-Z0-9-]+(\\.([A-Za-z]{2,})){1,2}+$";

        if(email.matches(EMAIL_REGEX))
            return ValidationResult.createValidResult();
        return ValidationResult.createInvalidResult("Invalid email", new ValidationFailException());
    }
}
