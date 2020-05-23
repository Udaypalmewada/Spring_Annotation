package com.annotation.imp;

import org.springframework.context.annotation.Bean;

public class ChipConfig {
	@Bean
	public Chip chip()
	{
		Chip chip=new Chip();
		chip.setChipNo(101);
		chip.setChipName("automatic");
		return chip;
	}
	
}
