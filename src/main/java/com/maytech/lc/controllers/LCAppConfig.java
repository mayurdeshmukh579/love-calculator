package com.maytech.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.maytech.lc.api.UserInfoDTO;

@Controller
public class LCAppConfig {

	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {

		return "home-page";

	}

	@RequestMapping("/process-homepage")
	public String showResult(@ModelAttribute("userInfo") @Valid UserInfoDTO userInfoDTO,BindingResult result) {

		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		}

		return "result-page";
	}
}
