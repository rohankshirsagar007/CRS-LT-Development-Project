package com.lt.crs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lt.crs.utils.Dbconnection;

public class ProfessorDaoImpl implements ProfessorDao {

	PreparedStatement stmt;
	PreparedStatement stmt1;
	PreparedStatement stmt2;

	ResultSet rs;
	ResultSet rs1;
	ResultSet rs2;
	Connection conn;

	public void viewEnrollStudents(int id) {
		// Let us select all the records and display them.
		conn = Dbconnection.getConnection();
		System.out.println("in pfdao");
		String student_course_professor = "SELECT * FROM student_course where professorID=?";
		String show_student_details_query = "Select * from student where studentId=?";
		String show_course_details_query = "select * from course where courseId=?";
		try {
			stmt = conn.prepareStatement(student_course_professor);
			stmt.setInt(1, id);

			rs = stmt.executeQuery();

			System.out.print("\n Student ID" + " " + "student name"
					+ " " + "Course Id" + " " + "course name");
			while (rs.next()) {
				// Retrieve by column name
				stmt1 = conn.prepareStatement(show_student_details_query);
				stmt1.setInt(1, rs.getInt(1));
				rs1 = stmt1.executeQuery();

				stmt2 = conn.prepareStatement(show_course_details_query);
				stmt2.setInt(1, rs.getInt(3));
				rs2 = stmt2.executeQuery();
				while (rs1.next()) {

					// Display values
					
					System.out.print("\n " + rs1.getInt(1) + " "
							+ rs1.getString(2));

				}
				while (rs2.next()) {

					// Display values
					
					System.out.print(" " + rs2.getInt(1) + " "
							+ rs2.getString(2)+"\n ");

				}

			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// STEP 6: Clean-up environment
		// rs.close();
		try {
			stmt.close();
			stmt1.close();
			conn.close();
		} catch (SQLException e) {
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
	
	public static void printStudentDetails(int id)
	{
		
	}

}
