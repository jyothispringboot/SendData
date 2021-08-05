package com.posidex.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.posidex.model.Person;

public class PostServiceMainMethod {

	public static void main(String[] args) {

		Client client=ClientBuilder.newClient();
		WebTarget baseTarget=client.target("http://localhost:8080/coom.posidex.RestAPI/"); 
		
		WebTarget messageTarget=baseTarget.path("sendObject");
		//WebTarget singleMessageTarget=messageTarget.path("id");
		
		Person person=new Person("hello",33,56);
		
		Response postResponse=messageTarget.request().post(Entity.json(person));
		System.out.println("hello=="+postResponse);
//		if(postResponse.getStatus()!=201)
//			System.out.println("Error");
		

	}

}
