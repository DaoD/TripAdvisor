<%@page import="JavaBean.ServiceBean"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<jsp:useBean id="serviceBean" class="JavaBean.ServiceBean" scope="request" />
<jsp:useBean id="serviceOperateBean" class="JavaBean.ServiceOperateBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Admin</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Admin/main.css">
	</head>
	<body>
		<div class="ui fixed menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Admin</div>
			<div class="right menu">
				<div class="item"><% out.print((String)session.getAttribute("username")); %></div>
				<a class="item" href="signout.jsp">Sign Out</a>
			</div>
		</div>
		<% 
			String username = (String)session.getAttribute("username");
			if(username == null) {
				%> 
					<div class="ui middle aligned center aligned grid">
						<div class="left aligned column">
							<div class="ui negative message">
								<div class="header">
									Error
								</div>
								<p>
									Sign in time out or something error with this page. Please sign in again.
									<br/>
									 <a href="signin.jsp">Return</a> to sign in page.
								</p>
							</div>
						</div>
					</div>
				
				<%
			}
			else {
				int userid = Integer.parseInt(String.valueOf(session.getAttribute("userid")));
				List<ServiceBean> servicelist = serviceOperateBean.getAllServices(userid);
				request.setAttribute("servicelist", servicelist); 
		%>
		<div class="ui grid" id="mainframe">
			<div class="row">
				<div class="four wide column">
					<div class="ui vertical pointing menu">
						<a class="item" href="main.jsp">Profile</a>
						<a class="active item" href="service.jsp">Service</a>
					</div>
				</div>
				<div class="twelve wide stretched column">
					<div class="ui segment">
						<form class="ui form" action="addservice.jsp">
							<h4 class="ui dividing header">
								Add Service	
							</h4>
							<div class="fields">
								<div class="four wide field">
									<input type="text" placeholder="Service Name" name="servicename" required>
								</div>
								<div class="twelve wide field">
									<div class="ui action labeled input">
										<div class="ui label">http://</div>
										<input type="text" placeholder="wsdl file address" name="wsdladdress" required>
										<button class="ui teal right labeled icon button">
											<i class="plus icon"></i>
											Add
										</button>
									</div>
								</div>
							</div>
							<div class="field">
							    <textarea rows="3" placeholder="Note" name="note"></textarea>
							</div>
							<input type="hidden" name="userid" value="<% out.print(session.getAttribute("userid")); %>">
						</form>
						<h4 class="ui dividing header">
								Service list
							</h4>
							<table class="ui very basic selectable celled table">
								<thead>
									<tr>
										<th>Name</th>
										<th>WSDL Address</th>
										<th>Add Time</th>
										<th>Notes</th>
										<th>Operation</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${servicelist}" var="service">
										<tr>
											<td>${service.servicename}</td>	
											<td>${service.wsdladdress}</td>
											<td>${service.addtime}</td>
											<td>${service.note}</td>
											<td><a href="">Delete</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
					</div>
				</div>
			</div>	
		</div>
		<% } %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/Admin/main.js"></script>
</html>