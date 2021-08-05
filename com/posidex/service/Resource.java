package com.posidex.service;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import com.sun.jersey.spi.resource.Singleton;

//import org.springframework.http.MediaType;

@Path("/resource")
@Singleton
public class Resource {
	
	private int count;
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMsg() {
		count++;
		return "Hello You r calling getMsg through REstAPI---"+count;
	}

}
