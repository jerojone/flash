<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>POWERAPPS | DataTables</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="newtemp/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- DataTables -->
  <link rel="stylesheet" href="newtemp/plugins/datatables-bs4/css/dataTables.bootstrap4.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="newtemp/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini">

<%
 
 	response.setHeader("Cache-control","no-cache, no-store, must-revalidate");
 	response.setHeader("Pragma", "no-cache");
 	response.setHeader("Expires", "0");
 	session.getAttribute("username");
 	session.getAttribute("empname");
 	session.getAttribute("pageName");
 	session.getAttribute("fname");
 	
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
<%--    <%@ include file="userlogdetails.jsp" %> --%>
   <jsp:include page="${pageName}" />
   
  <!-- /.content-wrapper -->
  
   <!-- footer  -->
	<%@ include file="footer.jsp" %>
   <!-- ./.footer  -->
   	
  	<!-- Control Sidebar -->
	<%@ include file="sidebarcontrol.jsp" %>
  	<!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

</body>
</html>
