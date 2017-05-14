<%@page import="JavaBean.UserProfileOperateBean"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="serviceBean" class="JavaBean.ServiceBean" scope="request" />
<jsp:useBean id="serviceOperateBean" class="JavaBean.ServiceOperateBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Add Service</title>
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
					int userid = Integer.parseInt(request.getParameter("userid"));
					String servicename = request.getParameter("servicename");
					String wsdladdress = request.getParameter("wsdladdress");
					String note = request.getParameter("note");
					
					serviceBean.setUserid(userid);
					serviceBean.setServicename(servicename);
					serviceBean.setWsdladdress(wsdladdress);
					serviceBean.setNote(note);
					
					try {
						serviceOperateBean.setServiceBean(serviceBean);
						if(serviceOperateBean.addService()) {
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
								Something error with add operation, please check your service and try again. <a href="service.jsp">Go back</a> now.
							</p>
						</div>
						
						<%
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
				 %>
			 </div>
		 </div>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>