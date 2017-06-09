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
				request.getAttribute("airlinelist"); 
				if(request.getAttribute("fromcity") == null) {
					request.setAttribute("fromcity", "");
				}
				if(request.getAttribute("tocity") == null) {
					request.setAttribute("tocity", "");
				}
				if(request.getAttribute("departdate") == null) {
					request.setAttribute("departdate", "");
				}
				if(request.getAttribute("number") == null) {
					request.setAttribute("number", "");
				}
				if(request.getAttribute("flightclass") == null) {
					request.setAttribute("flightclass", "");
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
				<form class="ui form" action="searchairline.jsp">
					<h4 class="ui dividing header">Choose your flight back</h4>
					<div class="fields">
						<div class="four wide required field">
							<label>From</label>
							<div class="ui selection dropdown">
								<input type="hidden" name="fromcity" value="<% out.print(request.getAttribute("fromcity")); %>" required>
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
						<div class="four wide required field">		
							<label>To</label>
							<div class="ui selection dropdown">
								<input type="hidden" name="tocity" value="<% out.print(request.getAttribute("tocity")); %>" required>
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
						<div class="four wide required field">
							<label>Depart Date</label>
							<div class="ui calendar">
								<div class="ui input left icon">
									<i class="calendar icon"></i>
									<input type="text" placeholder="Date" name="departdate" value="<% out.print(request.getAttribute("departdate")); %>" required> 
								</div>
							</div>
						</div>
					</div>
					<div class="fields">
						<div class="three wide required field">
							<label>Number</label>
							<input type="text" placeholder="number" name="number" value="<% out.print(request.getAttribute("number")); %>" required>
						</div>
						<div class="three wide required field">
							<label>Class</label>
							<div class="ui selection dropdown">
								<input type="hidden" name="class" value="<% out.print(request.getAttribute("flightclass")); %>" required>
								<i class="dropdown icon"></i>
								<div class="default text">Class</div>
								<div class="menu">
									<div class="item" data-value="ec">
										Economy
									</div>
									<div class="item" data-value="bu">
										Business
									</div>
								</div>
							</div>	
						</div>
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
							<th>Flight Number</th>
							<th>Airline</th>
							<th>Class</th>
							<th>Depart Time</th>
							<th>Arrive Time</th>
							<th>Flght Time</th>
							<th class="price">Price</th>
							<th>Operate</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${airlinelist}" var="airline">
							<tr>
								<td id="flightno${airline.id}">${airline.flightno}</td>
								<td id="airline${airline.id}">${airline.airline}</td>
								<td id="flightclass${airline.id}">${airline.flightclass}</td>
								<td id="departtime${airline.id}">${airline.departtime}</td>
								<td id="arrivetime${airline.id}">${airline.arrivetime}</td>
								<td id="flighttime${airline.id}">${airline.flighttime}</td>
								<td id="price${airline.id}">${airline.price}</td>
								<td class="selectable"><a onclick="bookflight(${airline.id});">Book</a></td>
								<td hidden="hidden" id="departdate${airline.id}"><% out.print(request.getAttribute("departdate")); %></td>
								<td hidden="hidden" id="number${airline.id}"><% out.print(request.getAttribute("number")); %></td>
								<td hidden="hidden" id="fromcity${airline.id}">${airline.fromcity}</td>
								<td hidden="hidden" id="tocity${airline.id}">${airline.tocity}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<h4 class="ui dividing header">Flight Information</h4>
				<form action="book.jsp">
					<div class="ui card">
						<div class="content">
							<div class="header" id="cardheader"></div>
							<div class="meta" id="cardmeta"></div>
							<div class="description" id="carddescription"></div>
						</div>
						<button class="ui bottom attached button" id="submitbutton">
							<i class="add to calendar icon"></i>
							Book it!
						</button>
						<input type="hidden" value="" name="airline" id="bookairline">
						<input type="hidden" value="" name="flightid" id="bookflightid">
						<input type="hidden" value="" name="flightdate" id="bookflightdate">
						<input type="hidden" value="" name="flightnumber" id="bookflightnumber">
						<input type="hidden" value="" name="flightprice" id="bookflightprice">
						<input type="hidden" value="" name="flightno" id="bookflightno">
						<input type="hidden" value="" name="flightclass" id="bookflightclass">
						<input type="hidden" value="" name="flightdeparttime" id="bookflightdeparttime">
						<input type="hidden" value="" name="flightarrivetime" id="bookflightarrivetime">
						<input type="hidden" value="" name="flighttime" id="bookflighttime">
						<input type="hidden" value="" name="flightfromcity" id="bookfromcity">
						<input type="hidden" value="" name="flighttocity" id="booktocity">
						<input type="hidden" value="1" name="step">
					</div>
				</form>
				<h4 class="ui dividing header">Skip this step</h4>
				<a href="bookhotel.jsp" class="ui button">Skip</a>
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