package com.Spring_Dependency_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Spring_Dependency_Injection.config.AppConfig;
import com.Spring_Dependency_Injection.controller.MessageController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       MessageController obje=(MessageController) context.getBean(MessageController.class);
       obje.sentMessage1();
    }
}
