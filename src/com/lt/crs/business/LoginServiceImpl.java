package com.lt.crs.business;

import com.lt.crs.dao.LoginDao;
import com.lt.crs.dao.LoginDaoImpl;
import com.lt.crs.exception.UserDetailsNotFoundException;

public class LoginServiceImpl implements LoginService {
private LoginDao loginDao;

	public String isLogedIn(int id, String password) {
		loginDao=new LoginDaoImpl();
		String role=loginDao.isLogedIn(id, password);
		if(role.equals("notFound")){
			throw new UserDetailsNotFoundException("user is not found with this id:" +id);
		}
		return role;
	}

}
