package com.nisum.application.users.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="phones")
public class PhonesEntity implements Serializable {

	private static final long serialVersionUID = 8336276381379130448L;
	
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	private String id;
	@Column(name = "users_id", updatable = false, nullable = false)
	private Long users_id;
	private String number;
	private Integer citycode;
	private Integer contrycode;
	
	
	public PhonesEntity() {}
	
	public PhonesEntity(String id, Long users_id, String number, Integer citycode, Integer contrycode) {
		super();
		this.id = id;
		this.users_id = users_id;
		this.number = number;
		this.citycode = citycode;
		this.contrycode = contrycode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
