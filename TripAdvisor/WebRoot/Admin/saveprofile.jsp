<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.sql.*" %>
<jsp:useBean id="userProfileBean" class="JavaBean.UserProfileBean" scope="request" />
<jsp:useBean id="userprofileSaveBean" class="JavaBean.UserProfileSaveBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Save Profile</title>
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
					int userid = Integer.parseInt(request.getParameter("userid"));
					String companyname = request.getParameter("companyName");
					String contactnumber = request.getParameter("contactNumber");
					String country = request.getParameter("country");
					String state = request.getParameter("state");
					String address = request.getParameter("companyAddress");
					String zipcode = request.getParameter("ZIPCode");
					
					System.out.println(userid);
					userProfileBean.setUserid(userid);
					userProfileBean.setCompanyName(companyname);
					userProfileBean.setContactNumber(contactnumber);
					userProfileBean.setCountry(country);
					userProfileBean.setState(state);
					userProfileBean.setAddress(address);
					userProfileBean.setZipcode(zipcode);
					
					try {
						userprofileSaveBean.setUserProfileBean(userProfileBean);
						if(userprofileSaveBean.save()) {
// 							response.addHeader("refresh", "60; URL=main.jsp");
							response.sendRedirect("main.jsp");
	 						return ;
	 					}
						else {
						%>
						<div class="ui negative message">
							<div class="header">
								Error
							</div>
							<p>
								Something error with saving, please check your information and try again. <a href="main.jsp">Go back</a> now.
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