package com.lt.crs.exception;

public class UserDetailsNotFoundException extends RuntimeException {

	public UserDetailsNotFoundException(String string) {
		System.out.println(string);
	}

}
