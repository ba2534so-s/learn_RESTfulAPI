package com.learnrest.Lesson01_FirstRESTfulJerseyProject;

import jakarta.ws.rs.Path;

@Path("employees")
public class EmployeeResource {
	
	public getEmployee() {
		
		Employee e = new Employee();
		e.setName("Mary Jane Johnson");
		e.setSalary(37000);
	}

}
