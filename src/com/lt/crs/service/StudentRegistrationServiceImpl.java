package com.lt.crs.service;

import com.lt.crs.dao.StudentRegisterationDAO;
import com.lt.crs.dao.StudentRegisterationDAOImpl;
import com.lt.crs.model.Student;

public class StudentRegistrationServiceImpl implements StudentRegistrationService{
	
	StudentRegisterationDAO str=null;
	
	public void register(Student student) {
		str=new StudentRegisterationDAOImpl();
		str.register(student);
		
		
		
	}

}
