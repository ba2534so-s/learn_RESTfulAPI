package com.learnrest.Lesson02_MockDatabase;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private int employeeId;
	private String Name;
	private int salary;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", Name=" + Name + ", salary=" + salary + "]";
	}

}
