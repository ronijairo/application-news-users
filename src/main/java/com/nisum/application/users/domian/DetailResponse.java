package com.nisum.application.users.domian;

public class DetailResponse<x> {
	
	private long code;
	private String message;
	private x data;
	
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public x getData() {
		return data;
	}
	public void setData(x data) {
		this.data = data;
	}
	
	
	

}
