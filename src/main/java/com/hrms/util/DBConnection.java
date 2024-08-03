package com.hrms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection connection=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms","root","ahmad1234");
		
		return connection;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(DBConnection.getConnection());
	}
	
}
