package com.annotation.javabl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
@Configuration
@PropertySource("classpath:com\\annotation\\javabl\\calculate.properties")
public class javaLcConfig {
	@Autowired
	private Environment env;
	

	int a=0;
	int b=0;
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public Calculate calculate()
	{
		a=Integer.parseInt(env.getProperty("a"));
		b=Integer.parseInt(env.getProperty("b"));
		Calculate calculate=null;
		calculate=new Calculate();
		calculate.setA(a);
		calculate.setB(b);
		return calculate;
	}

}
