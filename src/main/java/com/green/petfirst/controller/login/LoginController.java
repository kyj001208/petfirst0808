package com.green.petfirst.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/public/login")
	public String login() {
		return "/views/login/login";
	}
	
	@GetMapping("/public/signup")
	public String signup() {
		return "/views/login/signup";
	}
	
	

}