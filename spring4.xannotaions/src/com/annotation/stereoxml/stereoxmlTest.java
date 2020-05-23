package com.annotation.stereoxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class stereoxmlTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\annotation\\stereoxml\\stereoxml-beans.xml");
		Motor motor=context.getBean("motor",Motor.class);
		System.out.println(motor);
	}
}
