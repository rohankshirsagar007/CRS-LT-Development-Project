package com.lt.crs.business;

import com.lt.crs.dao.LoginDao;
import com.lt.crs.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
private LoginDao loginDao;

	public boolean isLogedIn(int id, String username) {
		loginDao=new LoginDaoImpl();
		loginDao.isLogedIn(id, username);
		
		return false;
	}

}
