package dbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import completeDao.LoggedInUserDetails;
import completeDao.UserData;
import dbConnection.DbConnect;

public class LoggedUserList {
	
	public static ArrayList<LoggedInUserDetails> getuserlist() throws SQLException {
		 
		
			ArrayList<LoggedInUserDetails> ul= new ArrayList<LoggedInUserDetails>();
			String query="SELECT GETALTID(APPLUSER,'EIPL')EMPID,GETEMPNAME_ID(APPLUSER,'EIPL')EMPNAME,\r\n" + 
					" EMPACTIVITY_DESC(GETALTID(APPLUSER,'EIPL'),'E','EIPL')EMPDET,\r\n" + 
					" SYSDT,IPADDR,FORMNAME,EMPNO SEARCHFOR FROM USEMBIUM.FLUOUS_HARDENING\r\n" + 
					" WHERE TRUNC(SYSDT)=TRUNC(SYSDATE)";
			Connection con = DbConnect.getConnection();
			Statement stmt= con.createStatement();
			ResultSet rs= stmt.executeQuery(query);
			
			while(rs.next()) {
				String empId=rs.getString(1);
				 String empName=rs.getString(2);
				 String empDept=rs.getString(3);
				 String currentdate=rs.getString(4);
				 String ipAddr=rs.getString(5);
				 String forName=rs.getString(6);
				 String searchFor=rs.getString(7);
				LoggedInUserDetails lud = new LoggedInUserDetails(empId,empName,empDept,currentdate,ipAddr,forName,searchFor);
				ul.add(lud);
//				System.out.println(ul);
			}
			
			
			
		return ul ;
		
		
	}

}
