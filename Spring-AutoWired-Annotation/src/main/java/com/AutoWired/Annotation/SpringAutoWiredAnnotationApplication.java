package com.AutoWired.Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.AutoWired.Annotation.Controller.PizzaController;

@SpringBootApplication
public class SpringAutoWiredAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringAutoWiredAnnotationApplication.class, args);
		PizzaController objController=context.getBean(PizzaController.class);
		System.out.println(objController.getPizza());
	}

}
