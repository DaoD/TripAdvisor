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
		<link rel="stylesheet" type="text/css" href="../CSS/calendar.min.css" />
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
				<form class="ui form" action="searchhotel.jsp">
					<h4 class="ui dividing header">Book attractions</h4>
					<div class="fields">
						<div class="four wide field">
							<label>City</label>
							<div class="ui selection dropdown">
								<input type="hidden" name="fromcity">
								<i class="dropdown icon"></i>
								<div class="default text">City</div>
								<div class="menu">
									<div class="item" data-value="bj">
										Beijing
									</div>
									<div class="item" data-value="sh">
										Shanghai
									</div>
								</div>
							</div>		
						</div>
						<div class="three wide field">
							<label>Date</label>
							<div class="ui calendar">
								<div class="ui input left icon">
									<i class="calendar icon"></i>
									<input type="text" placeholder="Rent in date" name="fromdate"> 
								</div>
							</div>
						</div>
					</div>
					<div class="fields">
						<div class="six wide field">
							<label>Price range</label>
							<div class="two fields">
								<div class="field">
									<input type="text" name="startprice" placeholder="Price start">
								</div>
								<div class="field">
									<input type="text" name="endprice" placeholder="Price end">
								</div>
							</div>
						</div>
						<div class="three wide field">
							<label>Number</label>
							<input type="text" name="number" placeholder="Number">
						</div>
					</div>
					<input type="hidden" name="first" value="1">
					<button class="ui teal button">
						<i class="search icon"></i>
						Search
					</button>
				</form>
				<h4 class="ui dividing header">Result</h4>
				<table class="ui very basic sortable celled table">
					<thead>
						<tr>
							<th>Name</th>
							<th>Address</th>
							<th class="price">Price</th>
							<th>Operate</th>
						</tr>
					</thead>
					<tbody>
<%-- 						<c:forEach items="${airlinelist}" var="airline"> --%>
<!-- 							<tr> -->
<%-- 								<td id="flightno${airline.id}">${airline.flightno}</td> --%>
<%-- 								<td id="airline${airline.id}">${airline.airline}</td> --%>
<%-- 								<td hidden="hidden" id="fromcity${airline.id}">${airline.fromcity}</td> --%>
<%-- 								<td hidden="hidden" id="tocity${airline.id}">${airline.tocity}</td> --%>
<%-- 								<td id="flightclass${airline.id}">${airline.flightclass}</td> --%>
<%-- 								<td id="departtime${airline.id}">${airline.departtime}</td> --%>
<%-- 								<td id="arrivetime${airline.id}">${airline.arrivetime}</td> --%>
<%-- 								<td id="flighttime${airline.id}">${airline.flighttime}</td> --%>
<%-- 								<td id="price${airline.id}">${airline.price}</td> --%>
<%-- 								<td class="selectable"><a onclick="book(${airline.id});">Book</a></td> --%>
<!-- 							</tr> -->
<%-- 						</c:forEach> --%>
					</tbody>
				</table>
				<h4 class="ui dividing header">Car Information</h4>
				<div class="ui card">
					<div class="content"">
						<div class="header" id="cardheader"></div>
						<div class="meta" id="cardmeta"></div>
						<div class="description" id="carddescription"></div>
					</div>
				</div>
				<form action="bookhotel.jsp">
<!-- 					<input type="hidden" value="" name="flightno"> -->
<!-- 					<input type="hidden" value="" name="flightclass"> -->
<!-- 					<input type="hidden" value="" name="date"> -->
<!-- 					<input type="hidden" value="" name="number"> -->
<!-- 					<input type="hidden" value="" name="price"> -->
					<button class="ui teal right labeled icon button" id="submitbutton">
						<i class="add to calendar icon"></i>
						Book it!
					</button>
				</form>
				<h4 class="ui dividing header">Skip this step</h4>
				<a href="booklist.jsp" class="ui button">Skip</a>
			</div>
		</div>
		<% } %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/calendar.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/tablesort.js"></script>
	<script src="../JS/Client/diy.js"></script>
</html>