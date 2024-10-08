package com.learnrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeResource {
	
	@Autowired
	EmployeeRepository repo;
	
	@GetMapping("employees")
	public List<Employee> getEmployees() {
		
		List<Employee> employees = (List<Employee>) repo.findAll();
		
		return employees;
		
	}

}
