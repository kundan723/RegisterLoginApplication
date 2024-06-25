package com.learn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	
	@GetMapping("register-user")
	public static String registerUser() {
		return "register.html";
	}
	@GetMapping("login")
	public static String loginHelper() {
		return "login.html";
	}
}
