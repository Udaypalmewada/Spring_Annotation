package com.annotation.lookupjavaconfig;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;


public class Container {
	public void receive(String data)
	{
		RequestHandler handler=null;
		handler=lookupRequestHandler();
		handler.setData(data);
		handler.process();
	}
	
	public RequestHandler lookupRequestHandler()
	{
		return null;
	}

}
