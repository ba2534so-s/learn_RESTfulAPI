package com.learnrest;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeResource {
	
	
	public List<Employee> getEmployees() {
		
		Employee e1 = new Employee();
		e1.setName("Mary Jane Johnson");
		e1.setSalary(42000);
		
		Employee e2 = new Employee();
		e2.setName("John Smith");
		e2.setSalary(37000);
		
		List<Employee> employees = Arrays.asList(e1, e2);
		
		return employees;
		
	}

}
