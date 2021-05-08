package com.ecommerce.test;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UserNotFoundException extends  RuntimeException {

	

	public UserNotFoundException(String message) {
		super(message);
	}

	

	
		
	
	

}
