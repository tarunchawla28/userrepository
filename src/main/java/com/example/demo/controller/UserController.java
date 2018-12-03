package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRegistry;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/app")
public class UserController {
	@Autowired
	UserService userService;

	//@GetMapping("/")
	//public String get() {
	//	return "Hello";
	//}
//Tarun

	@GetMapping(value = "/getUsers")
	public List<UserRegistry> getUsers() {
		return this.userService.getUsers();
	}

	@PostMapping(value = "/saveUsers")
	public String saveUsers(@RequestBody UserRegistry userRegistry) {
		return this.userService.saveUsers(userRegistry);
	}
}
