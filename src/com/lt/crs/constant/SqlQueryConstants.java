package com.lt.crs.constant;

public interface SqlQueryConstants {
	String professor_login_query = "Select * From professor WHERE professorId=? AND professorPassword=?";
	String student_login_query = "Select * From student WHERE studentId=? AND studentPassword=?";
	String admin_login_query = "Select * From admin WHERE AdminID=? AND AdminPassword=?";

}
