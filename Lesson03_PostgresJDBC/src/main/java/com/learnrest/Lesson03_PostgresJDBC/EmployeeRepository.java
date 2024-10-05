package com.learnrest.Lesson03_PostgresJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

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
	
	

}
