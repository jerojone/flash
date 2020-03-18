package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.spi.activation.Repository;

import dbConnection.DbConnect;
import dbConnection.LoginUser;


/**
 * Servlet implementation class VerifyLogin
 */
@WebServlet("/VerifyLogin")
public class VerifyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname = request.getParameter("username");
		String pswd = request.getParameter("password");
		LoginUser ld = new LoginUser();

		try {
			if (ld.validUser(uname, pswd)) {
				HttpSession ht = request.getSession();
				ht.setAttribute("username", uname);
				String empname= ld.getUserDetails(uname);
				ht.setAttribute("empname",empname );

				response.sendRedirect("dashboard.jsp");
			} else {
				response.sendRedirect("login.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
