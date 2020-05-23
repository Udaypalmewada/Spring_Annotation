package com.ann.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Chip {
	@Value("10")
	//@Value(${"id"})
private int id;
	@Value("weather")
//@Value("$ {type}")
private String type;

@Override
public String toString() {
	return "Chip [id=" + id + ", type=" + type + "]";
}

}
