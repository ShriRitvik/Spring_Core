package com.Qulifier.Annotation.services;

import org.springframework.stereotype.Component;

@Component
public class EmailServices implements MessageServices{

	@Override
	public void message(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

}
