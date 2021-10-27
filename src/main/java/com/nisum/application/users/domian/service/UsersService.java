package com.nisum.application.users.domian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.application.users.domian.User;
import com.nisum.application.users.domian.repository.UsersDomainRepository;

@Service
public class UsersService  {

	@Autowired
	private UsersDomainRepository domianRepository;


	public List<User> getAll() {
		return domianRepository.getAll();
	}


	public User save(User user) {
		return domianRepository.save(user);
	}


	

}
