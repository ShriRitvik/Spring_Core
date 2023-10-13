package com.AutoWired.Annotation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.AutoWired.Annotation.services.Pizza;

@Component
public class PizzaController {
	
	private Pizza pizza;
//	
//	//VegPizza used as vegPizza
//    @Autowired
//	public PizzaController( @Qualifier("vegPizza")Pizza pizza) {
//		System.out.println("AutoWired Using Constructor");
//		this.pizza=pizza;
		
	//}
    
    
   
   
	
	public String getPizza() {
		return pizza.getPizza();
	}

	 //Setter Injectiom
	 @Autowired
	
	public void setPizza( @Qualifier("vegPizza")Pizza pizza) {
		
		System.out.println("Setter INjection");
		this.pizza = pizza;
	}

}
