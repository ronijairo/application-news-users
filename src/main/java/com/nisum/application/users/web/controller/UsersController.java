package com.nisum.application.users.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nisum.application.users.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nisum.application.users.domian.DetailResponse;
import com.nisum.application.users.domian.User;
import com.nisum.application.users.domian.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService service;

	@PostMapping("/save")
	public ResponseEntity<Map<String, Object>> saveUser(@RequestBody User user) {

		System.out.println("" +user.getName() + " " + user.getEmail());
		System.out.println("" + user.getPhones().toString());

		Map<String, Object> jsonResponse = new HashMap<>();
		User userDatail= service.save(user);
		DetailResponse<User> detail = new DetailResponse<>();
		detail.setCode(HttpStatus.OK.value());
		detail.setMessage("success");
		detail.setData(userDatail);
		return (new ResponseEntity<>(jsonResponse, new HttpHeaders(), HttpStatus.OK));
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<Map<String, Object>> getAll() {
		Map<String, Object> jsonResponse = new HashMap<>();
		List<User> listOfuser =  service.getAll();
		DetailResponse<List<User>> detail = new DetailResponse<>();
		detail.setCode(HttpStatus.OK.value());
		detail.setMessage("success" + HttpStatus.OK.toString());
		detail.setData(listOfuser);
		jsonResponse.put("result", detail);
		return (new ResponseEntity<>(jsonResponse, new HttpHeaders(), HttpStatus.OK));
	}


	public User preRegister(User user){
		String id = AppUtil.generateId();
		user.setCreated(AppUtil.getDateSystem());
		user.setModified(AppUtil.getDateSystem());
		user.setLastLogin(AppUtil.getDateSystem());
		user.setId(id);
		user.setToken(id);
		user.setIsactive(true);

		return user;
	}
}
