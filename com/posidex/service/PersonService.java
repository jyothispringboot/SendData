package com.posidex.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.posidex.model.Person;
import com.posidex.response.ReturnResponse;

@Path("/person")
//@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_JSON)
public class PersonService {
	
private RestTemplate resttemplate=null;	
private Gson gson=null;
private HttpHeaders headers=null;

private static Map<Integer,Person> persons = new HashMap<Integer,Person>();

@POST
@Path("/add")	
public ReturnResponse  addPerson() {
	Person p=new Person("EEswara1",33,12);
	Person p1=new Person("EEswara2",33,13);
	Person p2=new Person("EEswara23",33,17);
	Person p3=new Person("EEswara4",33,18);
	
	System.out.println("pdata ==="+p);
	
	//ResponseEntity<HttpStatus> response = resttemplate.postForEntity("http://localhost:8080/com.posidex.RestAPI/person/add", p, HttpStatus.class);
	//System.out.println("Inside addPerson=="+response);
	
	
	ReturnResponse ReturnResponse = new ReturnResponse();
	System.out.println("Hello");
	if(persons.get(p.getId()) != null){
		ReturnResponse.setFlag(false);
		ReturnResponse.setMsg("Person Already Exists");
		return ReturnResponse;
	}
	persons.put(p1.getId(),p1);
	persons.put(p2.getId(),p2);
	persons.put(p3.getId(),p3);
	persons.put(p.getId(),p);
	ReturnResponse.setFlag(true);
	ReturnResponse.setMsg("Person created successfully");
	return ReturnResponse;
}
@GET
@Path("/getAll")
public Person[] getAllPersons() {
	//getData();
	Set<Integer> ids = persons.keySet();
	Person[] p = new Person[ids.size()];
	int i=0;
	for(Integer id : ids){
		p[i] = persons.get(id);
		i++;
	}
	return p;
}


}
