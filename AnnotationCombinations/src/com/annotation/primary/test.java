package com.annotation.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {

	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext("com.annotation.primary");
	Car car=context.getBean("car", Car.class);
	System.out.println(car);
	
	}

}
