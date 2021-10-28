package com.nisum.application.users.domian.repository;

import java.util.List;
import java.util.Optional;

import com.nisum.application.users.domian.User;

public interface UsersDomainRepository {
	
	List<User> getAll();
	User save(User user);
	Optional<User> findByEmail(String email);
	Optional<User> getUser(String id);

}
