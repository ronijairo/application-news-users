package com.nisum.application.users.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nisum.application.users.persistence.crud.UserJpaRepository;
import com.nisum.application.users.persistence.entity.UsersEntity;

@Repository
public class UsersRepository {
	
	@Autowired
	private UserJpaRepository userJpaRepository;

	public List<UsersEntity> getAll(){
		return (List<UsersEntity>) userJpaRepository.findAll();
	}
	
	public UsersEntity save(UsersEntity userEntity) {
		return userJpaRepository.save(userEntity);
	}
}
