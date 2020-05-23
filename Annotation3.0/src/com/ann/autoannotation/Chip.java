package com.ann.autoannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Chip {
	@Value("10")
private int id;
	@Value("weather")
private String type;

@Override
public String toString() {
	return "Chip [id=" + id + ", type=" + type + "]";
}

}
