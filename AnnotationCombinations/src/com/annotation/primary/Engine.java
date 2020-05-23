package com.annotation.primary;

import org.springframework.stereotype.Component;


public class Engine {
	
private int id;
private String name;
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Engine [id=" + id + ", name=" + name + "]";
}

}
