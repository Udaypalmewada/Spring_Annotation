package com.annotation.stereojavaconfig;

public class Tank {
	private int tankNo;
	private String fuelType;
	public int getTankNo() {
		return tankNo;
	}
	public void setTankNo(int tankNo) {
		this.tankNo = tankNo;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Tank [tankNo=" + tankNo + ", fuelType=" + fuelType + "]";
	}
	

}
