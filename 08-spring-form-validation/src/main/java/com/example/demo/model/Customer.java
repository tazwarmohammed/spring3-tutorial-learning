package com.example.demo.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
	private String firstName;

	@NotNull(message = "Last name is required")
//	@NotBlank
	@Size(min = 1, message = "Last name must be at least 1 character long")
	private String lastName;

	@NotNull(message = "Age is required")
	@Min(value = 18, message = "Age must be at least 18")
	@Max(value = 65, message = "Age must be less than 65")
	private Integer age;
}
