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
          						<th width="14%">Mã Bài Viết</th>
          						<th width="14%">Mã Sản Phẩm</th>
          						<th width="14%">Tiêu Đề</th>
          						<th width="14%" id="chinhsua">Chỉnh Sửa Bài Viết</th>
          						<th width="14%" id="xoa">Xóa Bài Viết</th>
          						
       						</tr>
       						<c:forEach items="${danhsachbaiviet}" var="bv" >
          					<tr align="center">
             					<td>${bv.mabaiviet}   </td>
             					<td>${bv.masp}   </td>
             					<td>${bv.tieude}  </td>
             					<td class="chinhsuabaiviet">
                					<a href="chinhsuabaiviet?tenAdmin=${tenAdmin }&maAD=${maAD}&masp=${bv.masp }">Chỉnh sửa bài viết  </a>
             					</td>
             					<td class="xoabaiviet">
                					<a href="xoabaiviet?tenAdmin=${tenAdmin }&maAD=${maAD}&mabaiviet=${bv.mabaiviet }">Xóa Bài Viết  </a>
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
    	document.getElementById('taikhoan').style.display ='none';
    	$(".chinhsuabaiviet").hide();
    	$(".xoabaiviet").hide();
    	document.getElementById('chinhsua').style.display ='none';
    	document.getElementById('xoa').style.display = 'none';
    </script>
    </c:if>
</body>

</html>