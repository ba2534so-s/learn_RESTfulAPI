package com.learnrest.Lesson02_MockDatabase;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	List<Employee> employees;
	
	public EmployeeRepository() {
		employees = new ArrayList<>();
		
		Employee e1 = new Employee();
		e1.setEmployeeId(101);
		e1.setName("Mary Jane Johnson");
		e1.setSalary(42000);
		
		Employee e2 = new Employee();
		e2.setEmployeeId(102);
		e2.setName("John Smith");
		e2.setSalary(37000);
		
		employees.add(e1);
		employees.add(e2);
		
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public Employee getEmployee(int id) {
		for (Employee e : employees) {
			if(e.getEmployeeId() == id) {
				return e;
			}
		}
		return null;
	}
	
	public void create(Employee e) {
		employees.add(e);
	}

}
