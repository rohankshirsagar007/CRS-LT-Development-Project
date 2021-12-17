package com.lt.crs.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	import com.lt.crs.utils.Dbconnection;
public class StudentDaoImpl implements StudentDao{
	



		PreparedStatement stmt;
		ResultSet rs;
		Connection conn;
		
		public boolean studentRegistration(int id,String username,int semester,String password) {
			
			
			 // Let us select all the records and display them.
			 conn=Dbconnection.getConnection();
		      String sql = "insert into student(studentId,studentName,studentsemester,studentPassword) value(?,?,?,?) ";
		   try {
					stmt= conn.prepareStatement(sql);
					stmt.setInt(1, id);
					stmt.setString(2,username);
					stmt.setInt(3,semester);
					stmt.setString(4,password);
					stmt.execute();
					return true;
		   	    }
		   catch (SQLException e1)
		   {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		   }
		  try {
				conn.close();
			} 
		  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
		  
			
		}

		
	}

