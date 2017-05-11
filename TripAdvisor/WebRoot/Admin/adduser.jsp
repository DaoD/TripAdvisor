<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="userBean" class="JavaBean.UserBean" scope="request" />
<jsp:useBean id="registerBean" class="JavaBean.UserRegisterBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Check Sign Up</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Admin/adduser.css">
	</head>
	<body>
		<div class="ui fixed menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Admin</div>
		</div>
		<div class="ui middle aligned center aligned grid">
			<div class="left aligned column">
				<%
					String username = request.getParameter("username");
					String password = request.getParameter("password");
					String email = request.getParameter("email");
					String nickname = request.getParameter("nickname");
					int type = Integer.parseInt(request.getParameter("type"));
					
					userBean.setUsername(username);
					userBean.setPassword(password);
					userBean.setEmail(email);
					userBean.setNickname(nickname);
					userBean.setType(type);
					
					try {
						registerBean.setUserBean(userBean);
						if(registerBean.register() == 1) {
						%>
						<div class="ui negative message">
							<div class="header">
								Error
							</div>
							<p>
								Your username or nickname has been already used. Please try again.
								<br/>
								 <a href="signup.jsp">Return</a> to sign up page.
							</p>
						</div>
						<%
						}
						else {
						%>
						<div class="ui positive message">
							<div class="header">
								Success
							</div>
							<p>
								Your sign up process finished. <a href="signin.jsp">Sign In</a> now.
							</p>
						</div>
						
						<%
						}
					}catch(Exception e) {
						e.printStackTrace();
					}
				 %>
			 </div>
		 </div>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>