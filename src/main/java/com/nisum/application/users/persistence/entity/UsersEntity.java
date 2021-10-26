package com.nisum.application.users.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class UsersEntity implements Serializable {

	private static final long serialVersionUID = 7616485375821505100L;
	
	private String id;
	private String name;
	private String email;
	private String password;
	private List<PhonesEntity> phones;
	private Date created;
	private Date modified;
	private Date lastLogin;
	private String token;
	private boolean isactive;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<PhonesEntity> getPhones() {
		return phones;
	}
	public void setPhones(List<PhonesEntity> phones) {
		this.phones = phones;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	
	
	

}
