package com.Qulifier.Annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Qulifier.Annotation.services.MessageServices;

@Component
public class MessageController {

	private MessageServices messageServices;

	@Autowired
	public MessageController(@Qualifier("tweetServices") MessageServices messageServices) {
		super();
		this.messageServices = messageServices;
	}
	
	public void processMsg(String message) {
        messageServices.message(message);
    }

}
