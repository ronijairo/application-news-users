package com.nisum.application.users.domian;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class User {
	
	private String id;
	private String name;
	private String email;
	private String password;
	private List<Phone> phones;
	private Date created;
	private Date modified;
	private Date lastLogin;
	private String token;
	private boolean isactive;

}
