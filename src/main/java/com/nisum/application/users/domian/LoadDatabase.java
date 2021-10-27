package com.nisum.application.users.domian;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nisum.application.users.persistence.crud.UserRepository;
import com.nisum.application.users.persistence.entity.PhonesEntity;
import com.nisum.application.users.persistence.entity.UsersEntity;



@Configuration
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	  @Bean
	  CommandLineRunner initDatabase(UserRepository repository) {

	    return args -> {
	    	String id = java.util.UUID.randomUUID().toString();
	    	String uuidPhone = java.util.UUID.randomUUID().toString();
	    	
	    	Date date = new Date();
	    	log.info("uuid :" + id + " Date: "+ date); 
	    	List<PhonesEntity> phones = new ArrayList<PhonesEntity>();
	    	 phones.add(new PhonesEntity(uuidPhone, id,"6674859320",3,2)); 
	 
	      log.info("Preloading " + repository.save(new UsersEntity(id, "Roni Canche","roni@gmail.com","pwd",phones,date,date,date,uuidPhone,true)));
	    };
	  }

}
