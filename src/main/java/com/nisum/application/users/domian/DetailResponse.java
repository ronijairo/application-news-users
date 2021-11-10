package com.nisum.application.users.domian;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailResponse<x> {
	
	private long code;
	private String message;
	private x data;
}
