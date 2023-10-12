package com.Java_Based_Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * STEP 3
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	// create a Spring container object using AnnotationConfigApplicationContext 
    	//implementation class of the ApplicationContext interface:
    	
        AnnotationConfigApplicationContext contex
                                       =new AnnotationConfigApplicationContext(AppConfig.class);
        
        
        /*
         * Retrieve Beans from Spring Container
       ApplicationContext interface provides the getBean() method 
                                  to retrieve the bean from the Spring container.
                                  
                                    */
        
        HelloWorld obj=(HelloWorld) contex.getBean("helloWorldBean") ;
        obj.getMessage();
        contex.close();
        
    }
}
