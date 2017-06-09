<%@ page import="java.util.List"%>
<%@ page import="JavaBean.OrderOperateBean"%>
<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Client</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Client/main.css">
	</head>
	<body>
		<div class="ui fixed inverted menu">
			<div class="header item">TripAdvisor</div>
			<a class="item" href="main.jsp">Client</a>
			<div class="active item">Order</div>
			<div class="right menu">
				<div class="item"><% out.print((String)session.getAttribute("username")); %></div>
				<a class="item" href="signout.jsp">Sign Out</a>
			</div>
		</div>
		<% 
			String username = (String)session.getAttribute("username");
			int userid = Integer.parseInt(String.valueOf(session.getAttribute("userid")));
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
				OrderOperateBean orderOperateBean = new OrderOperateBean();
				List<String> orderList = orderOperateBean.getUserOrderList(userid);
				request.setAttribute("orderlist", orderList); 
		%>
		<div class="ui container" id="maincontainer">
			<h3 class="ui dividing header">Order list</h3> 
			<div class="ui divided list">
				<% for(String str:orderList){ %>
					<div class="item">
						<div class="content">
							<a class="header" href="orderdetail.jsp?orderid=<% out.print(str.split(",")[2]); %>">Order <% out.print(str.split(",")[0]); %></a>
							<div class="description">Order time: <% out.print(str.split(",")[1]); %></div>
						</div>
					</div>
				<% } %>
			</div>
			
		</div>
		<% } %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/Admin/main.js"></script>
</html>