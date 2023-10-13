package com.Qulifier.Annotation;

import org.springframework.boot.SpringApplication;


/*
 * The @Qualifier annotation is used in conjunction with @Autowired to avoid confusion 
 * when we have two or more beans configured for the same type.
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Qulifier.Annotation.controller.MessageController;
import com.Qulifier.Annotation.services.MessageServices;

@SpringBootApplication
public class SpringQulifierAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringQulifierAnnotationApplication.class, args);
		MessageController obj=context.getBean(MessageController.class);
		obj.processMsg("hi hello");
	}

}
