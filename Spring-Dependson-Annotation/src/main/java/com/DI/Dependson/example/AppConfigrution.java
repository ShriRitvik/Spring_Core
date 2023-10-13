package com.DI.Dependson.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class AppConfigrution {

	
	@Bean
	@DependsOn(value = {"second","third"})
	public FirstBean firstBean() {
		return new FirstBean();
	}
	
	
	@Bean
	public SecondBean second() {
		return new SecondBean();
	}
	
	@Bean
	public ThirdBean third() {
		return new ThirdBean();
	}

}
