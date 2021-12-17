package com.lt.crs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lt.crs.utils.Dbconnection;

public class ProfessorDaoImpl implements ProfessorDao {

	PreparedStatement stmt;
	ResultSet rs;
	Connection conn;
	
	public void viewEnrollStudents() {
		
		
		 // Let us select all the records and display them.
		 conn=Dbconnection.getConnection();
	      String sql = "SELECT * FROM student_course where professorID=?";
	   try {
		stmt= conn.prepareStatement(sql);
		stmt.setInt(1, 123);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  
	  try {
		rs= stmt.executeQuery();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

	      //STEP 5: Extract data from result set
	      try {
			while(rs.next()){
			     //Retrieve by column name
			     int studentID = rs.getInt(1);
			     int professorID = rs.getInt(2);
			     int courseID = rs.getInt(3);

			     //Display values
			     System.out.print("\n Student ID: " + studentID);
			     System.out.print("\n professor ID: " + professorID);
			     System.out.print("\n Course ID: " + courseID+"\n \n ");
			     
			  }
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      //STEP 6: Clean-up environment
	     // rs.close();
	      try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
		
	}

	public void addGrade(int studentId, char grade, int courseID) {
		// TODO Auto-generated method stub
		
	}

	public boolean isLogedIn(int id, String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
