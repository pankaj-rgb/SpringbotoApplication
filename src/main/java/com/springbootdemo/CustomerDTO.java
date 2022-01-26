package com.springbootdemo;

import javax.validation.constraints.NotNull;

public class CustomerDTO {

	@NotNull
	private String name;
	@NotNull(message="value should not be null")
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
