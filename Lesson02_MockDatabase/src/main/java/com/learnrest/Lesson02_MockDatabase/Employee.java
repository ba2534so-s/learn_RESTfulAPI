package com.learnrest.Lesson02_MockDatabase;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private int employeeId;
	private String Name;
	private int salary;
	
	
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

}
