package com.learnrest.Lesson03_PostgresJDBC;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employees")
public class EmployeeResource {
	
	EmployeeRepository repo = new EmployeeRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Employee> getEmployees() {
		return repo.getEmployees();
		
	}
	
	
	@GET
	@Path("employee/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Employee getEmployee(@PathParam("id") int id) {
		return repo.getEmployee(id);
		
	}
	
	@POST
	@Path("employee")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Employee createEmployee(Employee e) {
		repo.createEmployee(e);
		return e;
	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Employee updateEmployee(Employee e) {
		repo.updateEmployee(e);
		return e;
	}
	
	

}
