package com.lt.crs.dao;

public interface ProfessorDao {
	public void viewEnrollStudents();
	public void addGrade(int studentId, char grade,int courseID);
	public boolean isLogedIn(int id,String username);


}