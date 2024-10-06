package com.learnrest.Lesson03_PostgresJDBC;

import jakarta.ws.rs.Path;

@Path("employees")
public class EmployeeResource {
	
	EmployeeRepository repo = new EmployeeRepository();

}
