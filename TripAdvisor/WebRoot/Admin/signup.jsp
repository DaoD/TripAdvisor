<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Admin Sign Up</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Admin/signup.css">
	</head>
	<body>
		<div class="ui fixed menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Admin</div>
		</div>
		<div class="ui middle aligned center aligned grid">
			<div class="column">
				<h2 class="ui teal image header">
				  	<div class="content">
				    	Sign Up
				  	</div>
				</h2>
				<form class="ui large form" id="signupForm" action="adduser.jsp" method="post">
				  	<div class="ui stacked segment">
				    	<div class="field">
				      		<div class="ui left icon input">
				        		<i class="user icon"></i>
				        		<input type="text" name="username" placeholder="username" required>
				      		</div>
				    	</div>
					    <div class="field">
					      	<div class="ui left icon input">
					        	<i class="lock icon"></i>
					        	<input type="password" name="password" placeholder="password" required>
					      	</div>
					    </div>
					    <div class="field">
					      	<div class="ui left icon input">
					        	<i class="lock icon"></i>
					        	<input type="password" name="password2" placeholder="password again" required>
					      	</div>
					    </div>
					    <div class="field">
					      	<div class="ui left icon input">
					        	<i class="smile icon"></i>
					        	<input type="text" name="nickname" placeholder="nickname" required>
					      	</div>
					    </div>
					    <div class="field">
					      	<div class="ui left icon input">
					        	<i class="mail outline icon"></i>
					        	<input type="text" name="email" placeholder="email" required>
					      	</div>
					    </div>
					    <input type="hidden" name="type" value="0" />
				    	<input type="submit" class="ui fluid large teal submit button" value="sign up" />
				  	</div>
				</form>
				<div class="ui message">
			    	Already have an account ? <a href="signin.jsp">Sign in</a>
			    </div>
			</div>
		</div>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/Admin/signup.js"></script>
</html>