package com.learnrest.Lesson02_MockDatabase;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	List<Employee> employees;
	
	public EmployeeRepository() {
		employees = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setName("Mary Jane Johnson");
		e1.setSalary(42000);
		
		Employee e2 = new Employee();
		e2.setName("John Smith");
		e2.setSalary(37000);
		
		employees.add(e1);
		
	}

}
