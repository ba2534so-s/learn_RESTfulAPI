package com.learnrest.Lesson03_PostgresJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	Connection con = null;
	
	public EmployeeRepository() {
		String url = "jdbc:postgresql://localhost:5432/learn_rest";
		String username ="postgres";
		String password = "0";
		
		try {
			Class.forName("org.postgresql.Driver");
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
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				
				employees.add(emp);
			}
			
		} catch (Exception e) {
			System.out.println("There was an error getting the employees:  " + e.getMessage());
		}
		
		return employees;
	}
	
	public Employee getEmployee(int id) {
		Employee emp = new Employee();
		String query = "SELECT * FROM employees WHERE employeeId = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				emp.setEmployeeId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
			}
			
		} catch (Exception e) {
			System.out.println("There was an error getting the employee:  " + e.getMessage());
		}
		
		return emp;
		
	}
	
	
	public void createEmployee(Employee emp) {
		String query = "INSERT INTO employees (name, salary) VALUES (?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);	
			
			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getSalary());
			ps.executeUpdate();
		
		} catch (Exception e) {
			System.out.println("There was an error creating the employee:  " + e.getMessage());
		}
	}
	
	public void updateEmployee(Employee emp) {
		String query = "UPDATE employees SET name=?, salary=? WHERE employeeId=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getSalary());
			ps.setInt(3, emp.getEmployeeId());
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("There was an error updating the employee:  " + e.getMessage());
		}
	}
	
	public void deleteEmployee(int id) {
		String query = "DELETE FROM employee WHERE employeeId = ?";
	
		try {
			
		} catch (Exception e) {
			
		}
	}
	
	

}
