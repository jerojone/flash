<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to PowerAPPS</title>
</head>
<body>
 <%
 
 	response.setHeader("Cache-control","no-cache, no-store, must-revalidate");
 	response.setHeader("Pragma", "no-cache");
 	response.setHeader("Expires", "0");
 
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
 %>

 
 <form action="Logout"  method="post" >
 <table id="main-right" name="main-right" align="right" height="150"> 
 <tr> <td> <h3> Welcome ${username} </h3></td>
 <td> <input type="submit" value="logout"></td>
 </tr>
 </form>
 
</body>
</html>