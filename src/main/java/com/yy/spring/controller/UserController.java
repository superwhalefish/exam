package com.yy.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.spring.entity.User;
import com.yy.spring.service.UserService;

@RestController
public class UserController {
	@Autowired
private UserService userService;
	@PostMapping("/getuserall")
	public List<User> getUserAll() {
		return userService.getUser();
		
	}
	
}
