package com.element.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
	@GetMapping("/")
	public String indext(Model model) {
		
		model.addAttribute("msg","welcome to COntroller");
		
		
		return "index";
		
	}
}
