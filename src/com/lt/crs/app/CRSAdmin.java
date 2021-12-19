package com.lt.crs.app;

import java.util.Scanner;

import com.lt.crs.service.AdminService;
import com.lt.crs.service.AdminServiceImpl;

public class CRSAdmin {
	static Scanner sc=new Scanner(System.in);
	AdminService adSer=null;
	public void adminMenu(int adminId) {
		System.out.println("*********************Now you are in the ADMIN MENU ************************");
		
		Boolean adminMenu=true;
		while(adminMenu) {
			System.out.println("\n 1.Add Professor \n2. Remove Professor \n 3. Add Course \n4. Remove Course \n "
					+ "5. Approve Student \n6. Reject Student \n 7. Logout");
			int adminSelect=sc.nextInt();
			switch(adminSelect) {
			case 1:
				adSer=new AdminServiceImpl();
				adSer.addProfessor();
				break;
			case 2:
				adSer=new AdminServiceImpl();
				adSer.removeProfessor();
				
				break;
			case 3:
				adSer=new AdminServiceImpl();
				adSer.addCourse();
				break;
			case 4:
			case 5:
				adSer=new AdminServiceImpl();
				adSer.addStudent();
				break;
			case 6:
				adSer=new AdminServiceImpl();
				adSer.removeStudent();
				break;
			case 7:
				System.out.println(" Are you sure you want to log out Y or N: ");
				char ask=sc.next().charAt(0);
				if(ask=='y' || ask=='Y') {adminMenu=false;}
				
			
			}
			
		}
		
		
	}

}
