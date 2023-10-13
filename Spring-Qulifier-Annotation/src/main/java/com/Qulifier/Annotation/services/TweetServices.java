package com.Qulifier.Annotation.services;

import org.springframework.stereotype.Component;

@Component
public class TweetServices implements MessageServices {

	@Override
	public void message(String message) {
		System.out.println(message);
		System.out.println("i am tweeter");
		
	}

}
