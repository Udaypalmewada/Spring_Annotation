package com.annotaion.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext("com\\annotaion\\stereotype");
		Motor motor=applicationContext.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}
