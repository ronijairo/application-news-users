package com.nisum.application.users.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nisum.application.users.domian.User;
import com.nisum.application.users.domian.repository.UsersDomainRepository;
import com.nisum.application.users.persistence.crud.UserJpaRepository;
import com.nisum.application.users.persistence.entity.UsersEntity;
import com.nisum.application.users.persistence.mapper.UserMapper;

@Repository
public class UsersRepository implements UsersDomainRepository{
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
	@Autowired
	private UserMapper mapper;

	@Override
	public List<User> getAll(){
		List<UsersEntity> users= (List<UsersEntity>) userJpaRepository.findAll();
		return mapper.toUsers(users);
	}
	
	@Override
	public User save(User user) {
		UsersEntity entity = mapper.toUserEntity(user);
		return mapper.toUser(userJpaRepository.save(entity));
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userJpaRepository.findByEmail(email).map(user -> mapper.toUser(user));
	}

	@Override
	public Optional<User> getUser(String id) {
		return userJpaRepository.findById(id).map(user -> mapper.toUser(user));
	}


}
