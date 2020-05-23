package com.annotation.autowired2;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {
	private Chip chip;
	private Sensor sensor;
	
	
	
	
	
		@Autowired
		public Robot(Sensor sensor) {
		super();
		this.sensor = sensor;
	}






		@Override
	public String toString() {
		return "Robot [chip=" + chip + ", sensor=" + sensor + "]";
	}
	

}
