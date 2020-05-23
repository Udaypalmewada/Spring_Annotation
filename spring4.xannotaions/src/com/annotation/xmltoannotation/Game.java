package com.annotation.xmltoannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Game {
	@Autowired
	private Joystick joystick;
	@Override
	public String toString() {
		return "Game [joystick=" + joystick + "]";
	}
}
