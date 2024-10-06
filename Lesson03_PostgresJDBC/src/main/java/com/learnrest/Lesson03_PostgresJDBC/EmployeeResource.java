package com.learnrest.Lesson03_PostgresJDBC;

import java.util.List;

import jakarta.ws.rs.Path;

@Path("employees")
public class EmployeeResource {
	
	EmployeeRepository repo = new EmployeeRepository();
	
	
	public List<Employee> getEmployees() {
		
	}
	
	

}
