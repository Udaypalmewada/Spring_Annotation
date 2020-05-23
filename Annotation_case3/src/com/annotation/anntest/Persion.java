package com.annotation.anntest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan
public class Persion {
	@Value("10")
private int id;
	@Value("uday")
private String name;
	@Value("23")
private int age;
	@Override
	public String toString() {
		return "Persion [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
