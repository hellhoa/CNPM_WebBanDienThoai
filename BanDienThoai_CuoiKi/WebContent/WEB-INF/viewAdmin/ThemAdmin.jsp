<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin</title>
    
    <link href="assets/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <link href="assets/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
    <link href="assets/css/main-style.css" rel="stylesheet" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <!-- Page-Level CSS -->
    <link href="assets/plugins/morris/morris-0.4.3.min.css" rel="stylesheet" />
   </head>
<body>
    <div id="wrapper">
        <jsp:include page="header.jsp"></jsp:include>
        <div id="page-wrapper">

            <div class="row">
                <div class="col-lg-12" style="text-align:center;">
						<form method="POST" action="${pageContext.request.contextPath}/themadmin?tenAdmin=${tenAdmin }&maAD=${maAD}">
						<h1>Thêm Tài Khoản Admin</h1>
  								<div class="textbox">
    								<i class="fas fa-user"></i>
    								<input type="text" placeholder="Tên Tài Khoản" name="tenTK" style="margin-top:2%">
  								</div>

  								<div class="textbox">
    								<i class="fas fa-lock"></i>
    								<input type="password" placeholder="Mật khẩu" name="matkhau" style="margin-top:2%">
  								</div>
  								
								<div class="textbox">
    								<i class="fas fa-user"></i>
    								<input type="text" placeholder="Tên Admin" name="tenAD" style="margin-top:2%">
  								</div>
  								<div class="textbox">
    								<i class="fas fa-user"></i>
    								<input type="number"  name="tuoi" min="18" max="60" value="18" style="margin-top:2%">
  								</div>
  								<span>Phân Quyền</span>
  								<select name="dropdown" style="margin-top:2%" >
								<option value="quanly" id="" style="margin-top:2%">Quản Lý</option>
								<option value="nhanvien" id="" style="margin-top:2%">Nhân Viên</option>
								<option value="giaohang" id="" style="margin-top:2%">Giao Hàng</option>
								<option value="quanlykho" id="" style="margin-top:2%">Quản Lý Kho</option>
							</select>
  							<input type="submit" class="btn" value="Thêm Tài Khoản" style="">
						</form>
						
                </div>
            </div>

        </div>
    </div>
</body>

</html>