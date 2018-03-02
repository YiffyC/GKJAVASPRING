package com.wha.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// Sets the active profiles
		context.getEnvironment().setActiveProfiles("Developement");
		//Scans the mentioned packaged and registers all the @Components available to Spring
		context.scan("com.wha.spring");
		context.refresh();
		context.close();
	}

}
