package com.example.demo.validator;

import com.example.demo.annotation.CourseCode;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
//		ConstraintValidator.super.initialize(constraintAnnotation);
		coursePrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String coursePrefix, ConstraintValidatorContext constraintValidatorContext) {
		if (coursePrefix != null) {
			return coursePrefix.startsWith(this.coursePrefix);
		}
		return false;
	}
}
