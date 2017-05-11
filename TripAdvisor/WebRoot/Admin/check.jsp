<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="userBean" class="JavaBean.UserBean" scope="session" />
<jsp:useBean id="UserRegisterBean" class="JavaBean.UserRegisterBean" scope="session" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Check Sign In</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Admin/adduser.css">
	</head>
	<body>
		<div class="ui fixed menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Admin</div>
		</div>
		<div class="ui middle aligned center aligned grid">
			<% 
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				int type = Integer.parseInt(request.getParameter("type"));
				userBean.setUsername(username);
				userBean.setPassword(password);
				userBean.setType(type);
				try {
					UserRegisterBean.setUserBean(userBean);
					String nickname = UserRegisterBean.check();
					if(nickname != null) {
						session.setAttribute("nickname", nickname);
						response.sendRedirect("main.jsp");
 						return ;
					}
					else {
						%>
						<div class="left aligned column">
							<div class="ui negative message">
								<div class="header">
									Error
								</div>
								<p>
									Something error with your username and password. Please check it and try again.
									<br/>
									 <a href="signin.jsp">Return</a> to sign in page.
								</p>
							</div>
						</div>
						<%
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			%>
		</div>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>