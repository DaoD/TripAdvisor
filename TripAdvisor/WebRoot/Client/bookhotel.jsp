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
				request.getAttribute("hotellist"); 
				if(request.getAttribute("city") == null) {
					request.setAttribute("city", "");
				}
				if(request.getAttribute("fromdate") == null) {
					request.setAttribute("fromdate", "");
				}
				if(request.getAttribute("todate") == null) {
					request.setAttribute("todate", "");
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
				<form class="ui form" action="searchhotel.jsp">
					<h4 class="ui dividing header">Choose your hotel</h4>
					<div class="fields">
						<div class="four wide required field">
							<label>City</label>
							<div class="ui selection dropdown">
								<input type="hidden" name="city" value="<% out.print(request.getAttribute("city")); %>">
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
						<div class="six wide required field">
							<label>Date</label>
							<div class="two fields">
								<div class="field">
									<div class="ui calendar">
										<div class="ui input left icon">
											<i class="calendar icon"></i>
											<input type="text" placeholder="Check in date" name="fromdate" value="<% out.print(request.getAttribute("fromdate")); %>" required> 
										</div>
									</div>
								</div>
								<div class="field">
									<div class="ui calendar">
										<div class="ui input left icon">
											<i class="calendar icon"></i>
											<input type="text" placeholder="Check out date" name="todate" value="<% out.print(request.getAttribute("todate")); %>" required> 
										</div>
									</div>
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
							<input type="text" placeholder="number" name="number" value="<% out.print(request.getAttribute("number")); %>" required>
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
							<th>Hotel Name</th>
							<th>Address</th>
							<th>Star</th>
							<th>Room Type</th>
							<th class="price">Price</th>
							<th>Operate</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${hotellist}" var="hotel">
							<tr>
								<td id="hotelname${hotel.id}">${hotel.name}</td>
								<td id="address${hotel.id}">${hotel.address}</td>
								<td id="star${hotel.id}">${hotel.star}</td>
								<td id="roomtype${hotel.id}">${hotel.roomtype}</td>
								<td id="price${hotel.id}">${hotel.price}</td>
								<td class="selectable"><a onclick="bookhotel(${hotel.id});">Book</a></td>
								<td hidden="hidden" id="fromdate${hotel.id}"><% out.print(request.getAttribute("fromdate")); %></td>
								<td hidden="hidden" id="todate${hotel.id}"><% out.print(request.getAttribute("todate")); %></td>
								<td hidden="hidden" id="number${hotel.id}"><% out.print(request.getAttribute("number")); %></td>
								<td hidden="hidden" id="location${hotel.id}">${hotel.location}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<h4 class="ui dividing header">Hotel Information</h4>
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
						<input type="hidden" value="" name="hotelname" id="bookhotelname">
						<input type="hidden" value="" name="hoteltype" id="bookhoteltype">
						<input type="hidden" value="" name="hotelfromdate" id="bookhotelfromdate">
						<input type="hidden" value="" name="hoteltodate" id="bookhoteltodate">
						<input type="hidden" value="" name="hoteldays" id="bookhoteldays">
						<input type="hidden" value="" name="hotelprice" id="bookhotelprice">
						<input type="hidden" value="" name="hotelnumber" id="bookhotelnumber">
						<input type="hidden" value="" name="hotelid" id="bookhotelid">
						<input type="hidden" value="" name="hoteladderss" id="bookhoteladdress">
						<input type="hidden" value="" name="hotelstar" id="bookhotelstar">
						<input type="hidden" value="" name="hotellocation" id="bookhotellocation">
						<input type="hidden" value="2" name="step">
					</div>
				</form>
				<h4 class="ui dividing header">Skip this step</h4>
				<a href="bookcar.jsp" class="ui button">Skip</a>
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