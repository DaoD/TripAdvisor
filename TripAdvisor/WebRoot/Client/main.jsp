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
			<div class="active item">Client</div>
			<a class="item" href="orderlist.jsp">Order</a>
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
			
		%>
		<div class="ui container" id="maincontainer">
			<h3 class="ui dividing header">Hot Plan</h3> 
			<div class="ui cards">
				<div class="card">
					<div class="content">
						<a href="orderdetail.jsp?orderid=7&hotplan=1"><i class="right floated info icon"></i></a>
						<div class="header">Beijing 7-days Trip for Couple</div>
						<div class="meta">Booking Times: 700+</div>
						<div class="description">
							<div class="ui list">
								<div class="item">Round-trip Flight Ticket</div>
								<div class="item">High Cost-performance Hotel</div>
								<div class="item">Great Attractions</div>
							</div>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="content">
						<a href="orderdetail.jsp?orderid=8&hotplan=1"><i class="right floated info icon"></i></a>
						<div class="header">Beijing 5-days Trip for Single</div>
						<div class="meta">Booking Times: 200+</div>
						<div class="description">
							<div class="ui list">
								<div class="item">Round-trip Flight Ticket</div>
								<div class="item">5-star Hotel</div>
								<div class="item">Maserati Quattroporte</div>
								<div class="item">Most Famous Attractions</div>
							</div>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="content">
						<a href="orderdetail.jsp?orderid=9&hotplan=1"><i class="right floated info icon"></i></a>
						<div class="header">Shanghai 6-days Trip for Family</div>
						<div class="meta">Booking Times: 100+</div>
						<div class="description">
							<div class="ui list">
								<div class="item">Round-trip Flight Ticket</div>
								<div class="item">Family room</div>
								<div class="item">Economy car</div>
								<div class="item">All Famous Attractions</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="ui divider"></div>
			<div class="ui vertical stripe segment">
				<div class="ui middle aligned stackable grid container">
					<div class="row">
						<div class="eight wide column">
							<h3 class="ui header">DIY? Why not?</h3>
							<p>Maybe none of the hot plan can touch your heart, but please don't worry, my mate. We have a big surprise for you! 
							<br/>
							Instead of choosing the hot plan. You can customize your own plan now! What are you waiting for?</p>
							<h3 class="ui header">Best service for best you.</h3>
							<p>You can just choose which service you need and all of the services we can help you to book.
							<br/>
							We only provide best service!
							</p>
						</div>
						<div class="six wide right floated column">
							<img src="../IMG/pic2.jpg" class="ui large bordered rounded image">
						</div>
					</div>
					<div class="row">
						<div class="center aligned column">
							<a class="ui huge teal button" href="bookfirstflight.jsp">Make it now!</a>
						</div>
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