package com.nisum.application.users.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.nisum.application.users.domian.Phone;
import com.nisum.application.users.persistence.entity.PhonesEntity;

@Mapper(componentModel = "spring")
public interface PhoneMapper {
	@Mappings({
		@Mapping(source = "id", target = "id"),
		@Mapping(source = "users_id", target = "users_id"),
		@Mapping(source = "number", target = "number"),
		@Mapping(source = "citycode", target = "citycode"),
		@Mapping(source = "contrycode", target = "contrycode")
	})
	Phone toPhone(PhonesEntity phonesEntity);
	List<Phone> toPhones(List<PhonesEntity> phonesEntitys);
	
	@InheritInverseConfiguration
	PhonesEntity toPhonesEntity(Phone phone);

}
