package com.DI.Dependson.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				          new AnnotationConfigApplicationContext(AppConfigrution.class);
		FirstBean bean=context.getBean(FirstBean.class);
		bean.displayBeans();
	}

}
