package com.annotation.testxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\annotation\\testxml\\application-context.xml");
Persion persion=context.getBean("persion", Persion.class);
System.out.println(persion);
	}

}
