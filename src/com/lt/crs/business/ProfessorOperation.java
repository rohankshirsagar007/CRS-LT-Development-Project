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

public class ProfessorOperation implements ProfessorInterface{
List<Student> st;
Set<Course> set;
Professor pr = new Professor();
	public boolean isLogedIn(int id,String username)
	{
		
		if(username.equals("Arturo") && id == 123)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public void viewEnrollStudents()
	{
		
		Course course= new  Course();
		course.setCourseID(7);
		course.setCourseName("Java");
	set=new HashSet<Course>();
	set.add(course);		
			
		Student student= new Student();
		student.setStudentID(11);
		student.setStudentName("Abhi");
		student.setStudentsemester(1);
		student.setCourse(set);
		st=new ArrayList<Student>();
		st.add(student);
		student = new Student();
		student.setStudentID(12);
		student.setStudentName("Diva");
		student.setStudentsemester(1);
		student.setCourse(set);
		st.add(student);
		
		for(Student student1:st)
		{
			System.out.println("Details of Enrolled Students "+student1.getStudentID()+" "+student1.getStudentName()+" "+student1.getStudentsemester()+" "+student1.getCourse());
			
		}
	}
	
	public void addGrade(int studentId, char grade,int courseID)
	{
	
		Grade g = new Grade();
		g.setCourseId(courseID);
		g.setStudentId(studentId);
		g.setGrade(grade);
		
		System.out.println("Grade hase been set");
		
		
	}
	
}
