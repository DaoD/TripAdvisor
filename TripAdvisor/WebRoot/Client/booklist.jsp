<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%-- <%@ page import="JavaBean.AirlineOperateBean"%> --%>
<%-- <%@ page import="JavaBean.AirlineBean"%> --%>
<%-- <jsp:useBean id="airlineBean" class="JavaBean.AirlineBean" scope="request" /> --%>
<%-- <jsp:useBean id="airlineOperateBean" class="JavaBean.AirlineOperateBean" scope="request" /> --%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Client</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Client/diy.css">
	</head>
	<body>
		<div class="ui fixed inverted menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Client</div>
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
// 				request.getAttribute("airlinelist"); 
		%>
		<div class="ui container" id="mainframe">
			<div class="ui segment">
				<form class="ui form" action="bookit.jsp">
					<h4 class="ui dividing header">The services you have chosen:</h4>
					<div class="ui one cards">
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span>东方航空</span> 
									<span>MU3121</span>
								</div>
								<div class="meta">
									<span>北京-上海</span>
									<span>经济舱</span>
								</div>
								<div class="description">
									<span>2017年5月1日</span>
									<span>07:00-10:00</span> 
									<span>3h</span> 
									<br/>
									<span>2张</span>
									<span>共 1080元</span>
								</div>
							</div>
						</div>
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span>中国国航</span> 
									<span>CA3001</span>
								</div>
								<div class="meta">
									<span>上海-北京</span>
									<span>经济舱</span>
								</div>
								<div class="description">
									<span>2017年5月7日</span>
									<span>15:15-18:30</span> 
									<span>3h15m</span> 
									<br/>
									<span>2张</span>
									<span>共 1980元</span>
								</div>
							</div>
						</div>
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span>如家快捷酒店</span> 
									<span>大床房</span>
								</div>
								<div class="meta">
									<span>上海</span>
									<span>xx区xx路xx号</span>
								</div>
								<div class="description">
									<span>入住日期：2017年5月1日</span>
									<span>退房日期：2017年5月7日</span> 
									<br/>
									<span>6天</span>
									<span>2间</span>
									<span>共 3600元</span>
								</div>
							</div>
						</div>
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span>神州租车</span> 
									<span>宝马A320</span>
								</div>
								<div class="meta">
									<span>上海</span>
								</div>
								<div class="description">
									<span>取车日期：2017年5月1日</span>
									<span>归还日期：2017年5月7日</span> 
									<br/>
									<span>6天</span>
									<span>最大乘客数：5人</span>
									<span>共 3000元</span>
								</div>
							</div>
						</div>
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span>香山</span> 
								</div>
								<div class="meta">
									<span>北京</span>
								</div>
								<div class="description">
									<span>参观日期：2017年5月3日</span>
									<span>2张</span>
									<span>共 元</span>
								</div>
							</div>
						</div>
					</div>
					<button class="ui teal button" id="listsubmit">Book it now</button>
				</form>
			</div>
		</div>
		<% } %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/Client/diy.js"></script>
</html>