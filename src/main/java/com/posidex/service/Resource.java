package com.posidex.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.posidex.model.OutPutData;
import com.posidex.model.Person;
import com.posidex.model.SendOutputResponseType;

//import com.sun.jersey.spi.resource.Singleton;

//import org.springframework.http.MediaType;

@Path("/resource")
@Singleton
public class Resource {
	
	private int count;
	
	Person newPerson=new Person();
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(Person p) {
		newPerson=p;
		System.out.println(p);
		return newPerson;
	}
	
	@Path("/get")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMsg() {
		count++;
		return "Hello You r calling getMsg through REstAPI---"+newPerson;
	}
	
	@GET
	 @Path("/response")
	 @Produces(MediaType.APPLICATION_JSON)
	 public synchronized SendOutputResponseType sendResponse() {
		 SendOutputResponseType outputResponseType=new SendOutputResponseType();
		 OutPutData outputData=new OutPutData();
		 List<OutPutData> resData=new ArrayList<OutPutData>();
		 outputData.setCustidPart5("VP_31432145");	
		 outputData.setStatus("C");
		 outputData.setFlag1("I");
		 resData.add(outputData);
		 outputResponseType.setOUTPUTDATA(resData);		 
		 return outputResponseType;
		
		 
	 }
	 

}
