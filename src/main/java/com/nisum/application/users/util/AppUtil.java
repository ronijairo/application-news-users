package com.nisum.application.users.util;

import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class AppUtil {
	
	public static boolean validatePassword(String password) {
		String pattern = "(?=.*\\d{2,})(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";
		return password.matches(pattern);
	}


	public static boolean isValidEmailId(String email) {
		String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static String generateId(){
		return java.util.UUID.randomUUID().toString();
	}

	public static Date getDateSystem(){
		return new Date();
	}


	public static String Token;

	public static String getToken() {
		return Token;
	}

	public static void setToken(String token) {
		Token = token;
	}
}
