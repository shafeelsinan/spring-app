package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	public static final long serialVersionUID = 1l;
	
	public ResourceNotFoundException(String messege)
	{
		super(messege);
	}
}

