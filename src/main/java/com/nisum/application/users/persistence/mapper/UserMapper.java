package com.nisum.application.users.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.nisum.application.users.domian.User;
import com.nisum.application.users.persistence.entity.UsersEntity;

@Mapper(componentModel = "spring", uses = {PhoneMapper.class})
public interface UserMapper {
	@Mappings({
		@Mapping(source= "id", target = "id"),
		@Mapping(source= "name", target = "name"),
		@Mapping(source= "email", target = "email"),
		@Mapping(source= "password", target = "password"),
		@Mapping(source= "phones", target = "phones"),
		@Mapping(source= "created", target = "created"),
		@Mapping(source= "modified", target = "modified"),
		@Mapping(source= "lastLogin", target = "lastLogin"),
		@Mapping(source= "token", target = "token"),
		@Mapping(source= "isactive", target = "isactive")
	})
	User toUser(UsersEntity userEntity);
	List<User> toUsers(List<UsersEntity> usersEntitys);
	
	@InheritInverseConfiguration
	@Mapping(target = "phones", ignore = true)
	UsersEntity toUserEntity(User user);

}
