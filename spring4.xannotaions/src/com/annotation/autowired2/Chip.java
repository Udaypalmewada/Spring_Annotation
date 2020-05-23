package com.annotation.autowired2;

public class Chip {
	private int chipno;
	private String chipName;
	public int getChipno() {
		return chipno;
	}
	public void setChipno(int chipno) {
		this.chipno = chipno;
	}
	public String getChipName() {
		return chipName;
	}
	public void setChipName(String chipName) {
		this.chipName = chipName;
	}
	@Override
	public String toString() {
		return "Chip [chipno=" + chipno + ", chipName=" + chipName + "]";
	}
	
	

}
