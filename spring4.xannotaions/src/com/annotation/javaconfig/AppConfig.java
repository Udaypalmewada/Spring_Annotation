package com.annotation.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(autowire=Autowire.BY_NAME)
	public Robot robot()
	{
		return new Robot();
	}
	@Bean
	public Chip chip()
	{
		Chip chip=new Chip();
		chip.setChipNo(101);
		chip.setChipName("automatic");
		return chip;
	}
	

}
