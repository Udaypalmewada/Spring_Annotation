package com.ann.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireTest {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/ann/autowiring/application-context.xml");
Robot robot=context.getBean("robot", Robot.class);
System.out.println(robot);
	}

}
