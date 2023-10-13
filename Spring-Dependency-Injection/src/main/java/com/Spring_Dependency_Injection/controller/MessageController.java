package com.Spring_Dependency_Injection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Spring_Dependency_Injection.services.Message;

@Component 
public class MessageController {
	
	private Message message;

	
	//constructor
	@Autowired
	public MessageController(Message message) {
		super();
		this.message = message;
	}
	
	
	public void sentMessage1() {
		message.sentMessage();
	}
	


}
