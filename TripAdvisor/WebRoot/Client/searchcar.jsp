<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ page import="JavaBean.CarBean"%>
<%@ page import="JavaBean.CarOperateBean"%>
<jsp:useBean id="carBean" class="JavaBean.CarBean" scope="request" />
<jsp:useBean id="carOperateBean" class="JavaBean.CarOperateBean" scope="request" />

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
			String passengernumber = request.getParameter("passengernumber");
			
			request.setAttribute("city", city);
			request.setAttribute("fromdate", fromdate);
			request.setAttribute("todate", todate);
			request.setAttribute("startprice", startprice);
			request.setAttribute("endprice", endprice);
			request.setAttribute("passengernumber", passengernumber); 
			
			if(city.equals("bj")) {
				city = "北京";
			}
			else {
				city = "上海";
			}
		
			List<CarBean> carlist = carOperateBean.getAllCarsByCondition(city, startprice, endprice, passengernumber);
			
			request.setAttribute("carlist", carlist);
			
			request.getRequestDispatcher("bookcar.jsp").forward(request,response);
			
		 %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>