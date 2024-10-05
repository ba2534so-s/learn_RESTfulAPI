package com.learnrest.Lesson02_MockDatabase;

import java.util.List;

import jakarta.ws.rs.Path;

@Path("employees")
public class EmployeeResource {
	
	EmployeeRepository repo = new EmployeeRepository();
	
	public List<Employee> getEmployees() {
		System.out.println("getEmplooyees getting called...");
		
		return repo.getEmployees();
	}

}
