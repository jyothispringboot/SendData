package com.posidex.main;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.posidex.model.Person;

public class ClientCall {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("CAP");
		p.setAge(55);
		p.setId(67);
		
		
		Client client=ClientBuilder.newClient();
		WebTarget baseTarget=client.target("http://localhost:8080/coom.posidex.RestAPI/person"); 
		
		WebTarget messageTarget=baseTarget.path("person");
		//WebTarget singleMessageTarget=messageTarget.path("id");
		
		Person person=new Person("hello",33,56);
		
		Response postResponse=baseTarget.request().post(Entity.json(person));
		System.out.println("hello=="+p);
		if(postResponse.getStatus()!=201)
			System.out.println("Error");
		
		
		
		
		
		//		RestTemplate restTemplate=new RestTemplate();
//		String url="http://localhost:8080/com.posidex.RestAPI/person";
//		
//		//RestTemplate restTemplate = new RestTemplate();
//		//String uri = "http://localhost:8080/spring-rest/data/exchange/{id}";
//	        HttpHeaders headers = new HttpHeaders();
//	        headers.setContentType(MediaType.APPLICATION_JSON);
//	        HttpEntity<String> entity = new HttpEntity<String>("Hello World!", headers);
//	        ResponseEntity<Person> personEntity = restTemplate.exchange(url, HttpMethod.GET, entity, Person.class, 100);
//	        System.out.println("ID:"+personEntity.getBody().getId());
//	        System.out.println("Name:"+personEntity.getBody().getName());
//	    //    System.out.println("Village:"+personEntity.getBody().getAddress().getVillage());


	}

}
