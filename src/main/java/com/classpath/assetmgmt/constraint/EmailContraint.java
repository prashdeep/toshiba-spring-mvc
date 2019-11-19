package com.classpath.assetmgmt.constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Constraint(validatedBy = EmailConstraintValidator.class)
public @interface EmailContraint {
    String message() default "Email field is invalid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}