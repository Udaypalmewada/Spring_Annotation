package com.annotation.xmlan;

import org.springframework.stereotype.Component;

@Component
public class Tank {
private int capacity;
private String fule;
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public void setFule(String fule) {
	this.fule = fule;
}

}
