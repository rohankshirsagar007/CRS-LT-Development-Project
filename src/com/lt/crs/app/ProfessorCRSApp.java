package com.lt.crs.app;

import java.util.Scanner;

import com.lt.crs.business.ProfessorServices;

public class ProfessorCRSApp {

	public void professorOperations(int option) {
		ProfessorServices pr = new ProfessorServices();
		int id = 0;
		Scanner sc = new Scanner(System.in);
		
			switch (option) {
			case 1:
				System.out
						.println("Please see the Below Enroll student Details");
				pr.viewEnrollStudents();

				break;
			case 2:
				System.out.println("Please add Grade for Students :");
				System.out.println("Enter Student ID : ");
				id = sc.nextInt();
				System.out.println("Enter Course ID : ");
				int courseId = sc.nextInt();
				System.out.println("Enter Grade  : ");
				char grade = sc.next().charAt(0);
				pr.addGrade(id, grade, courseId);

				break;

			case 3:
				System.out.println("Exited successfully ");
				System.exit(0);
			default:
				System.out.println("you enter wrong choice !!!! ");
				break;
			}
		}
	}

