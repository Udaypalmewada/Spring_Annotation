package com.annotation.testxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
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
