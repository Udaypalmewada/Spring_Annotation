package com.annotatin.stanotaibl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com\\annotatin\\stanotaibl\\calculate.properties")
public class Calculate {
	
	@Value("10")
	private int a;
	@Value("20")
	private int b;
	private int sum;
	@PostConstruct
	public void init() {
		System.out.println("init method");
		sum=a+b;
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method called");
	}
	@Override
	public String toString() {
		return "Calculate [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}
	

}
