<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page import="JavaBean.OrderBean"%>
<%-- <jsp:useBean id="" class="JavaBean.ServiceBean" scope="request" /> --%>
<jsp:useBean id="orderOperateBean" class="JavaBean.OrderOperateBean" scope="request" />

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Admin</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Admin/main.css">
	</head>
	<body>
		<div class="ui fixed menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Admin</div>
			<div class="right menu">
				<div class="item"><% out.print((String)session.getAttribute("username")); %></div>
				<a class="item" href="signout.jsp">Sign Out</a>
			</div>
		</div>
		<% 
			String username = (String)session.getAttribute("username");
			if(username == null) {
				%> 
					<div class="ui middle aligned center aligned grid" id="message">
						<div class="left aligned column">
							<div class="ui negative message">
								<div class="header">
									Error
								</div>
								<p>
									Sign in time out or something error with this page. Please sign in again.
									<br/>
									 <a href="signin.jsp">Return</a> to sign in page.
								</p>
							</div>
						</div>
					</div>
				
				<%
			}
			else {
				int userid = Integer.parseInt(String.valueOf(session.getAttribute("userid")));
				if(username.equals("chinaairline")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(0, "http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("easternairline")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(0, "http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("hainanairline")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(0, "http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("homeinns")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(1, "http://10.79.10.65:8080/axis2/services/RujiaHotelServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("peaceshotel")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(1, "http://10.79.10.65:8080/axis2/services/HepingHotelServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("hiltonhotel")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(1, "http://10.79.10.65:8080/axis2/services/XierdunHotelServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("capitalhotel")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(1, "http://10.79.10.65:8080/axis2/services/ShouduHotelServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("onehigh")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(2, "http://10.79.10.65:8080/axis2/services/OhCarServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("shenzhou")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(2, "http://10.79.10.65:8080/axis2/services/SzCarServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				else if(username.equals("ctrip")) {
					List<OrderBean> orderlist = orderOperateBean.listOrders(3, "http://10.79.10.65:8080/axis2/services/AttractionServices?wsdl");
					request.setAttribute("orderlist", orderlist); 
				}
				
				
				
		%>
		<div class="ui grid" id="mainframe">
			<div class="row">
				<div class="two wide column">
					<div class="ui vertical pointing menu">
						<a class="item" href="main.jsp">Profile</a>
						<a class="item" href="service.jsp">Service</a>
						<a class="active item" href="orders.jsp">Orders</a>
					</div>
				</div>
				<div class="fourteen wide stretched column" id="stickypart">
					<div class="ui segment">
						<h4 class="ui dividing header">
							Order list
						</h4>
						<table class="ui very basic selectable celled table">
							<% if(username.equals("chinaairline")){ %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Flight ID</th>
									<th>Date</th>
									<th>Number</th>
									<th>Order time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.date}</td>
										<td>${order.number}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% }
							else if(username.equals("easternairline")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Flight ID</th>
									<th>Date</th>
									<th>Number</th>
									<th>Order time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.date}</td>
										<td>${order.number}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% } 
							else if(username.equals("hainanairline")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Flight ID</th>
									<th>Date</th>
									<th>Number</th>
									<th>Order time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.date}</td>
										<td>${order.number}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% }
							else if(username.equals("homeinns")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Room ID</th>
									<th>Room Type</th>
									<th>Check In Time</th>
									<th>Check Out Time</th>
									<th>Days</th>
									<th>Number</th>
									<th>Order Time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.type}</td>
										<td>${order.datefrom}</td>
										<td>${order.dateto}</td>
										<td>${order.days}</td>
										<td>${order.number}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% }
							else if(username.equals("peaceshotel")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Room ID</th>
									<th>Room Type</th>
									<th>Check In Time</th>
									<th>Check Out Time</th>
									<th>Days</th>
									<th>Number</th>
									<th>Order Time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.type}</td>
										<td>${order.datefrom}</td>
										<td>${order.dateto}</td>
										<td>${order.days}</td>
										<td>${order.number}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% }
							else if(username.equals("hiltonhotel")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Room ID</th>
									<th>Room Type</th>
									<th>Check In Time</th>
									<th>Check Out Time</th>
									<th>Days</th>
									<th>Number</th>
									<th>Order Time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.type}</td>
										<td>${order.datefrom}</td>
										<td>${order.dateto}</td>
										<td>${order.days}</td>
										<td>${order.number}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% }
							else if(username.equals("capitalhotel")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Room ID</th>
									<th>Room Type</th>
									<th>Check In Time</th>
									<th>Check Out Time</th>
									<th>Days</th>
									<th>Number</th>
									<th>Order Time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.type}</td>
										<td>${order.datefrom}</td>
										<td>${order.dateto}</td>
										<td>${order.days}</td>
										<td>${order.number}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% }
							else if(username.equals("onehigh")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Car ID</th>
									<th>Car Type</th>
									<th>Days</th>
									<th>Order Time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.type}</td>
										<td>${order.days}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% }
							else if(username.equals("shenzhou")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Car ID</th>
									<th>Car Type</th>
									<th>Days</th>
									<th>Order Time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.type}</td>
										<td>${order.days}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% }
							else if(username.equals("ctrip")) { %>
							<thead>
								<tr>
									<th>Order ID</th>
									<th>Attraction ID</th>
									<th>Number</th>
									<th>Order Time</th>
									<th>Total Price</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${orderlist}" var="order">
									<tr>
										<td>${order.orderid}</td>	
										<td>${order.refid}</td>
										<td>${order.number}</td>
										<td>${order.ordertime}</td>
										<td>${order.totalprice}</td>
									</tr>
								</c:forEach>
							</tbody>
							<% } %>
						</table>
					</div>
				</div>
			</div>	
		</div>
		<% } %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/Admin/main.js"></script>
</html>