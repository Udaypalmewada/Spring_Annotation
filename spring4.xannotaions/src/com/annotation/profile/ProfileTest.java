package com.annotation.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

public class ProfileTest {

	public static void main(String[] args) {
System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "test");
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		 DataSource dataSource=applicationContext.getBean("dataSource", DataSource.class);
		 System.out.println(dataSource);
	}

}
