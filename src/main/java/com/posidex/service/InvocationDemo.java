package com.posidex.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import com.posidex.model.Person;

public class InvocationDemo {

	public static void main(String[] args) {
		InvocationDemo invocation=new InvocationDemo();
		invocation.prepareRequestForMessage(2015);
		
		

	}
public void prepareRequestForMessage(int year) {
	Client client=ClientBuilder.newClient();
	
	WebTarget baseTarget=client.target("http://localhost:8080/coom.posidex.RestAPI/resource"); 
	Person person=new Person("hello",33,56);
	
	Response postResponse=baseTarget.request().post(Entity.json(person));
	System.out.println("Hi.....");
	
}
}
