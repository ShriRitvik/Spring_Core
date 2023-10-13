package com.DI.Dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *The @DependsOn annotation can force the Spring IoC container
 *  to initialize one or more beans before the bean which is annotated by @DependsOn annotation.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       Account bean=context.getBean(Account.class);
       bean.populateDisplay();
    }
}
