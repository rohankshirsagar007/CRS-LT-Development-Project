package com.lt.crs.service;

import com.lt.crs.dao.AdminDAO;
import com.lt.crs.dao.AdminDAOImpl;

public class AdminServiceImpl implements AdminService {
	AdminDAO admin=null;

	@Override
	public void addProfessor() {
		// TODO Auto-generated method stub
		admin=new AdminDAOImpl();
		admin.addProfessor();
		
	}

	@Override
	public void removeProfessor() {
		// TODO Auto-generated method stub
		admin=new AdminDAOImpl();
		admin.removeProfessor();
		
	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		admin=new AdminDAOImpl();
		admin.addStudent();
		
		
		
	}

	@Override
	public void removeStudent() {
		// TODO Auto-generated method stub
		admin=new AdminDAOImpl();
		admin.removeStudent();
		
	}

	@Override
	public void addCourse() {
		// TODO Auto-generated method stub
		admin=new AdminDAOImpl();
		admin.addCourse();
		
	}
	

}
