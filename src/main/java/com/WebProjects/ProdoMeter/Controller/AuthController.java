package com.WebProjects.ProdoMeter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

	@GetMapping("/login")
	public String getLogin() {
		return "pages/login";
	}
	
	@GetMapping("/signup")
	public String getSignup() {
		return "pages/signup";
	}
}
