package com.pasanlive.core.commons.validator;

/**
 * by: Pasan Buddhika Weerathunaga
 * Email: me@pasanlive.com
 */
public class ValidatorFactory {
    public static Validator getValidator(ValidatorType validatorType) {
        switch (validatorType) {
            case EMAIL:
                return new EmailValidator();
            case FULL_NAME:
                return new FullNameValidator();
            case PHONE_NUMBER:
                return new PhoneNumberValidator();
            default:
                return null;
        }

    }

    public enum  ValidatorType {
        EMAIL,
        FULL_NAME,
        PHONE_NUMBER
    }
}
