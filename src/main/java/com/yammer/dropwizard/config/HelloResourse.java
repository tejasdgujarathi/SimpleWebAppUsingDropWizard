package com.yammer.dropwizard.config;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("hello")
public class HelloResourse {
	
	@GET
	public String wishHello(){
		return "Hello"; 
	}

	@Path("/wishByJson")
	@GET
	@Produces(value = MediaType.APPLICATION_JSON)
	public String wishHelloJson(){
		return "{'wish': 'hello'}"; 
	}

	@Path("/getThisNum/{anyNumber}")
	@POST
	public String wishAsWished(@PathParam("anyNumber") String number){
		return number; 
	}
	
	@Path("/wishAsWished")
	@POST
	@Produces(value = MediaType.APPLICATION_JSON)
	public Wish wishAsWished(@Valid Wish wish){
		return wish; 
	}
	
	
} 