<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>POWERAPPS | Dashboard</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="newtemp/plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
<!-- Tempusdominus Bbootstrap 4 -->
<link rel="stylesheet"
	href="newtemp/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
<!-- iCheck -->
<link rel="stylesheet"
	href="newtemp/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
<!-- JQVMap -->
<link rel="stylesheet" href="newtemp/plugins/jqvmap/jqvmap.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="newtemp/dist/css/adminlte.min.css">
<!-- overlayScrollbars -->
<link rel="stylesheet"
	href="newtemp/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
<!-- Daterange picker -->
<link rel="stylesheet"
	href="newtemp/plugins/daterangepicker/daterangepicker.css">
<!-- summernote -->
<link rel="stylesheet"
	href="newtemp/plugins/summernote/summernote-bs4.css">
<!-- Google Font: Source Sans Pro -->
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700"
	rel="stylesheet">
</head>


<body class="hold-transition sidebar-mini layout-fixed">
	<%
 
 	response.setHeader("Cache-control","no-cache, no-store, must-revalidate");
 	response.setHeader("Pragma", "no-cache");
 	response.setHeader("Expires", "0");
 	session.getAttribute("username");
 	session.getAttribute("empname");
 	
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
 %>
	<div class="wrapper">

		<!-- Navbar -->
		<%@ include file="navbar.jsp"%>
		<!-- /.navbar -->

		<!-- Main Sidebar Container -->
		<%@ include file="mainsidebar.jsp"%>		
		<!-- /.Main Sidebar Container -->

		<!-- Content Wrapper. Contains page content -->
		<%@ include file="dashboardcontent.jsp"%>
		<!-- /.content-wrapper -->
		
		
		<!-- footer  -->
		<%@ include file="footer.jsp" %>
		<!-- ./.footer  -->
	
	
	</div>
	<!-- ./wrapper -->

	
</body>
</html>
