package com.learnrest.Lesson03_PostgresJDBC;

import java.sql.Connection;

public class EmployeeRepository {
	
	Connection con = null;
	
	public EmployeeRepository() {
		String url = "jdbc:postrgresql://localhost:5432/learn_rest";
	}
	
	

}
