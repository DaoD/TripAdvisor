<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ page import="JavaBean.AirlineBean"%>
<%@ page import="JavaBean.AirlineOperateBean"%>
<jsp:useBean id="airlineBean" class="JavaBean.AirlineBean" scope="request" />
<jsp:useBean id="airlineOperateBean" class="JavaBean.AirlineOperateBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Client</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
	</head>
	<body>
		<%
			String fromcity = request.getParameter("fromcity");
			String tocity = request.getParameter("tocity");
			String departdate = request.getParameter("departdate");
			String number = request.getParameter("number");
			String flightclass = request.getParameter("class");
			String startprice = request.getParameter("startprice");
			String endprice = request.getParameter("endprice");
			String isfirst = request.getParameter("first");
			
			List<AirlineBean> airlinelist = airlineOperateBean.getAllAirlines();
			request.setAttribute("fromcity", fromcity);
			request.setAttribute("tocity", tocity);
			request.setAttribute("departdate", departdate);
			request.setAttribute("number", number);
			request.setAttribute("flightclass", flightclass);
			request.setAttribute("startprice", startprice);
			request.setAttribute("endprice", endprice);
			request.setAttribute("airlinelist", airlinelist); 
			
			if(isfirst.equals("0")) {
				request.getRequestDispatcher("bookfirstflight.jsp").forward(request,response);
			}
			else {
				request.getRequestDispatcher("booksecondflight.jsp").forward(request,response);
			}
		
		 %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>