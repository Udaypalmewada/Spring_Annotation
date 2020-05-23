package com.annotation.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {
	private Chip chip;

	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}
	
	
	
}
