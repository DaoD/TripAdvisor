<%@page import="JavaBean.UserProfileOperateBean"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="serviceOperateBean" class="JavaBean.ServiceOperateBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Delete Service</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Admin/adduser.css">
	</head>
	<body>
		<div class="ui fixed menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Admin</div>
		</div>
		<div class="ui middle aligned center aligned grid">
			<div class="left aligned column">
				<%
					int serviceid = Integer.parseInt(request.getParameter("serviceid"));
					
					if(serviceOperateBean.deleteService(serviceid)) {
						response.sendRedirect("service.jsp");
 						return ;
 					}
					else {
					%>
					<div class="ui negative message">
						<div class="header">
							Error
						</div>
						<p>
							Something error with delete operation, please check your service and try again. <a href="service.jsp">Go back</a> now.
						</p>
					</div>
					
					<%
					}
				 %>
			 </div>
		 </div>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>