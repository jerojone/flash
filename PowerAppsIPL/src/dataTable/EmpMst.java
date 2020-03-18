package dataTable;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmpMst
 */
@WebServlet("/EmpMst")
public class EmpMst extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageName="emplyeemaster.jsp";
		HttpSession ht = request.getSession();
		ht.setAttribute("pageName", pageName);
		RequestDispatcher dispatcher= request.getRequestDispatcher("loggedinuserdetails.jsp");
		dispatcher.forward(request, response);
	}

}
