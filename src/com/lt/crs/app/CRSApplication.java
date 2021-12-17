package com.lt.crs.app;
 import java.util.Scanner;

import com.lt.crs.business.*;
import com.lt.crs.dao.StudentDaoImpl;
public class CRSApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorCRSApp pca=null;
		LoginService loginService = null;
		while(true)
		{
		System.out.println("******************\t Welcome to CRS application \t *****************");
		System.out.println("\n 1. Login  \n 2. Student Registration \n 3. Update Password \n 4. Exit  \n Enter your Choice : ");
		int n,id = 0;
		String username=null;
		
		ProfessorServices pr=new ProfessorServices();
		StudentDaoImpl st = new StudentDaoImpl();
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    switch (n) {
	        case 1:	        	
	        	    	System.out.println("Enter Your Credentials for Login : ");
	    	            System.out.println("Login ID : ");
	    	            id=sc.nextInt();
	    	            System.out.println("Password : ");
	    	            username=sc.next();
	    	            loginService= new LoginServiceImpl();
	    	          String role= loginService.isLogedIn(id,username);
	    	          
	    	         
	    	          switch(role)
	    	          {
	    	          case "student" : 
	    	        	  	System.out.println("Welcome to the Student Menue : ");
	    	        	  	System.out.println("\n 1. ");
	    	        	  	break;
	    	        	  	
	    	          case "professor" :
	    	        	  
	    	        	    System.out.println("Welcome to the Professor Menua : ");
	    	        	    while(true)
	    	        	    {
	    	        	    System.out.println("\n 1. View Enroll Student \n 2. ADD GRADE for Student \n 3.Exit");
	    	        	    int a = sc.nextInt();
	    	        	    pca = new ProfessorCRSApp();
	    	        	    pca.professorOperations(a,id);
	    	        	    
	    	        	    
	    	        	    }
	    	        	   
	    	        	    
	    	          case "Admin" :
	    	        	     System.out.println("Welcome to the Admin Menue : ");
	    	        	     System.out.println("\n 1.");
	    	        	     break;
	    	        	     
	    	           default: 
	    	        	   break;
	    	        	    
	    	          }
	    	    	    	            
	    	  break;

		      case 2 : 
			        	System.out.println("Hi , Please Enter Below details : ");
			            System.out.println("Student ID : ");
			            id=sc.nextInt();
			            System.out.println("Student Name : ");
			            username=sc.next();
			            System.out.println("Student Semester : ");
			            int semester = sc.nextInt();
			            System.out.println("Student Password : ");
			            String password = sc.next(); 
			            
			            if(st.studentRegistration(id,username,semester,password))
			            {
			            		System.out.println("\n \n ************ REGISTRATION DONE SUCCESSFULLY *************** \n \n");
			            		
			            }
			            
			            break;
	        default:
	            System.out.println("\t\n you enter wrong choice !!!! ");
	            break;
	    }
		}
	}

	
		
		
	}

