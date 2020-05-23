package com.annotation.stereojavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StereoJavacfg {
	@Bean
	public Tank tank()
	{
		Tank tank=null;
		tank=new Tank();
		tank.setTankNo(1023);
		tank.setFuelType("disel");
		return tank;
	}

}
