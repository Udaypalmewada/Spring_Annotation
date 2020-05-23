package com.annotation.xmltoannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmltoannontationTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com\\annotation\\xmltoannotation\\xmltoannotation.xml");
		Game game=context.getBean("game", Game.class);
		System.out.println(game);
	}

}
