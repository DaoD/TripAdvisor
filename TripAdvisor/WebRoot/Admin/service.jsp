<%@ page contentType="text/html; charset=utf-8" %>

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
				<a class="item" href="signin.jsp">Sign Out</a>
			</div>
		</div>
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
						<form class="ui form" action="">
							<h4 class="ui dividing header">
								Add Service	
							</h4>
							<div class="twelve wide field">
								<div class="ui action labeled input">
									<div class="ui label">http://</div>
									<input type="text" placeholder="wsdl file address">
									<button class="ui teal right labeled icon button">
										<i class="plus icon"></i>
										Add
									</button>
								</div>
							</div>
							<h4 class="ui dividing header">
								Service list
							</h4>
<!-- 							<div class="ui middle aligned divided list"> -->
<!-- 								<div class="item"> -->
<!-- 									<div class="right floated content"> -->
<!-- 										<div class="ui button">Delete</div> -->
<!-- 									</div> -->
<!-- 									<div class="content"> -->
<!-- 										<div class="header">Service Name</div> -->
<!-- 										<div class="description">Add time: 2017/05/01</div> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 							</div> -->
							<table class="ui very basic selectable celled table">
								<thead>
									<tr>
										<th>Name</th>
										<th>Add Time</th>
										<th>Notes</th>
										<th>Operation</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Test1</td>	
										<td>2017/05/01</td>
										<td></td>
										<td><a href="">Delete</a></td>
									</tr>
								</tbody>
							</table>
						</form>
					</div>
				</div>
			</div>	
		</div>
		
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/Admin/main.js"></script>
</html>