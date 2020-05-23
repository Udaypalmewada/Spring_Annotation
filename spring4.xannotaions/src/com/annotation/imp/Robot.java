package com.annotation.imp;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {
	
	@Autowired
	private Chip chip;

	
	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}
	

}
