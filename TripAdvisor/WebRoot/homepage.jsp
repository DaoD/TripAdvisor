<%@ page contentType="text/html; charset=utf-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Homepage</title>
		<link rel="stylesheet" type="text/css" href="./CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="./CSS/homepage.css">
	</head>
	<body class="pushable">
		<div class="pusher">
			<div class="ui inverted vertical masthead center aligned segment">
				<div class="ui container">
					<div class="ui large secondary inverted pointing menu">
						<a class="active item">Home</a>
						<div class="right item">
							<a class="ui inverted button" href="Admin/signin.jsp">Company</a>
							<a class="ui inverted button" href="Client/signin.jsp">Individual</a>
						</div>
					</div>
				</div>
				<div class="ui text container">
					<h1 class="ui inverted header">TripAdvisor</h1>
					<h2>Best service from you and for you.</h2>
					<div class="ui huge primary button">
						Get Started 
						<i class="right arrow icon"></i>
					</div>
				</div>
			</div>
			<div class="ui vertical stripe quote segment">
				<div class="ui equal width stackable internally celled grid">
		      		<div class="center aligned row">
		       			<div class="column">
		          			<h3>"How convenient!"</h3>
		          			<p>That is what they all say about us</p>
		        		</div>
			        	<div class="column">
			          		<h3>"All what I want that I can find."</h3>
			          		<p>
			            		<img src="./IMG/nan.jpg" class="ui avatar image"> <b>Paddy</b> An user
			          		</p>
			        	</div>
		      		</div>
		    	</div>
			</div>
			<div class="ui vertical stripe segment">
				<div class="ui text container">
					<h3 class="ui header">Come! Come!</h3>
					<p>
						No matter you are company who provide service or you are just an user who want service. We TripAdvisor could give both you and you a nice experience.
						For company users, you can add your service in our system and then we will provide your service to our individual user. You only need to share your service
						API with us.
						For individual users, you can make your travel plan online and book service in our system. All the service providers are good cooperators through our 
						carefully selected.
					</p>
					
				</div>
			</div>
			<div class="ui inverted vertical footer segment">
				<div class="ui center aligned container">
					<div class="ui horizontal inverted divided link list">
						<a class="item">Contact Us</a>
						<a class="item">Privacy Policy</a>
					</div>
				</div>
			</div>
		</div>
	</body>
	<script src="./JS/jquery.min.js"></script>
	<script src="./JS/semantic.min.js"></script>
</html>