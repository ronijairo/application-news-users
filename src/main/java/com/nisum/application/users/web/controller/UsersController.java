package com.nisum.application.users.web.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
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
	@ApiOperation(value="Save user",
			authorizations = {@Authorization(value="JWT")})
	public ResponseEntity<Map<String, Object>> saveUser(@RequestBody User user) {
		Map<String, Object> jsonResponse = new HashMap<>();
			jsonResponse.put("result", service.save(user));
		return (new ResponseEntity<>(jsonResponse, new HttpHeaders(), HttpStatus.OK));
	}
	
	@GetMapping("/getAll")
	@ApiOperation(value="Get all users",
			authorizations = {@Authorization(value="JWT")})
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

}
