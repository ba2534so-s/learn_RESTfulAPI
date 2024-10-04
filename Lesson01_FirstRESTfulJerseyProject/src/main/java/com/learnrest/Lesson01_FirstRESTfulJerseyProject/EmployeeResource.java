package com.learnrest.Lesson01_FirstRESTfulJerseyProject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource {
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee() {
		System.out.println("getEmployee is called.");
		
		Employee e = new Employee();
		e.setName("Mary Jane Johnson");
		e.setSalary(37000);
		
		return e;
	}

}
