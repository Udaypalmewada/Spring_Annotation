package com.annotation.autowired2;

public class Sensor {
	private int id;
	private String sensorName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	@Override
	public String toString() {
		return "Sensor [id=" + id + ", sensorName=" + sensorName + "]";
	}
	

}
