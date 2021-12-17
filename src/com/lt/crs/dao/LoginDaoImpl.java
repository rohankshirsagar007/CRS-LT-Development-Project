package com.lt.crs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lt.crs.utils.Dbconnection;

public class LoginDaoImpl implements LoginDao {
	PreparedStatement stmt1;
	PreparedStatement stmt;
	
	ResultSet rs;
	Connection conn;
	
	public boolean isLogedIn(int id, String username) {
		 conn=Dbconnection.getConnection();
	      String sql = "SELECT * FROM user_role where userId=?";
	      String sql1="SELECT * FROM role where roleId=?";
	   try {
		stmt= conn.prepareStatement(sql);
		stmt.setInt(1, 123);
		 int userId;
		 int roleId = 0;
		rs= stmt.executeQuery();
			while(rs.next()){
			  userId = rs.getInt(1);
			      roleId = rs.getInt(2);
			     System.out.print("\n user ID: " + userId);
			     System.out.print("\n role ID: " + roleId);
			  }
			stmt1= conn.prepareStatement(sql1);
			stmt1.setInt(1, roleId);
			stmt.close();
			conn.close();
	
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

}
