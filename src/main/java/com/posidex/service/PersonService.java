package com.posidex.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.posidex.model.OutPutData;
import com.posidex.model.Person;
import com.posidex.model.SendOutputResponseType;
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
@Path("/other")
public String  AnotherMethod(String str) {
	System.out.println("Inside other method==="+str);
	return new String("Success");
}



@POST
@Path("/response")
public void   getResponseFromClientToServer(SendOutputResponseType outputResponse) {
	SendOutputResponseType outputRes=outputResponse;
	
	List<OutPutData> data=new ArrayList<OutPutData>();
	data=outputRes.getOUTPUTDATA();
	
	for(OutPutData dataDetails:data) {

	System.out.println("Inside response method==="+dataDetails.getCustidPart5());
	}
	
	
	//return outputResponse;
}



@POST
@Path("/add")	
public ReturnResponse  addPerson(Person newPer) {
	
	
	
	
	//ResponseEntity<HttpStatus> response = resttemplate.postForEntity("http://localhost:8080/com.posidex.RestAPI/person/add", p, HttpStatus.class);
	//System.out.println("Inside addPerson=="+response);
	
	
	ReturnResponse ReturnResponse = new ReturnResponse();
	System.out.println("Hello=="+newPer);
	persons.put(newPer.getId(),newPer);
	
	if(persons.get(newPer.getId()) != null){
		ReturnResponse.setFlag(false);
		ReturnResponse.setMsg("Person Already Exists");
		return ReturnResponse;
	}
	
	System.out.println(newPer);
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
