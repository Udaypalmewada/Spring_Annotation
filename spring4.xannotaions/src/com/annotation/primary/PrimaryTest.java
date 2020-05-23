package com.annotation.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.annotation.primary");
	
		Robot robot=context.getBean("robot", Robot.class);
		System.out.println(robot);
	}

}
