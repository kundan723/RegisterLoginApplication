package com.learn.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn.springboot.entities.User;
import com.learn.springboot.services.UserService;

@Controller
@RequestMapping
public class UserController {
	
	@Autowired
	UserService userServ;


	
	
	
	@PostMapping("add-user")
	public String addUser(@ModelAttribute User user) {
		if(userServ.existByEmail(user.getEmail())!=null) {
		userServ.addUser(user);
		return "registersuccess.html";
		}
		return "registrationfailure.html";
	}
	
	@PostMapping("login-user")
	public String validateUser(@RequestParam String email, @RequestParam String password) {
		
		User user = userServ.existByEmail(email);
		
		if(user!=null && user.getPassword().equals(password)) {
			return "loginsuccess.html";
			}
		
			return "loginfailure.html";
	}
}
