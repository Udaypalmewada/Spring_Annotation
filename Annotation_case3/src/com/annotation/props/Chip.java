package com.annotation.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Chip {
	@Value("#{props.id}")
private int id;
	@Value("#{props.type}")
private String type;
	@Override
	public String toString() {
		return "Chip [id=" + id + ", type=" + type + "]";
	}
	
}
