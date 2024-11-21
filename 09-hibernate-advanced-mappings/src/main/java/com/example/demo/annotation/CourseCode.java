package com.example.demo.annotation;

import com.example.demo.validator.CourseCodeConstraintValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	public String value() default "CSE";
	public String message() default "Must start with 'CSE'";
	public Class<?>[] groups() default {};
	public Class<? extends Payload>[] payload() default {};
}
