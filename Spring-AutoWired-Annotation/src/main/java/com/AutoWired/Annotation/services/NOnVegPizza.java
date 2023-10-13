package com.AutoWired.Annotation.services;

import org.springframework.stereotype.Component;

@Component
public class NOnVegPizza implements Pizza{

	@Override
	public String getPizza() {
		// TODO Auto-generated method stub
		return "I AM NON VEGPIZA";
	}

}
