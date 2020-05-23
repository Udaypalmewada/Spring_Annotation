package com.annotation.lookupjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotation.lookup.Container;

@Configuration
public class javaLookupconfig {
	@Bean
	public Container container()
	{
		Container container=new Container();
		
		return container;
	}
	@Bean
	public RequestHandler requestHandler()
	{
		RequestHandler handler=null;
		handler=new RequestHandler();
		return handler;
	}

}
