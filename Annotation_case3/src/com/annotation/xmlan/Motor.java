package com.annotation.xmlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class Motor {

private Tank tank;

@Override
public String toString() {
	return "Motor [tank=" + tank + "]";
}
 
}
