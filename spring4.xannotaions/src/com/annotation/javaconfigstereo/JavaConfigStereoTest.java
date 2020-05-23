package com.annotation.javaconfigstereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigStereoTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com\\annotation\\javaconfigstereo");
		Bike bike=context.getBean("bike", Bike.class);
		System.out.println(bike);
		
	
	}

}
