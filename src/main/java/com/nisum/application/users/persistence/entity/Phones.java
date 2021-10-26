package com.nisum.application.users.persistence.entity;

import java.io.Serializable;

public class Phones implements Serializable {
	


	private static final long serialVersionUID = 8336276381379130448L;
	
	private Long id;
	private Long users_id;
	
	private String number;
	private Integer citycode;
	private Integer contrycode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUsers_id() {
		return users_id;
	}
	public void setUsers_id(Long users_id) {
		this.users_id = users_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Integer getCitycode() {
		return citycode;
	}
	public void setCitycode(Integer citycode) {
		this.citycode = citycode;
	}
	public Integer getContrycode() {
		return contrycode;
	}
	public void setContrycode(Integer contrycode) {
		this.contrycode = contrycode;
	}
	
	

}
