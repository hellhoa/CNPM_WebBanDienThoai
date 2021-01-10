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
						<table border="1" cellpadding="30" cellspacing="10" width="100%">
       						<tr  align="center">
          						<th >Mã Sản Phẩm</th>
          						<th >Loại Sản Phẩm</th>
          						<th>Tên Sản Phẩm</th>
          						<th>Đơn Giá</th>
          						<th>Số Lượng</th>
          						<th id="chinhsua" >Chỉnh Sửa Sản Phẩm</th>
          						<th id = "xoa">Xóa Sản Phẩm</th>
          						
       						</tr>
       						<c:forEach items="${listdienthoai}" var="dt" >
          					<tr align="center">
             					<td>${dt.maDT}   </td>
             					<td>Điện thoại </td>
             					<td>${dt.ten}   </td>
             					<td style="padding-left:10px;padding-right:10px">     ${dt.dongia}VND  </td>
             					<td>${dt.soluong}</td>
             					<td class="chinhsuadt">
                					<a href="chinhsuasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${dt.maDT}">Chỉnh Sửa Sản Phẩm </a>
             					</td>
             					<td class="xoadt">
                					<a href="xoasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${dt.maDT}">Xóa Sản Phẩm  </a>
             					</td>
          					</tr>
       						</c:forEach>
       						<c:forEach items="${listpc}" var="pc" >
          					<tr align="center">
             					<td>${pc.maPC}   </td>
             					<td>PC </td>
             					<td>${pc.ten}   </td>
             					<td>${pc.dongia} VND </td>
             					<td>${pc.soluong}</td>
             					<td class="chinhsuapc">
                					<a href="chinhsuasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${pc.maPC}">Chỉnh Sửa Sản Phẩm </a>
             					</td>
             					<td class="xoapc">
                					<a href="xoasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${pc.maPC}">Xóa Sản Phẩm  </a>
             					</td>
          					</tr>
       						</c:forEach>
       						<c:forEach items="${listlaptop}" var="laptop" >
          					<tr align="center">
             					<td>${laptop.maLT}   </td>
             					<td>LapTop </td>
             					<td>${laptop.ten}   </td>
             					<td>${laptop.dongia} VND  </td>
             					<td>${laptop.soluong }</td>
             					<td class="chinhsualt">
                					<a href="chinhsuasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${laptop.maLT}">Chỉnh Sửa Sản Phẩm </a>
             					</td>
             					<td class="xoalt">
                					<a href="xoasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${laptop.maLT}">Xóa Sản Phẩm  </a>
             					</td>
          					</tr>
       						</c:forEach>
       						<c:forEach items="${listtablet}" var="tb" >
          					<tr align="center">
             					<td>${tb.maTB}   </td>
             					<td>Tablet </td>
             					<td>${tb.ten}   </td>
             					<td>${tb.dongia} VND  </td>
             					<td>${tb.soluong}</td>
             					<td class="chinhsuatb">
                					<a href="chinhsuasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${tb.maTB}">Chỉnh Sửa Sản Phẩm </a>
             					</td>
             					<td class="xoatb">
                					<a href="xoasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${tb.maTB}">Xóa Sản Phẩm  </a>
             					</td>
          					</tr>
       						</c:forEach>
       						<c:forEach items="${listdongho}" var="dh" >
          					<tr align="center">
             					<td>${dh.maDH}   </td>
             					<td>Đồng Hồ </td>
             					<td>${dh.ten}   </td>
             					<td>${dh.dongia} VND  </td>
             					<td>${dh.soluong}</td>
             					<td class="chinhsuadh">
                					<a href="chinhsuasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${dh.maDH}">Chỉnh Sửa Sản Phẩm </a>
             					</td>
             					<td class="xoadh">
                					<a href="xoasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${dh.maDH}">Xóa Sản Phẩm  </a>
             					</td>
          					</tr>
       						</c:forEach>
       						<c:forEach items="${listphukien}" var="pk" >
          					<tr align="center">
             					<td>${pk.maPK}   </td>
             					<td>Phụ Kiện</td>
             					<td>${pk.ten}   </td>
             					<td>${pk.dongia} VND </td>
             					<td>${pk.soluong}</td>
             					<td class="chinhsuapk">
                					<a href="chinhsuasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${pk.maPK}">Chỉnh Sửa Sản Phẩm </a>
             					</td>
             					<td class="xoapk">
                					<a href="xoasanpham?tenAdmin=${tenAdmin}&maAD=${maAD}&maSP=${pk.maPK}">Xóa Sản Phẩm  </a>
             					</td>
          					</tr>
       						</c:forEach>
    					</table>
       						<a href="themsanpham?tenAdmin=${tenAdmin}&maAD=${maAD}">Thêm Sản Phẩm  </a>
					
                </div>
            </div>
        </div>
    </div>
    </div>
    <c:if test="${phanquyen == 'nhanvien' }">
    	<script>
    		document.getElementById('taikhoan').style.display ='none';
    		$(".chinhsuadt").hide();
    		$(".xoadt").hide();
    		document.getElementById('chinhsua').style.display='none';
    		document.getElementById('xoa').style.display = 'none';
			$(".chinhsualt").hide();
			$(".xoalt").hide();
			$(".chinhsuadh").hide();
			$(".xoadh").hide();
			$(".chinhsuapk").hide();
			$(".xoapk").hide();
			$(".chinhsuapc").hide();
			$(".xoapc").hide();
			$(".chinhsuatb").hide();
			$(".xoatb").hide();
    	</script>
    </c:if>
</body>

</html>