package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class DbConnect {
	static Connection conn = null;

	private DbConnect() {
	}

	private final static String url = "jdbc:oracle:thin:@128.213.1.240:1521:ipl";
	private final static String username = "powerapps";
	private final static String password = "powerapps";

	public static Connection getConnection() {

		try {
			if (conn == null) {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, username, password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

}
