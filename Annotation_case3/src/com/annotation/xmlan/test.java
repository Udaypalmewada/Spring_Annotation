package com.annotation.xmlan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("com.annotation.xmlan");

Motor motor=context.getBean("motor", Motor.class);
System.out.println(motor);
	}
}
