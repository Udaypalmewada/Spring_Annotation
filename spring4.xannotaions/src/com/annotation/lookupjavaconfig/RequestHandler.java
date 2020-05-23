package com.annotation.lookupjavaconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class RequestHandler {
	private String data;
	public void process()
	{
		System.out.println("process data"+data+"hashcode is:"+this.hashCode());
	}
	public void setData(String data) {
		this.data = data;
	}
	

}
