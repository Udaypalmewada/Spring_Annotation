package com.annotation.primary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com\\annotation\\primary\\chip.properties")
public class PrimaryJavaconfig {
	@Autowired
	private Environment env;
	@Bean
	@Primary
	public Chip chip1()
	{
		Chip chip=null;
		chip=new Chip();
		chip.setChipId(Integer.parseInt(env.getProperty("chipId")));
		chip.setChipType(env.getProperty("chipType"));
		return chip;
	}
	@Bean
	public Chip chip2()
	{
		Chip chip=null;
		chip=new Chip();
		chip.setChipId(Integer.parseInt(env.getProperty("chipId")));
		chip.setChipType(env.getProperty("chipType"));
		return chip;
	}


}
