package com.learnrest.Lesson02_MockDatabase;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employees")
public class EmployeeResource {
	
	EmployeeRepository repo = new EmployeeRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getEmployees() {
		System.out.println("getEmplooyees getting called...");
		
		return repo.getEmployees();
	}
	
	@POST
	@Path("employee")
	public Employee createEmployee(Employee e1) {
		System.out.println("Creating employee: " + e1);
		
		
		return e1;
	}

}
