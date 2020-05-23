package com.annotation.javaconfig;

public class Chip {
	private int chipNo;
	private String chipName;
	public int getChipNo() {
		return chipNo;
	}
	public void setChipNo(int chipNo) {
		this.chipNo = chipNo;
	}
	public String getChipName() {
		return chipName;
	}
	public void setChipName(String chipName) {
		this.chipName = chipName;
	}
	@Override
	public String toString() {
		return "Chip [chipNo=" + chipNo + ", chipName=" + chipName + "]";
	}
	

}
