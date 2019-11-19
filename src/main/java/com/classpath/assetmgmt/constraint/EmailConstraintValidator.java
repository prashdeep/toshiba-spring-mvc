package com.classpath.assetmgmt.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConstraintValidator implements ConstraintValidator<EmailContraint, String> {
   public void initialize(EmailContraint constraint) {
   }

   public boolean isValid(String email, ConstraintValidatorContext context) {
      return email.contains("support@") || email.contains("contact@");
   }
}