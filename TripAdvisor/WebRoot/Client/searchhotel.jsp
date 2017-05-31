<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ page import="JavaBean.HotelBean"%>
<%@ page import="JavaBean.HotelOperateBean"%>
<jsp:useBean id="hotelBean" class="JavaBean.HotelBean" scope="request" />
<jsp:useBean id="hotelOperateBean" class="JavaBean.HotelOperateBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Client</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
	</head>
	<body>
		<%
			String city = request.getParameter("city");
			String fromdate = request.getParameter("fromdate");
			String todate = request.getParameter("todate");
			String startprice = request.getParameter("startprice");
			String endprice = request.getParameter("endprice");
			String number = request.getParameter("number");
			
			List<HotelBean> hotellist = hotelOperateBean.getAllHotels();
			request.setAttribute("city", city);
			request.setAttribute("fromdate", fromdate);
			request.setAttribute("todate", todate);
			request.setAttribute("startprice", startprice);
			request.setAttribute("endprice", endprice);
			request.setAttribute("number", number); 
			request.setAttribute("hotellist", hotellist);
			
			request.getRequestDispatcher("bookhotel.jsp").forward(request,response);
			
		 %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>