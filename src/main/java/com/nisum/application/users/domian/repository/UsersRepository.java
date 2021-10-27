package com.nisum.application.users.domian.repository;

import java.util.List;

import com.nisum.application.users.domian.User;

public interface UsersRepository {
	
	List<User> getAll();
	User save(User userEntity);
	
}
