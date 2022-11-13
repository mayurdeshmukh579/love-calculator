package com.maytech.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maytech.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {
		
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-success")
	public String processUserReg(@Valid @ModelAttribute("userReg")UserRegistrationDTO dto,BindingResult result) {
		
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "user-registration-page";
		}
		System.out.println("Inside processUserReg method");
		return "registration-succes";
	}
}
