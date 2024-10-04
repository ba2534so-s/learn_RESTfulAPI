package com.learnrest.Lesson01_FirstRESTfulJerseyProject;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employeeList")
public class EmployeeListResource {
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getEmployees() {
		
		Employee e1 = new Employee();
		e1.setName("Mary Jane Johnson");
		e1.setSalary(42000);
		
		Employee e2 = new Employee();
		e2.setName("John Smith");
		
	}

}
