<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
		    <!-- Content Header (Page header) -->
		    <section class="content-header">
		      <div class="container-fluid">
		        <div class="row mb-2">
		          <div class="col-sm-6">
		            <h1>DataTables</h1>
		          </div>
		          <div class="col-sm-6">
		            <ol class="breadcrumb float-sm-right">
		              <li class="breadcrumb-item"><a href="#">Home</a></li>
		              <li class="breadcrumb-item active">DataTables</li>
		              <li class="breadcrumb-item active">UserLog</li>
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
              <h3 class="card-title">Today's User Log Details</h3>
            </div>
            <!-- /.card-header -->
            <div class="card-body">
              <table id="example1" class="table table-bordered table-striped">
                <thead>
                <tr>
                  <th>Employee Id</th>
                  <th>Employee Name</th>
                  <th>Department</th>
                  <th>Date</th>
                  <th>IP Address</th>
                  <th>For Name</th>
                  <th>Search For</th>
                </tr>
                </thead>
                <tbody>
				<c:forEach var="det" items="${userdetails}">
				<tr>
				<!-- empId;empName;empDept;currentdate;ipAddr;forName;searchFor; -->
				<td>${det.empId}</td>
				<td>${det.empName}</td>
				<td>${det.empDept}</td>
				<td>${det.currentdate}</td>
				<td>${det.ipAddr}</td>
				<td>${det.forName}</td>
				<td>${det.searchFor}</td>
					
					</tr>
				</c:forEach>
                </tbody>
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
    $("#example1").DataTable();
    $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false,
    });
  });
</script>