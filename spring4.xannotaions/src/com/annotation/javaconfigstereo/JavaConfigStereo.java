package com.annotation.javaconfigstereo;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigStereo {
	@Bean(autowire=Autowire.BY_NAME)
	public Bike bike()
	{
		return new Bike();
	}
}
