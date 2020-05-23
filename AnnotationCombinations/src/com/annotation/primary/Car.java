package com.annotation.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {
	@Autowired(required=true)
private Engine engine;

@Override
public String toString() {
	return "Car [engine=" + engine + "]";
}

}