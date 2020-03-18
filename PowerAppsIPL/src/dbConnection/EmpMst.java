package dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import completeDao.EmployeeMaster;
import dbConnection.DbConnect;

public class EmpMst {
	
	public static ArrayList<EmployeeMaster> getMaster(String fname) throws SQLException {
		 
//			System.out.println(fname+" stmt");
			ArrayList<EmployeeMaster> ul= new ArrayList<EmployeeMaster>();
			String query="SELECT ALTID,FNAME,EMPACTIVITY_DESC(ALTID,'E','EIPL')EMPDET,\r\n" + 
					" EMPACTIVITY_ID(ID,'C','EIPL')CATE, BIRTHDATE,JOINDATE,LEFTDATE,SEX,MARSTAT,ACCOUNT\r\n" + 
					" FROM EIPL.EMPLOYEE\r\n" + 
					" WHERE lower (FNAME) LIKE '%"+ fname+"%'";
			Connection con = DbConnect.getConnection();
			Statement stmt= con.createStatement();
//			System.out.println(query+" con");
			ResultSet rs= stmt.executeQuery(query);
//			System.out.println(fname+" exe");
			while(rs.next()) {
				String empId = rs.getString(1);
				String empName  = rs.getString(2);
				String empDept  = rs.getString(3);
				String empCat = rs.getString(4);
				String dob = rs.getString(5);
				String doj = rs.getString(6);
				String dol = rs.getString(7);
				String sex = rs.getString(8);
				String marStat = rs.getString(9);
				String accNo = rs.getString(10);
				EmployeeMaster emast= new EmployeeMaster(empId, empName, empDept, empCat, dob, doj, dol, sex, marStat, accNo);
				ul.add(emast);
//				System.out.println(ul);
			}
			
			
//			System.out.println(ul);
		return ul ;
		
	}

}
