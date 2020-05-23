package com.annotation.javabl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com/annotation/javabl");
		((ConfigurableApplicationContext)context).registerShutdownHook();
		Calculate calculate=context.getBean("calculate", Calculate.class);
		System.out.println(calculate);
	}

}
