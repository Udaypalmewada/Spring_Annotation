package com.annotation.javaconfigstereo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com\\annotation\\javaconfigstereo\\javaConfigStereo.properties")
public class Tank {
	@Value("121")
	private int tankNo;
	@Value("gass")
	private String fuelType;
	@Override
	public String toString() {
		return "Tank [tankNo=" + tankNo + ", fuelType=" + fuelType + "]";
	}
	

}
