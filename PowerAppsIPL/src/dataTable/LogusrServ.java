package dataTable;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import completeDao.LoggedInUserDetails;
import dbConnection.LoggedUserList;


@WebServlet("/LogusrServ")
public class LogusrServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String PageName="userlogdetails.jsp";
		try {
			ArrayList<LoggedInUserDetails> userDet= LoggedUserList.getuserlist();
			HttpSession ht = request.getSession();
			ht.setAttribute("userdetails", userDet);
		
			ht.setAttribute("pageName", PageName);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher= request.getRequestDispatcher("loggedinuserdetails.jsp");
		dispatcher.forward(request, response);
	}

}
