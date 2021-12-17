package com.lt.crs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lt.crs.constant.SqlQueryConstants;
import com.lt.crs.exception.UserDeatailsNotFoundException;
import com.lt.crs.utils.Dbconnection;

public class LoginDaoImpl implements LoginDao {
	PreparedStatement stmt1;
	PreparedStatement stmt;
	
	ResultSet rs;
	Connection conn;
	
	public String isLogedIn(int id, String password) {
		conn = Dbconnection.getConnection();
		
		try {
			stmt = conn.prepareStatement(SqlQueryConstants.professor_login_query);
			stmt.setInt(1, id);
			stmt.setString(2, password);

			rs = stmt.executeQuery();
			if (rs.next()) {
				return "professor";
			}
			stmt = conn.prepareStatement(SqlQueryConstants.student_login_query);
			stmt.setInt(1, id);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			if (rs.next()) {
				return "student";
			}
			stmt = conn.prepareStatement(SqlQueryConstants.admin_login_query);
			stmt.setInt(1, id);
			stmt.setString(2, password);
			rs = stmt.executeQuery();
			if (rs.next()) {
				return "admin";
			}

			stmt.close();
			conn.close();

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return "notFound";

	}
}
