package com.annotation.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/annotation/inject/application-context.xml");
	
	Robot robot=context.getBean("robot", Robot.class);
	System.out.println(robot);
	}

}
