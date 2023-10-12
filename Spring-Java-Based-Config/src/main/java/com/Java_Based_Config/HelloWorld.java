package com.Java_Based_Config;


/*
 * STEP :1
  What is a Spring Bean?
   This is a very simple question that is often overcomplicated. Usually, 
Spring beans are Java objects that are managed by the Spring container.

 */

public class HelloWorld {

	private String message;

	public String getMessage() {
		System.out.println("My Message : " + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
