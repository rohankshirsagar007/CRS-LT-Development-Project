package com.lt.crs.service;

import com.lt.crs.dao.LoginUserDAOImpl;

public class LoginUserServiceImpl implements LoginUserService{
	com.lt.crs.dao.LoginUserDAO user=null;
public void userLogin(int userId,String userPassword) {
		user=new LoginUserDAOImpl();
		user.userLogin(userId, userPassword);
		
	
		
		
	}

}
