package dataTable;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import completeDao.EmployeeMaster;
import dbConnection.EmpMst;

/**
 * Servlet implementation class EmpMasterDet
 */
@WebServlet("/EmpMasterDet")
public class EmpMasterDet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname= request.getParameter("fname");
		System.out.println(fname+" serv");
		String pageName="emplyeemaster.jsp";
		
		if (fname!= null) {
			
			try {
				ArrayList<EmployeeMaster> ls= EmpMst.getMaster(fname);
				HttpSession ht = request.getSession();
				ht.setAttribute("MasterDetails", ls);
				ht.setAttribute("fname", fname);
				ht.setAttribute("pageName", pageName);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher dispatcher= request.getRequestDispatcher("loggedinuserdetails.jsp");
			dispatcher.forward(request, response);
			
			
		}else {
			response.getWriter().append("Error Found");
			response.getWriter().append("Served at: ").append(request.getContextPath());
			
			
			response.getWriter().append("\n "+fname);
		}
	
	
	}

}
