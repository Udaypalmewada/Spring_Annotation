package com.annotation.stereojavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoJavaTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com\\annotation\\stereojavaconfig");
		Bike bike=context.getBean("bike", Bike.class);
		System.out.println(bike);
		
	
	
	}

}
