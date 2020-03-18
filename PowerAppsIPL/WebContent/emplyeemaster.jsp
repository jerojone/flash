<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
		    <!-- Content Header (Page header) -->
		    <section class="content-header">
		      <div class="container-fluid">
		        <div class="row mb-2">
		          <div class="col-sm-6">
		            <h1>Employee Master</h1>
		          </div>
		          <div class="col-sm-6">
		            <ol class="breadcrumb float-sm-right">
		              <li class="breadcrumb-item"><a href="#">Home</a></li>
		              <li class="breadcrumb-item active">Employee Master</li>
		            </ol>
		          </div>
		        </div>
		      </div><!-- /.container-fluid -->
		    </section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-12">
          
          <!-- /.card -->

          <div class="card">
            <div class="card-header">
           <form class="form" method="post" action="EmpMasterDet">
            	<div class="input-group">
            	<input class="form-control" type="text" name="fname" style="padding-left:20px;padding-right: 150px" value="<%= request.getParameter("fname") %>">
            	</div>
            	<div style="padding-left: 10px;padding-top:20px;"><button type="submit" class="btn btn-primary">Report</button></div>
            </form>
            </div>
            <!-- /.card-header -->
            <div class="card-body">
               <table id="empmaster" class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>Employee ID</th>
                  <th>Employee Name</th>
                  <th>Department</th>
                  <th>Category</th>                  
                  <th>DOB</th>
                  <th>DOJ</th>
                  <th>DOL</th>
                  <th>SEX</th>
                  <th>Marital Status</th>
                  <th>Bank AccNo</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="md" items="${MasterDetails}">
                <tr>
                <td>${md.empId}</td>
                <td>${md.empName}</td>
                <td>${md.empDept}</td>
                <td>${md.empCat}</td>
                <td>${md.dob}</td>
                <td>${md.doj}</td>
                <td>${md.dol}</td>
                <td>${md.sex}</td>
                <td>${md.marStat}</td>
                <td>${md.accNo}</td>
                </tr>
                </c:forEach>
              </table>
            </div>
            <!-- /.card-body -->
          </div>
          <!-- /.card -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  
<!-- jQuery -->
<script src="newtemp/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="newtemp/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- DataTables -->
<script src="newtemp/plugins/datatables/jquery.dataTables.js"></script>
<script src="newtemp/plugins/datatables-bs4/js/dataTables.bootstrap4.js"></script>
<!-- AdminLTE App -->
<script src="newtemp/dist/js/adminlte.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="newtemp/dist/js/demo.js"></script>
<!-- page script -->
<script>
  $(function () {
    $("#empmaster").DataTable();
    /* $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false,
    }); */
  });
</script>