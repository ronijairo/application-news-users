package com.nisum.application.users.domian;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Phone {
	private String id;
	private String users_id;
	private String number;
	private Integer citycode;
	private Integer contrycode;
}
