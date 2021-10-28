package com.nisum.application.users.domian;

public class Phone {
	private String id;
	private String users_id;
	private String number;
	private Integer citycode;
	private Integer contrycode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsers_id() {
		return users_id;
	}
	public void setUsers_id(String users_id) {
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
