package com.annotation.props;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/annotation/props/application-context.xml");
Robot robot=context.getBean("robot", Robot.class);
System.out.println(robot);
	}

}
