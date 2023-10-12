package com.Bean_Factory_Interface;

public class HelloWorldBeanFactroy {
	
	private String message;
	
	public void setMessage(String message) {
		this.message=message;
	}
	
	public void getMessage() {
		System.out.println("My Message:"  +message);
	}

}
