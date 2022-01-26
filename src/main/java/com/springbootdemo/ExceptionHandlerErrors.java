package com.springbootdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerErrors {
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler(Exception ex)
	{
		return ex.getMessage();
	}
	
	@ExceptionHandler(NoSuchDetailsException.class)
	public ResponseEntity<ErrorMessages> exceptionHandler2(NoSuchDetailsException ex)
	{
		ErrorMessages e=new ErrorMessages();
		e.setErrorCode(HttpStatus.BAD_REQUEST.value());
		e.setErrorMessage(ex.getMessage());
		return new ResponseEntity<ErrorMessages>(e,HttpStatus.OK);
		
	}

}
