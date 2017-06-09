<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

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
				request.getAttribute("attractionlist"); 
				if(request.getAttribute("city") == null) {
					request.setAttribute("city", "");
				}
				if(request.getAttribute("date") == null) {
					request.setAttribute("date", "");
				}
				if(request.getAttribute("number") == null) {
					request.setAttribute("number", "");
				}
				if(request.getAttribute("startprice") == null) {
					request.setAttribute("startprice", "");
				}
				if(request.getAttribute("endprice") == null) {
					request.setAttribute("endprice", "");
				}
		%>
		<div class="ui container" id="mainframe">
			<div class="ui segment">
				<form class="ui form" action="searchattraction.jsp">
					<h4 class="ui dividing header">Book attractions</h4>
					<div class="fields">
						<div class="four wide required field">
							<label>City</label>
							<div class="ui selection dropdown">
								<input type="hidden" name="city" value="<% out.print(request.getAttribute("city")); %>" required>
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
						<div class="three wide required field">
							<label>Date</label>
							<div class="ui calendar">
								<div class="ui input left icon">
									<i class="calendar icon"></i>
									<input type="text" placeholder="Date" name="date" value="<% out.print(request.getAttribute("date")); %>" required> 
								</div>
							</div>
						</div>
					</div>
					<div class="fields">
						<div class="six wide field">
							<label>Price range</label>
							<div class="two fields">
								<div class="field">
									<input type="text" name="startprice" placeholder="Price start" value="<% out.print(request.getAttribute("startprice")); %>">
								</div>
								<div class="field">
									<input type="text" name="endprice" placeholder="Price end" value="<% out.print(request.getAttribute("endprice")); %>">
								</div>
							</div>
						</div>
						<div class="three wide required field">
							<label>Number</label>
							<input type="text" name="number" placeholder="Number" value="<% out.print(request.getAttribute("number")); %>" required>
						</div>
					</div>
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
						<c:forEach items="${attractionlist}" var="attraction">
							<tr>
								<td id="name${attraction.id}">${attraction.name}</td>
								<td id="location${attraction.id}">${attraction.location}</td>
								<td id="price${attraction.id}">${attraction.price}</td>
								<td class="selectable"><a onclick="bookattraction(${attraction.id});">Book</a></td>
								<td hidden="hidden" id="date${attraction.id}"><% out.print(request.getAttribute("date")); %></td>
								<td hidden="hidden" id="number${attraction.id}"><% out.print(request.getAttribute("number")); %></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<h4 class="ui dividing header">Attraction Information</h4>
				<form action="book.jsp">
					<div class="ui cards" id="attractioncards">
						
					</div>
					<input type="hidden" value="" name="idlist" id="idlist">
					<input type="hidden" value="4" name="step" >
					<button class="ui button" id="submitbutton">
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