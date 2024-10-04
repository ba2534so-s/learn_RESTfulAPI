package com.learnrest.Lesson01_FirstRESTfulJerseyProject;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("employeeList")
public class EmployeeListResource {
	
	
	@GET
	public List<Employee> getEmployees() {
		
	}

}
