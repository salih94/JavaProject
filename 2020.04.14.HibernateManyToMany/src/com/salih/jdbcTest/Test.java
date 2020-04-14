package com.salih.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) {
			
		String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
		String user="HR";
		String pass="hr";
		
		try {
			Connection myConn =DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection successfull.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
}
