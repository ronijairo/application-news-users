package com.nisum.application.users.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

	@PostMapping("/save")
	public String saveUser() {
		return "Hellow";
	}
	
	@GetMapping("/hellow")
	public String helloWorld() {
		return "Hi,Good day!!";
	}
}
