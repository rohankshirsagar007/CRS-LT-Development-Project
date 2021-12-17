package com.lt.crs.app;
 import java.util.Scanner;

import com.lt.crs.business.*;
public class CRSApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorCRSApp pca=null;
		while(true)
		{
		System.out.println("******************\t Welcome to CRS application \t *****************");
		System.out.println("\n 1. Login  \n 2. Student Registration \n 3. Update Password \n 4. Exit  \n Enter your Choice : ");
		int n,id = 0;
		String username=null;
		ProfessorServices pr=new ProfessorServices();
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    switch (n) {
	        case 1:
	        	System.out.println("\n 1. Student \n 2. Professor \n 3. Admin \n Enter your choice : ");
	        	int choice=sc.nextInt();
	        	switch(choice)
	        	{
	        	    case 1: 
	        	    	System.out.println("Enter Your Credentials for Student Login : ");
	    	            System.out.println("Login ID : ");
	    	            id=sc.nextInt();
	    	            System.out.println("Password : ");
	    	            username=sc.next();
	    	            System.out.println(" "+username);
	    	            if(pr.isLogedIn(id,username))
	    	            {
	    	            System.out.println("LogIn Successful");
	    	            }
	    	            else
	    	            {
	    	            	System.out.println("invalid credentials");
	    	            }
	    	            
	    	            break;
	    	            
	        	    case 2: 
	        	    	System.out.println("Hi , Please Enter Below details : ");
	    	            System.out.println("Student ID : ");
	    	            id=sc.nextInt();
	    	            System.out.println("Student Name : ");
	    	            username=sc.next();
	    	            System.out.println("Student Semester : ");
	    	            int semester = sc.nextInt();
	    	            System.out.println("Student Password : ");
	    	            String password = sc.next();
	    	            	
	    	            break;
	    	            
	        	    case 3: 
	        	    	System.out.println("Enter Your Credentials for Admin Login : ");
	    	            System.out.println("Login ID : ");
	    	            id=sc.nextInt();
	    	            System.out.println("Password : ");
	    	            username=sc.next();
	    	            System.out.println(" "+username);
	    	            if(pr.isLogedIn(id,username))
	    	            {
	    	            System.out.println("LogIn Successful");
	    	            }
	    	            else
	    	            {
	    	            	System.out.println("invalid credentials");
	    	            }
	    	            
	    	            break;
	        	}
	        	break;
	        case 2: 
	        	System.out.println("Hi , Please Enter Below details : ");
	            System.out.println("Student ID : ");
	            id=sc.nextInt();
	            System.out.println("Student Name : ");
	            username=sc.next();
	            System.out.println("Student Semester : ");
	            int semester = sc.nextInt();
	            System.out.println("Student Password : ");
	            String password = sc.next();
	            
	            break;
	        default:
	            System.out.println("you enter wrong choice !!!! ");
	            break;
	    }
		}
	}

	
		
		
	}

