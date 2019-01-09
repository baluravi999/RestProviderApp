package com.app;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/form")
public class Customer {

	@POST
	@Path("/data")
	public String getReg (@FormParam("fName")String first,
			               @FormParam("lName")String last,
			               @FormParam("email")String email,
			               @FormParam("password")String password){
		
		
		
		
		return "Customer Datailes is:<br> "+
		         " First Name: "+first+"<br>"+
		         " Last Name: "+last+"<br>"+
		         " Email ID :"+email+"<br>"+
		         " Password :"+password;
                       
	}
	
}
