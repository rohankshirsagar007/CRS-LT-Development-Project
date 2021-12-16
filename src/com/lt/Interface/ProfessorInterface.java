package com.lt.Interface;

public interface ProfessorInterface {
	public void viewEnrollStudents();
	public void addGrade(int studentId, char grade,int courseID);
	public boolean isLogedIn(int id,String username);
}
