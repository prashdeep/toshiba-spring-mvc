package com.classpath.assetmgmt.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConstraintValidator implements ConstraintValidator<EmailConstraint, String> {
   public void initialize(EmailConstraint constraint) {
   }

   public boolean isValid(String email, ConstraintValidatorContext context) {
      return email.contains("support@") || email.contains("contact@");
   }
}