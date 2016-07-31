package com.pasanlive.core.commons.validator;

import junit.framework.TestCase;

public class EmailValidatorTest extends TestCase {

    public void testValidate() throws Exception {
        EmailValidator emailValidator = new EmailValidator();
        ValidationResult result = emailValidator.validate("me@pasanlive.com");

        assertNotNull("Validation result cannot be null", result);
        assertTrue("Validation should be success", result.isValid());
    }
}