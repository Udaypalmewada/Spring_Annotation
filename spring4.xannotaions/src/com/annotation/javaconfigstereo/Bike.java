package com.annotation.javaconfigstereo;

public class Bike {
	private Tank tank;

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	@Override
	public String toString() {
		return "Bike [tank=" + tank + "]";
	}
	

}
