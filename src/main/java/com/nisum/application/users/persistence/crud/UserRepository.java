package com.nisum.application.users.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nisum.application.users.persistence.entity.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity, String> {

}
