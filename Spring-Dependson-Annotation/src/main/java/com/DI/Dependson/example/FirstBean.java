package com.DI.Dependson.example;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
	
	public FirstBean() {
		System.out.println("I AM FIRST BEAN");
	}
	
	@Autowired
	public SecondBean secondBean;
	
	
	@Autowired
	public ThirdBean thirdBean;
	
	
	public void displayBeans() {
		secondBean.display();
		thirdBean.display();
	}

}
