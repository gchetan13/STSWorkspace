package com.dxc.banking.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import com.dxc.banking.validator.PasswordConstraintValidator;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Documented
public @interface ValidPassword {
	
	String message() default "Password must contain one special letter,one uppercase , one lowercase";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
