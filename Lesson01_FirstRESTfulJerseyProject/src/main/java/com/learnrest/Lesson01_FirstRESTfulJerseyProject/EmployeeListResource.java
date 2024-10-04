package com.learnrest.Lesson01_FirstRESTfulJerseyProject;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("employeeList")
public class EmployeeListResource {
	
	
	@GET
	@Produces
	public List<Employee> getEmployees() {
		
	}

}
