package com.annotatin.stanotaibl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StrTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com\\annotatin\\stanotaibl");
		
		((ConfigurableApplicationContext)context).registerShutdownHook();
		Calculate calculate=context.getBean("calculate", Calculate.class);
		System.out.println(calculate);
	
	
	}

}
