package com.annotation.xmltoannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com\\annotation\\xmltoannotation\\game.properties")
public class Joystick {
	@Value("${id}")
	private int id;
	@Value("${gameName}")
	private String gameName;
	@Override
	public String toString() {
		return "Joystick [id=" + id + ", gameName=" + gameName + "]";
	}
	
	
	

}
