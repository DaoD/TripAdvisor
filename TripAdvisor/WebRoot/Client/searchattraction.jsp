<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ page import="JavaBean.AttractionBean"%>
<%@ page import="JavaBean.AttractionOperateBean"%>
<jsp:useBean id="attractionBean" class="JavaBean.AttractionBean" scope="request" />
<jsp:useBean id="attractionOperateBean" class="JavaBean.AttractionOperateBean" scope="request" />

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
			String date = request.getParameter("date");
			String startprice = request.getParameter("startprice");
			String endprice = request.getParameter("endprice");
			String number = request.getParameter("number");

			
			request.setAttribute("city", city);
			request.setAttribute("date", date);
			request.setAttribute("startprice", startprice);
			request.setAttribute("endprice", endprice);
			request.setAttribute("number", number); 
			
			if(city.equals("bj")) {
				city = "北京";
			}
			else {
				city = "上海";
			}
			
			List<AttractionBean> attractionlist = attractionOperateBean.getAllAttractionByCondition(city, startprice, endprice);
			request.setAttribute("attractionlist", attractionlist);
			
			request.getRequestDispatcher("bookattractions.jsp").forward(request,response);
			
		 %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>