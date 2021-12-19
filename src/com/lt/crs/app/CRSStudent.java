package com.lt.crs.app;

import java.util.Scanner;

import com.lt.crs.service.StudentService;

public class CRSStudent {
	static Scanner sc=new Scanner(System.in);
	StudentService studSer=null;
	

	public void studentMenu(int studentId) {
		// TODO Auto-generated method stub
		
System.out.println("*********************Now you are in the STUDENT  MENU ************************");
		
		Boolean studentMenu=true;
		while(studentMenu) {
		
		System.out.println("\n 1. Enroll Courses \n2.Drop Course \n3.View Report Card \n 4. Logout");
		int studentSelect=sc.nextInt();
		switch(studentSelect) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
		
			break;
		
		case 4:
			System.out.println(" Are you sure you want to log out Y or N: ");
			char ask=sc.next().charAt(0);
			if(ask=='y' || ask=='Y') {studentMenu=false;}
			
		
		}

		
		
		
		
		}
		}
	
	
	}