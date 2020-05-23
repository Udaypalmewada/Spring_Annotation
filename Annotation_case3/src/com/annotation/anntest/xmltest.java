package com.annotation.anntest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class xmltest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.annotation.anntest");
Persion persion=context.getBean("persion", Persion.class);
System.out.println(persion);
	}

}
