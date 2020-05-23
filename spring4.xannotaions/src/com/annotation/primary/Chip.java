package com.annotation.primary;

public class Chip {
	
	private int chipId;

	private String chipType;
	
	public int getChipId() {
		return chipId;
	}

	public void setChipId(int chipId) {
		this.chipId = chipId;
	}

	public String getChipType() {
		return chipType;
	}

	public void setChipType(String chipType) {
		this.chipType = chipType;
	}

	@Override
	public String toString() {
		return "Chip [chipId=" + chipId + ", chipType=" + chipType + "]";
	}
	
}
