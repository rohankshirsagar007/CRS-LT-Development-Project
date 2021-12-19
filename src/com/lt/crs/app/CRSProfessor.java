package com.lt.crs.app;

import java.util.Scanner;

import com.lt.crs.service.ProfessorService;

public class CRSProfessor {
	static Scanner sc=new Scanner(System.in);
	ProfessorService profser=null;
	

	public void profMenu(int studentId) {
		// TODO Auto-generated method stub
		
System.out.println("*********************Now you are in the Professor  MENU ************************");
		
		Boolean profMenu=true;
		while(profMenu) {
		
		System.out.println("\n 1. View Enrolled Students \n2.Add Grades to the Student \n3.Logout");
		int profSelect=sc.nextInt();
		switch(profSelect) {
		case 1:
			
			break;
		case 2:
			
			break;
		
		case 3:
			System.out.println(" Are you sure you want to log out Y or N: ");
			char ask=sc.next().charAt(0);
			if(ask=='y' || ask=='Y') {profMenu=false;}
			
		
		}

		
		
		
		
		}
		}
	

}
