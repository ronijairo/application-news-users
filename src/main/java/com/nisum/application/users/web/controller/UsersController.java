package com.nisum.application.users.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisum.application.users.domian.DetailResponse;
import com.nisum.application.users.domian.User;

@RestController
@RequestMapping("/users")
public class UsersController {

	@PostMapping("/save")
	public ResponseEntity<Map<String, Object>> saveUser() {
		Map<String, Object> jsonResponse = new HashMap<>();
		
		DetailResponse<User> detail = new DetailResponse<>();
		return (new ResponseEntity<>(jsonResponse, new HttpHeaders(), HttpStatus.OK));
	}
	
	@GetMapping("/hellow")
	public String helloWorld() {
		return "Hi,Good day!!";
	}
}
