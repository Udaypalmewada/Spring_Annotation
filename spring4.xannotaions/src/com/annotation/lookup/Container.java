package com.annotation.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Container {
	public void receive(String data)
	{
		RequestHandler handler=null;
		handler=lookupRequestHandler();
		handler.setData(data);
		handler.process();
	}
	@Lookup
	public RequestHandler lookupRequestHandler()
	{
		return null;
	}

}
