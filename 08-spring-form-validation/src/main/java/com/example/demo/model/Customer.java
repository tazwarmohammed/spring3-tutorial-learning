package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
}
