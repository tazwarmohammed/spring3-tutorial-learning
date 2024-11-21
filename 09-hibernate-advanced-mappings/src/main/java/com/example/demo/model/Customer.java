package com.example.demo.model;

import com.example.demo.annotation.CourseCode;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
	private String firstName;

	@NotNull(message = "Last name is required")
//	@NotBlank(message = "Last name is required")
	@Size(min = 1, message = "Last name must be at least 1 character long")
	private String lastName;

	@NotNull(message = "Age is required")
//	@NotBlank(message = "Age is required")
	@Min(value = 18, message = "Age must be at least 18")
	@Max(value = 65, message = "Age must be less than 65")
//	@Pattern(regexp = "^\\d{2}$", message = "Age must be a number between 18 and 65")
	private Integer age;

	@Pattern(regexp = "^\\d{11}$", message = "Phone number must be 11 characters long and contain only numbers")
	private String phoneNumber;

	@CourseCode
	private String courseCode;
}
