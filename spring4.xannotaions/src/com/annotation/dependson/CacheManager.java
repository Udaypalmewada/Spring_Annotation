package com.annotation.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
public class CacheManager {

	public CacheManager() {
		System.out.println("cachemanager");
	}
	
	

}
