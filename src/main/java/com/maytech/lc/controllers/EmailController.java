package com.maytech.lc.controllers;

import javax.websocket.server.PathParam;

import org.hibernate.validator.internal.util.privilegedactions.NewInstance;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maytech.lc.api.EmailDTO;

@Controller
public class EmailController {
	
	@RequestMapping("/sendEmail/{userName}")
	public String sendEmail(@PathVariable("userName") String userName, Model model) {
		
		model.addAttribute("emailDTO",new EmailDTO());
		model.addAttribute("userName", userName.toUpperCase());
		return "send-email-page";
	}
	
	@RequestMapping("/process-email")
	public String processEmail(@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		return "process-email-page";
	}
}
