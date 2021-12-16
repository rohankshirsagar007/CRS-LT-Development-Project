package com.lt.crs.business;

import com.lt.crs.bean.Course;
import com.lt.crs.bean.Student;
public class StudentOperations extends Course {
	Student students[] = new Student[2];
	
	public void addCourseToStudent(){
		System.out.println("Add course ***");
		students[0] = new Student();
		students[0].setStudentID(101);
		students[0].setStudentName("Nisha");
		System.out.println("Student details: ");
	}
	
	public void dropCourseFromStudent(){
		System.out.println("Drop course ***");
	}
	public void viewGrades(){
		System.out.println("View Grades ***");
	}
	public void payFees(){
		System.out.println("Pay Fees ***");
	}
}
