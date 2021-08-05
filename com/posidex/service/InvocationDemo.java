package com.posidex.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class InvocationDemo {

	public static void main(String[] args) {
		InvocationDemo invocation=new InvocationDemo();
		invocation.prepareRequestForMessage(2015);
		

	}
public void prepareRequestForMessage(int year) {
	Client client=ClientBuilder.newClient();
	
	
}
}
