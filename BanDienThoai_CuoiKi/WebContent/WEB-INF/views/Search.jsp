<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"/>    
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet"/>   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <style><%@include file="css/main.css"%></style> 
    <style><%@include file="css/style.css"%></style>
    <title>Thế Giới Điện Thoại</title>
  </head>
  <body>
 
     <jsp:include page="_header.jsp"></jsp:include>
    <!-- Điện thoại nổi bật -->
    <div class="container">
    <c:if test = "${listdienthoai != null }">
        	<div class="chungtatca">
            	<ul class="dschung">
            		<%int i =1;%>
					<c:forEach items="${listdienthoai}" var="dt">
                	<li class="lichung">
                    	<ul>
                        	<li class="img">
                            	<a href="DienThoai?maDT=${dt.maDT}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                	<img class="hinhanh" src="data:image/png;base64,${dt.hinhanh }" alt="" width="180px" height="180px">
                                	<h4>${dt.ten}</h4>
                            	</a>
                        	</li>
                        	<li class="button">
                            	<span></span>
                        	</li>
                        	<li class="money">
                            	<strong>${dt.dongia }  đ</strong>
                        	</li>
                    	</ul>
                	</li>
                	<%if(i ==4){
					i=0;
					out.print("</ul>");
					out.print("<ul class='dschung'>");
					}%>
					<%i =i+1;%>
					</c:forEach>
					</ul>
        	</div>
    </c:if>
    <!-- laptop nổi bật -->
    <c:if test = "${listLapTop != null }">
        	<div class="chungtatca">
            	<ul class="dschung">
            	<%int lt =1; %>
            	<c:forEach items="${ listLapTop}" var="laptop">
                	<li class="lichung">
                    	<ul>
                        	<li class="img">
                            	<a href="LapTop?maLT=${laptop.maLT}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                	<img class="hinhanh" src="data:image/png;base64,${laptop.hinhanh }" alt="" width="180px" height="120px">
                                	<h4>${laptop.ten }</h4>
                            	</a>
                        	</li>
                        	<li class="button" style="margin-top:50px">
                            	<span>${laptop.dacdiem1}</span>
                            	<span>${laptop.dacdiem2 }</span>
                        	</li>
                        	<li class="money">
                            	<strong>${laptop.dongia}</strong>
                        	</li>
                    	</ul>
                	</li>
                	<%if(lt ==4){
					lt=0;
					out.print("</ul>");
					out.print("<ul class='dschung'>");
					}%>
					<%lt =lt+1;%>
					</c:forEach>
				</ul>
        	</div>
    </c:if>
    <!-- tablet nổi bật -->
    <c:if test="${listTablet !=null }">
        	<div class="chungtatca">
            	<ul class="dschung">
            	<%int tb =1; %>
				<c:forEach items="${listTablet}" var="tb">
                	<li class="lichung">
                    	<ul>
                        	<li class="img">
                            	<a href="Tablet?maTB=${tb.maTB}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                	<img class="hinhanh" src="data:image/png;base64,${tb.hinhanh }" alt="" width="180px" height="180px">
                                	<h4>${tb.ten }</h4>
                            	</a>
                        	</li>
                        	<li class="button">
                            	<span></span>
                            	<span></span>
                        	</li>
                        	<li class="money">
                            	<strong>${tb.dongia } đ</strong>
                        	</li>
                    	</ul>
                	</li>
                	<%if(tb ==4){
					tb=0;
					out.print("</ul>");
					out.print("<ul class='dschung'>");
					}%>
					<%tb =tb+1;%>
					</c:forEach>
            	</ul>
        	</div>
    </c:if>
    <c:if test="${listPhuKien != null }">
        	<div class="chungtatca">
            	<ul class="dschung">
            	<%int pk =1; %>
				<c:forEach items="${listPhuKien}" var="pk">
                	<li class="lichung">
                    	<ul>
                        	<li class="img">
                            	<a href="PhuKien?maPK=${pk.maPK}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                               		<img class="hinhanh" src="data:image/png;base64,${pk.hinhanh }" alt="" width="180px" height="180px">
                                	<h4>${pk.ten}</h4>
                            	</a>
                        	</li>
                        	<li class="button">
                            	span>${pk.dacdiem1}</span>
                    			<span>${pk.dacdiem2}</span>
                        	</li>
                        	<li class="money">
                            	<strong>${pk.dongia} đ</strong>
                        	</li>
                    	</ul>
                	</li>
                	<%if(pk ==4){
					pk=0;
					out.print("</ul>");
					out.print("<ul class='dschung'>");
					}%>
					<%pk =pk+1;%>
					</c:forEach>
            	</ul>
        	</div>
    </c:if>
    <c:if test="${listDongHo != null }">
        	<div class="chungtatca">
            	<ul class="dschung">
            	<%int dh =1; %>
				<c:forEach items="${listDongHo}" var="dh">
               		<li class="lichung">
                    	<ul>
                        	<li class="img">
                            	<a href="DongHo?maDH=${dh.maDH}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                	<img class="hinhanh" src="data:image/png;base64,${dh.hinhanh }" alt="" width="180px" height="180px">
                                	<h4>${dh.ten}</h4>
                            	</a>
                        	</li>
                        	<li class="button" style="margin-top:50px">
                            	<span>${dh.dacdiem1 }</span>
                    			<span>${dh.dacdiem2 }</span>
                        	</li>
                        	<li class="money">
                            	<strong>${dh.dongia} đ</strong>
                        	</li>
                    	</ul>
                	</li>
                	<%if(dh ==4){
					dh=0;
					out.print("</ul>");
					out.print("<ul class='dschung'>");
					}%>
					<%dh =dh+1;%>
					</c:forEach>
            	</ul>
        	</div>
    </c:if>
    <c:if test="${listPC != null }">
        	<div class="chungtatca">
            	<ul class="dschung">
            	<%int pc =1; %>
				<c:forEach items="${listPC}" var="pc">
               		<li class="lichung">
                    	<ul>
                        	<li class="img">
                            	<a href="DongHo?maDH=${pc.maPC}&tenkhachhang=${tenkhachhang }&tenTK=${tenTK}">
                                	<img class="hinhanh" src="data:image/png;base64,${pc.hinhanh }" alt="" width="180px" height="180px">
                                	<h4>${pc.ten}</h4>
                            	</a>
                        	</li>
                        	<li class="button" style="margin-top:50px">
                            	<span>${pc.dacdiem1 }</span>
                    			<span>${pc.dacdiem2 }</span>
                        	</li>
                        	<li class="money">
                            	<strong>${pc.dongia} đ</strong>
                        	</li>
                    	</ul>
                	</li>
                	<%if(pc ==4){
					pc=0;
					out.print("</ul>");
					out.print("<ul class='dschung'>");
					}%>
					<%pc =pc+1;%>
					</c:forEach>
            	</ul>
        	</div>
    </c:if>
    </div>
     <jsp:include page="_footer.jsp"></jsp:include> 
  </body>
</html>
