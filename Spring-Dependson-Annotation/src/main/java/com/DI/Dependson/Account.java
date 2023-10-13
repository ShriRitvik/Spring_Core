package com.DI.Dependson;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {

	@Autowired
	public LoginIn loginIn;

	@Autowired
	public LogOut logOut;

	public Account() {
		System.out.println("THIS MY ACCOUNT");
	}

	public void populateDisplay() {
		loginIn.display();
		logOut.display();
	}

}
