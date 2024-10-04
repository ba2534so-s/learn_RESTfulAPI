package com.learnrest.Lesson01_FirstRESTfulJerseyProject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("employees")
public class EmployeeResource {
	
	
	@GET
	public Employee getEmployee() {
		System.out.println("getEmployee is called.");
		
		Employee e = new Employee();
		e.setName("Mary Jane Johnson");
		e.setSalary(37000);
		
		return e;
	}

}
