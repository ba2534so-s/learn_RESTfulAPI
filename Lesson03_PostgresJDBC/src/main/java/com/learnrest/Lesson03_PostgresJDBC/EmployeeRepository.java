package com.learnrest.Lesson03_PostgresJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	Connection con = null;
	
	public EmployeeRepository() {
		String url = "jdbc:postrgresql://localhost:5432/learn_rest";
		String username ="postgres";
		String password = "0";
		
		try {
			con = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			System.out.println("There was an error setting up the db connection: " + e.getMessage());
		}
	}
	
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String query = "SELECT * FROM employees";
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while (rs.next()) {
				Employee e = new Employee();
				e.setEmployeeId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				
				employees.add(e);
			}
			
		} catch (Exception e) {
			System.out.println("There was an error setting up the db connection: " + e.getMessage());
		}
		
		return employees;
	}
	
	public Employee getEmployee(int id) {
		
	}
	
	

}
