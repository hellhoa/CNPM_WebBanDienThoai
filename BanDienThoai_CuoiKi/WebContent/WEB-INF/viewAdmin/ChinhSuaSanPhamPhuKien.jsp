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
						<form method="POST" action="${pageContext.request.contextPath}/chinhsuasanpham?tenAdmin=${tenAdmin }&maAD=${maAD}&maSP=${phukien.maPK}">
						<h2>Mã Sản Phẩm : ${phukien.maPK}</h2>

  								
								<div class="textbox" style="margin-top:2%">
									<h5>Tên Sản Phẩm</h5>
    								<input type="text" placeholder="Tên Sản Phẩm" name="ten"  value="${phukien.ten }" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đơn Giá</h5>
    								<input type="text"  name="dongia" value="${phukien.dongia }" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>số Lượng</h5>
    								<input type="text"  name="soluong" value="${phukien.soluong }" >
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Hình Ảnh</h5>
    								<img class="hinhanh" src="data:image/png;base64,${phukien.hinhanh }" alt="" width="180px" height="180px">
  								</div>
  								<div class="textbox" style="margin-top:2%">
    								<h5>Đường dẫn tới hình ảnh:</h5>
    								<input type="text"  name="hinhanhnew" placeholder="C:\" value="" >
  								</div>
 
  							<input type="submit" class="btn" value="Cập Nhập" style="margin-top:5%">
						</form>
						
                </div>
            </div>

        </div>
    </div>
</body>

</html>