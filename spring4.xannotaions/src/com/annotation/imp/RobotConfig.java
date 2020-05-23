package com.annotation.imp;

import org.springframework.context.annotation.Bean;

public class RobotConfig {
	@Bean
	public Robot robot()
	{
		return new Robot();
	}
	
}
