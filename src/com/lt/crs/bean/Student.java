package com.lt.crs.bean;

import java.util.Set;

public class Student {
private int studentID;
private String studentName;
private int studentsemester;
private Set<Course> course;


public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getStudentsemester() {
	return studentsemester;
}
public void setStudentsemester(int studentsemester) {
	this.studentsemester = studentsemester;
}
public Set<Course> getCourse() {
	return course;
}
public void setCourse(Set<Course> course) {
	this.course = course;
}


}
