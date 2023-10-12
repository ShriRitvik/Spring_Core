package com.XML_Based_Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorldXML obj=(HelloWorldXML) context.getBean("helloWorldXML");
		obj.getMessage();
		
	}
}
