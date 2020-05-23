package com.annotation.autowired2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {
	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("com\\annotation\\autowired\\autowired-beans.xml");
	Robot robot=context.getBean("robot", Robot.class);
	System.out.println(robot);
	}
}
