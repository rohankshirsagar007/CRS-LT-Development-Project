package com.lt.crs.utils;



	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class Dbconnection {
		public static Connection getConnection(){
			// JDBC driver name and database URL
			  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
			    final String DB_URL = "jdbc:mysql://localhost/test";

			   //  Database credentials
			  final String USER = "root";
			   final String PASS = "true";
						
				// Step 2 
				// Declare the Coneection or prepaidstatement variable here 
				   Connection conn = null;
				   PreparedStatement stmt = null;
				   
				   
					   
					   // Step 3 Regiater Driver here and create connection 
					   
					   try {
						Class.forName("com.mysql.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					   // Step 4 make/open  a connection 
					   
					      System.out.println("Connecting to database...");
					      try {
							conn = DriverManager.getConnection(DB_URL,USER,PASS);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					   return conn;
			
		}
	}
