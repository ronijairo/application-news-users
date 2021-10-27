package com.nisum.application.users.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.nisum.application.users.domian.User;
import com.nisum.application.users.persistence.entity.UsersEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
	@Mappings({
		@Mapping(source= "id", target = "id"),
		@Mapping(source= "name", target = "name"),
		@Mapping(source= "email", target = "email"),
		@Mapping(source= "password", target = "password"),
	})
	User toUser(UsersEntity userEntity);
	
	@InheritInverseConfiguration
	UsersEntity toUserEntity(User user);
}
