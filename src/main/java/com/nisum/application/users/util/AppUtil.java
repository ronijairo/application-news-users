package com.nisum.application.users.util;

import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AppUtil {
	
	public static boolean validatePassword(String password) {
		String pattern = "(?=.*\\d{2,})(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
		return password.matches(pattern);
	}
	
	public static boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("[A-Za-z]+@[a-z]+\\.([a-z])+");
		Matcher matcher= pattern.matcher(email);
		return matcher.find();
	}

	public static String generateId(){
		return java.util.UUID.randomUUID().toString();
	}

	public static Date getDateSystem(){
		return new Date();
	}
	

}
