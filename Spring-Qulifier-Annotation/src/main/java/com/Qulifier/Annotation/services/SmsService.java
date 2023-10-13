package com.Qulifier.Annotation.services;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageServices {

	@Override
	public void message(String message) {
		System.out.println(message);
		
	}

}
