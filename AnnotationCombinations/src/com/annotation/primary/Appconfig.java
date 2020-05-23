package com.annotation.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Appconfig {
	
public Engine engine() {
	Engine engine=null;
	engine=new Engine();
	engine.setId(12);
	engine.setName("suzuki");
	return engine();
}
}
