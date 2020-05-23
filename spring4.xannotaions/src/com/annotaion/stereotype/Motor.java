package com.annotaion.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Motor {
	@Autowired
	private Tank tank;

	@Override
	public String toString() {
		return "Motor [tank=" + tank + "]";
	}
	

}
