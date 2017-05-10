<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="userBean" class="JavaBean.UserBean" scope="request" />
<jsp:useBean id="registerBean" class="JavaBean.UserRegisterBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Check Sign Up</title>
	</head>
	<body>
		<%
			String username = request.getParameter("usernmae");
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
					out.println("username already used");
					%><a href="signup.jsp">Return</a><%
				}
				else {
					out.println("success");
					%><a href="signin.jsp">Sign In Now</a><%
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		 %>
	</body>
</html>