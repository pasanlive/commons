package com.pasanlive.core.commons.validator;

/**
 * Created by compac 620 on 8/1/2016.
 */
public class PhoneNumberValidator implements Validator {
    @Override
    public ValidationResult validate(String phoneNumber) {

        String PHONE_REGEX = "^\\(?0\\d{2}\\)?[\\s\\-]?\\d{7}$";

        if(phoneNumber.matches(PHONE_REGEX))
            return ValidationResult.createValidResult();
        return ValidationResult.createInvalidResult("Invalid phone number", new ValidationFailException());
    }
}
