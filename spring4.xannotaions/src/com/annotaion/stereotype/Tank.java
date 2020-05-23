package com.annotaion.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:com\\annotaion\\stereotype\\stereotype.properties")
public class Tank {
	@Value("${id}")
	private int id;
	@Value("${fuelType}")
	private String fuelType;
	@Override
	public String toString() {
		return "Tank [id=" + id + ", fuelType=" + fuelType + "]";
	}
	
	

}
