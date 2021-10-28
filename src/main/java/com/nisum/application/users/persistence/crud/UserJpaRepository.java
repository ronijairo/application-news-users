package com.nisum.application.users.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nisum.application.users.persistence.entity.UsersEntity;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UsersEntity, String> {
    Optional<UsersEntity> findByEmail(String email);
}
