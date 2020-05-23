package com.annotation.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com\\annotation\\profile\\test.properties")
@Profile("dev")
public class DevCinfig {
	@Autowired
	private Environment environment;
	@Bean(name="dataSource")
	public DataSource dataSource() {
		
		DataSource dataSource=null;
		dataSource=new DataSource();
		
		dataSource.setDriverClassName(environment.getProperty("driverClassName"));
		dataSource.setUrl(environment.getProperty("url"));
		dataSource.setUserName(environment.getProperty("userName"));
		dataSource.setPassword(environment.getProperty("password"));
		
		return dataSource;
	}

}
