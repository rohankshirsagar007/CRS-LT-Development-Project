package com.lt.crs.business;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.lt.Interface.ProfessorInterface;
import com.lt.crs.bean.Course;
import com.lt.crs.bean.Grade;
import com.lt.crs.bean.Professor;
import com.lt.crs.bean.Student;
//import com.lt.crs.bean.course;
import com.lt.crs.dao.ProfessorDao;
import com.lt.crs.dao.ProfessorDaoImpl;


public class ProfessorServices implements ProfessorInterface{
List<Student> st;
Set<Course> set;
Professor pr = new Professor();
ProfessorDao pd;
		
	public void viewEnrollStudents(int id2)
	{
		pd = new ProfessorDaoImpl();
		pd.viewEnrollStudents(id2);
		
	}

	public void addGrade(int studentId, char grade, int courseID, int professorId) {
		pd=new ProfessorDaoImpl();
		pd.addGrade(studentId, grade, courseID);
		
	}
	
}
