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
						<form method="POST" action="${pageContext.request.contextPath}/capnhapdonhang?tenAdmin=${tenAdmin }&maAD=${maAD}&phanquyen=${phanquyen}">
							<h1>Cập Nhập Đơn Hàng</h1>
							<h4>Mã Đơn: </h4>
							<input type="text" name="maDonHang" value ="${donhang.maDonHang}" readonly>
							<h4>Mã Sản Phẩm</h4>
							<input type="text" name="maSP" value ="${donhang.maSP}" readonly>
							<h4>Tên Sản Phẩm:${donhang.tenSP}</h4>
							<h4>Đơn giá:${donhang.dongia} </h4>
							<h4>Số Lượng Mua: ${donhang.slmua } </h4>
							<h4>Ngày Mua: ${donhang.ngayMua} </h4>
							<h4>Tên Khách Hàng :${donhang.tenKH}</h4>
							<h4>Địa Chỉ Giao Hàng: ${donhang.diachigiaohang}</h4>
							<span>Cập Nhập Tình Trạng: ${donhang.tinhtrang}</span>
							<select name="dropdown">
								<option value="Xác Nhận Đơn Hàng" id="xacnhan" style="margin-top:2%" >Xác Nhận Đơn Hàng</option>
								<option value="Đang Đóng Gói" id="donggoi" style="margin-top:2%">Đang Đóng Gói</option>
								<option value="Đang Vận Chuyển" id="vanchuyen" style="margin-top:2%">Đang Vận Chuyển</option>
								<option value="Hoàn Thành" id="hoanthanh" style="margin-top:2%" >Hoàn Thành</option>
								<option value="Hủy Đơn" id="huydon" style="margin-top:2%">Hủy Đơn</option>
							</select>
  							<input type="submit" class="btn" value="Cập Nhập" style="">
						</form>
						
                </div>
            </div>

        </div>
    </div>
    <c:if test="${phanquyen =='nhanvien' }">
    	<script>
    		document.getElementById("donggoi").style.display ='none';
    		document.getElementById("vanchuyen").style.display ='none';
    		document.getElementById("hoanthanh").style.display ='none';
    		document.getElementById("huydon").style.display ='none';
    		document.getElementById("taikhoan").style.display='none';
    	</script>
    </c:if>
    <c:if test="${phanquyen =='giaohang' }">
    	<script>
    		document.getElementById("xacnhan").style.display ='none';
    		document.getElementById("huydon").style.display ='none';
    		document.getElementById("taikhoan").style.display='none';
    		document.getElementById("baiviet").style.display='none';
    		document.getElementById("sanpham").style.display='none';
    		document.getElementById("donggoi").style.display='none';
    		document.getElementById("vanchuyen").selected = true;
    	</script>
    </c:if>
    <c:if test="${phanquyen == 'quanlykho' }">
    	<script>
    		document.getElementById("huydon").style.display ='none';
			document.getElementById("vanchuyen").style.display ='none';
			document.getElementById("hoanthanh").style.display ='none';
			document.getElementById("xacnhan").style.display ='none';
			document.getElementById("taikhoan").style.display='none';
			document.getElementById("baiviet").style.display='none';
			document.getElementById("sanpham").style.display='none';
			document.getElementById("donggoi").selected = true;
    	</script>
    
    </c:if>
</body>

</html>