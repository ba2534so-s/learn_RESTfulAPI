package com.learnrest;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeResource {
	
	EmployeeResource repo;
	
	@GetMapping("employees")
	public List<Employee> getEmployees() {
		
		List<Employee> employees = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setEmployeeId(1);
		e1.setName("Mary Jane Johnson");
		e1.setSalary(42000);
		
		Employee e2 = new Employee();
		e2.setEmployeeId(2);
		e2.setName("John Smith");
		e2.setSalary(37000);
		
		employees.add(e1);
		employees.add(e2);
		
		return employees;
		
	}

}
