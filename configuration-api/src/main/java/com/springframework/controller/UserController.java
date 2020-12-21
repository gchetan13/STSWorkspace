package com.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.models.User;

@RestController
public class UserController {

	@Autowired
	private User user;
	
	@GetMapping("/user")
	public String getUser() {
		System.out.println(user.getName());
		return user.toString();
	}
}
