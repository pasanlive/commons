package com.pasanlive.core.commons.validator;

/**
 * Created by compac 620 on 8/1/2016.
 */
public class FullNameValidator implements Validator  {
    @Override
    public ValidationResult validate(String fullName) {

        String FULL_NAME_REGEX = "^[\\\\p{L} .'-]+$";

        if(fullName.matches(FULL_NAME_REGEX))
            return ValidationResult.createValidResult();
        return ValidationResult.createInvalidResult("Invalid full name", new ValidationFailException());
    }
}
