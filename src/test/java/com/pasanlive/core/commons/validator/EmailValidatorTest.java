package com.pasanlive.core.commons.validator;

import junit.framework.TestCase;

import java.io.File;
import java.util.Scanner;

public class EmailValidatorTest extends TestCase {

    public void testValidate() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File validEmailsFile = new File(classLoader.getResource("valid_emails").getFile());
        File invalidEmailsFile = new File(classLoader.getResource("invalid_emails").getFile());

        Scanner validEmailsFileScanner = new Scanner(validEmailsFile);

        while (validEmailsFileScanner.hasNext()) {
            String email = validEmailsFileScanner.next();
            EmailValidator emailValidator = new EmailValidator();
            ValidationResult result = emailValidator.validate(email);

            assertNotNull("Validation result cannot be null", result);
            assertTrue("[" + email + "]  should be success", result.isValid());
        }

        Scanner invalidEmailFileScanner = new Scanner(invalidEmailsFile);

        while (invalidEmailFileScanner.hasNext()) {
            String email = invalidEmailFileScanner.next();
            EmailValidator emailValidator = new EmailValidator();
            ValidationResult result = emailValidator.validate(email);

            assertNotNull("Validation result cannot be null", result);
            assertTrue("[" + email + "] should be invalid", !result.isValid());
            assertNotNull("Description should me available", result.getDescription());
            assertNotNull("Exception cannot be null", result.getValidationFailException());
        }


    }
}