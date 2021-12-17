package com.lt.crs.business;

import com.lt.crs.bean.Course;

public class CourseServices extends StudentServices {
	Course courses[] = new Course[2];
	public void addCourse(){
		courses[0] = new Course();
		courses[0].setCourseID(1);
		courses[0].setCourseName("Java 8 Basic");
		courses[0].setSemester(1);
		courses[0].setPrereq("OOPS");
		
		courses[1] = new Course();
		courses[1].setCourseID(2);
		courses[1].setCourseName("Java 8 Advanced");
		courses[1].setSemester(3);
		courses[1].setPrereq("Java Basic");
		System.out.println("Course has been added!");
	}
	public void displayCourse(){
		addCourse();
		int count =1;
		System.out.println("ID |"+" Course Name |"+ " Sem |"+ " PreReq ");
		for(Course  c : courses){		
	   		System.out.println(c.getCourseID() + " " +c.getCourseName()+ " " +c.getSemester()+ " "+ c.getPrereq());
	   		count++;
		}
	}
}
