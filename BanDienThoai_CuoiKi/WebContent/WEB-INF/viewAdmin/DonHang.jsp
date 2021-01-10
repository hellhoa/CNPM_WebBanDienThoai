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
                <div class="col-lg-12">
                    <div class="row">
						<table border="1" cellpadding="30" cellspacing="3" width="100%">
       						<tr  align="center">
          						<th width="14%">Mã Đơn Hàng</th>
          						<th width="14%">Mã Sản Phẩm</th>
          						<th width="14%">Tên Sản Phẩm</th>
          						<th width="14%">Đơn Giá</th>
          						<th width="14%">Số Lượng Mua</th>
          						<th width="14%">Tên Khách Hàng</th>
          						<th>Địa Chỉ</th>
          						<th width="14%">Ngày Mua</th>
          						<th width="14%">Tình Trạng</th>
          						<th width="14%">Cập Nhập Đơn Hàng</th>
       						</tr>
       						<c:forEach items="${danhsachdonhang}" var="dh" >
          					<tr align="center">
             					<td>${dh.maDonHang}   </td>
             					<td>${dh.maSP}   </td>
             					<td>${dh.tenSP}  </td>
             					<td>${dh.dongia}   </td>
             					<td>${dh.slmua}   </td>
             					<td>${dh.tenKH}</td>
             					<td>${dh.diachigiaohang}</td>
             					<td>${dh.ngayMua}</td>
             					<td>${dh.tinhtrang}</td>
             					<td>
                					<a href="capnhapdonhang?tenAdmin=${tenAdmin }&maAD=${maAD}&maDonHang=${dh.maDonHang}&maSP=${dh.maSP}&phanquyen=${phanquyen}">Cập nhập đơn hàng  </a>
             					</td>
          					</tr>
       						</c:forEach>
    					</table>
					
                </div>
            </div>

        </div>
    </div>
    </div>
    <c:if test="${phanquyen =='nhanvien' }">
    	<script>
    		document.getElementById("taikhoan").style.display ='none';
    	</script>
    </c:if>
    <c:if test="${phanquyen =='giaohang' }">
    	<script>
    		document.getElementById("sanpham").style.display ='none';
    		document.getElementById("baiviet").style.display ='none';
    		document.getElementById("taikhoan").style.display ='none';
    	</script>
    </c:if>
    <c:if test="${phanquyen == 'quanlykho' }">
    	<script>
    		document.getElementById("sanpham").style.display ='none';
			document.getElementById("baiviet").style.display ='none';
			document.getElementById("taikhoan").style.display ='none';
    	</script>
    
    </c:if>
</body>

</html>