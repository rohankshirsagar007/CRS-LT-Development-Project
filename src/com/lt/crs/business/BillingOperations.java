package com.lt.crs.business;

import com.lt.crs.bean.Course;

public class BillingOperations extends CourseOperations{
public void calculateBill(){
	int fee = 300;
	int count = 1;
	//System.out.println("The bill amount for student "+Course.getStudentName()+" and course "+Course.getCourseName()+" is "+ (fee*count));
	System.out.println("The bill amount for the course selected is "+(fee*count));
}
}
