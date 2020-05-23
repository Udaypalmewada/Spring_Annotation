package com.annotation.stereojavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Bike {
	@Autowired
	private Tank tank;

	@Override
	public String toString() {
		return "Bike [tank=" + tank + "]";
	}
	
	

}
