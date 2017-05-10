<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Admin Sign Up</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Admin/signup.css">
		<script src="../JS/jquery.min.js"></script>
		<script src="../JS/semantic.min.js"></script>
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
				<form class="ui large form" action="" method="post">
				  	<div class="ui stacked segment">
				    	<div class="field">
				      		<div class="ui left icon input">
				        		<i class="user icon"></i>
				        		<input type="text" name="username" placeholder="username">
				      		</div>
				    	</div>
					    <div class="field">
					      	<div class="ui left icon input">
					        	<i class="lock icon"></i>
					        	<input type="password" name="password" placeholder="password">
					      	</div>
					    </div>
					    <div class="field">
					      	<div class="ui left icon input">
					        	<i class="lock icon"></i>
					        	<input type="password" name="password2" placeholder="password again">
					      	</div>
					    </div>
					    <div class="field">
					      	<div class="ui left icon input">
					        	<i class="smile icon"></i>
					        	<input type="text" name="nickname" placeholder="nickname">
					      	</div>
					    </div>
					    <div class="field">
					      	<div class="ui left icon input">
					        	<i class="mail outline icon"></i>
					        	<input type="text" name="email" placeholder="email">
					      	</div>
					    </div>
				    	<input type="submit" class="ui fluid large teal submit button" value="sign up" />
				  	</div>
				</form>
				<div class="ui message">
			    	Already have an account ? <a href="">Sign in</a>
			    </div>
			</div>
		</div>
	</body>
</html>