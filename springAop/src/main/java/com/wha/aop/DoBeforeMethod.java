package com.wha.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class DoBeforeMethod implements MethodBeforeAdvice
{
	
	public void before(Method arg0, java.lang.Object[] arg1, java.lang.Object arg2) throws Throwable 
	{
		System.out.println("****SPRING AOP**** DoBeforeMethod : Excecuting before method!");
		
	}
}

