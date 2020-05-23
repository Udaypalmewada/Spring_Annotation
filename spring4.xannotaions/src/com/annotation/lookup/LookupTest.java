package com.annotation.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com\\annotation\\lookup");
		Container container=context.getBean("container", Container.class);
		container.receive("anil");
		container.receive("kumar");
		container.receive("prabha");
	
	
	}

}
