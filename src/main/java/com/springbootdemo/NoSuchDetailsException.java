package com.springbootdemo;

public class NoSuchDetailsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NoSuchDetailsException() {
		super();
	}
	public NoSuchDetailsException(String errors)
	{
		super(errors);
	}
}
