package com.learnrest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity(name="employees")
public class Employee {
	
	@Id
	@Column
	private int employeeId;
	private String name;
	private int salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
