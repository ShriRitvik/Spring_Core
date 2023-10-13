package com.DI.Dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class AppConfig {

	@Bean
	@DependsOn(value = { "login", "logout" })
	public Account account() {
		return new Account();
	}

	@Bean
	public LoginIn login() {
		return new LoginIn();
	}

	@Bean
	public LogOut logout() {
		return new LogOut();
	}

}
