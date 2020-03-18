package dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import completeDao.UserData;
import dbConnection.DbConnect;

public class LoginUser {

	public boolean validUser(String uname, String pswd) throws SQLException {

		Connection con = DbConnect.getConnection();
		String query = "select * from dual where findpassword(?)=? and getempdol(?,?) is null";
		String entity="EIPL";
		PreparedStatement stmt = con.prepareStatement(query);
		stmt.setString(1, uname);
		stmt.setString(2, pswd);
		stmt.setString(3, uname);
		stmt.setString(4, entity);
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			return true;
		} else {
			return false;
		}
		
	}

	public String getUserDetails(String uname) throws SQLException {

		Connection con = DbConnect.getConnection();
		String query = "SELECT FNAME FROM EIPL.EMPLOYEE WHERE ALTID=?";
		
		PreparedStatement stmt;

		stmt = con.prepareStatement(query);
		stmt.setString(1, uname);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			String Emp =rs.getString(1);

					return Emp;
		}
		else return null;

	}

}
