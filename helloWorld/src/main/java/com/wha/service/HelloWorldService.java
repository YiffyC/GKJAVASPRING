package com.wha.service;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorldService
{
	private String name;


	
	//getset
	public String sayHello() {
		return "Hello " + name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
