package com.example.demo.controller;

import com.example.demo.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, stringTrimmerEditor);
//		binder.registerCustomEditor(Integer.class, stringTrimmerEditor);
	}

	@GetMapping("/customerForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@PostMapping("/submitCustomer")
	public String submitForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if (result.hasErrors()) {
			System.err.println("Binding result has errors: " + result);
			return "customer-form"; // Returns to form if there are validation errors
		}
		return "redirect:/success"; // Redirects to success page if validation passes
	}

	@GetMapping("/success")
	public String showSuccess() {
		return "form-success";
	}
}
