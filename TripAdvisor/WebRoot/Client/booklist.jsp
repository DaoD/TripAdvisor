<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page import="JavaBean.BookListBean"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Client</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Client/diy.css">
	</head>
	<body>
		<div class="ui fixed inverted menu">
			<div class="header item">TripAdvisor</div>
			<div class="active item">Client</div>
			<div class="right menu">
				<div class="item"><% out.print((String)session.getAttribute("username")); %></div>
				<a class="item" href="signout.jsp">Sign Out</a>
			</div>
		</div>
		<% 
			String username = (String)session.getAttribute("username");
			if(username == null) {
				%> 
					<div class="ui middle aligned center aligned grid">
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
				BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
				int totalprice = 0;
		%>
		<div class="ui container" id="mainframe">
			<div class="ui segment">
				<form class="ui form" action="bookit.jsp">
					<h4 class="ui dividing header">The services you have chosen:</h4>
					<div class="ui one cards">
						<% if(!bookListBean.getAirline1().equals("")) {%>
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span><% out.print(bookListBean.getAirline1()); %></span> 
									<span><% out.print(bookListBean.getFlightno1()); %></span>
								</div>
								<div class="meta">
									<span><% out.print(bookListBean.getFlightfromcity1()); %>-<% out.print(bookListBean.getFlighttocity1()); %></span>
									<span><% out.print(bookListBean.getFlightclass1()); %></span>
								</div>
								<div class="description">
									<span><% out.print(bookListBean.getFlightdate1()); %></span>
									<span><% out.print(bookListBean.getFlightdeparttime1()); %>-<% out.print(bookListBean.getFlightarrivetime1()); %></span> 
									<span><% out.print(bookListBean.getFlighttime1()); %></span> 
									<br/>
									<span><% out.print(bookListBean.getFlightnum1()); %>张</span>
									<span>共 <% out.print(bookListBean.getFlightprice1()); %>元</span>
								</div>
							</div>
						</div>
						<%
							totalprice += Integer.parseInt(bookListBean.getFlightprice1());
						} 
						if(!bookListBean.getAirline2().equals("")) {%>
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span><% out.print(bookListBean.getAirline2()); %></span> 
									<span><% out.print(bookListBean.getFlightno2()); %></span>
								</div>
								<div class="meta">
									<span><% out.print(bookListBean.getFlightfromcity2()); %>-<% out.print(bookListBean.getFlighttocity2()); %></span>
									<span><% out.print(bookListBean.getFlightclass2()); %></span>
								</div>
								<div class="description">
									<span><% out.print(bookListBean.getFlightdate2()); %></span>
									<span><% out.print(bookListBean.getFlightdeparttime2()); %>-<% out.print(bookListBean.getFlightarrivetime2()); %></span> 
									<span><% out.print(bookListBean.getFlighttime2()); %></span> 
									<br/>
									<span><% out.print(bookListBean.getFlightnum2()); %>张</span>
									<span>共  <% out.print(bookListBean.getFlightprice2()); %>元</span>
								</div>
							</div>
						</div>
						<% 
							totalprice += Integer.parseInt(bookListBean.getFlightprice2());
						}
						if(!bookListBean.getHotelname().equals("")) { %>
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span><% out.print(bookListBean.getHotelname()); %></span> 
									<span><% out.print(bookListBean.getHoteltype()); %></span>
								</div>
								<div class="meta">
									<span><% out.print(bookListBean.getHotellocation()); %></span>
									<span><% out.print(bookListBean.getHoteladdress()); %></span>
								</div>
								<div class="description">
									<span>入住日期：<% out.print(bookListBean.getHotelfromdate()); %></span>
									<span>退房日期：<% out.print(bookListBean.getHoteltodate()); %></span> 
									<br/>
									<span><% out.print(bookListBean.getHoteldays()); %>天</span>
									<span><% out.print(bookListBean.getHotelnumber()); %>间</span>
									<span>共 <% out.print(bookListBean.getHotelprice()); %>元</span>
								</div>
							</div>
						</div>
						<% 
							totalprice += Integer.parseInt(bookListBean.getHotelprice());
						} 
						if(!bookListBean.getCarbrand().equals("")) {
						%>
						<div class="ui raised link card">
							<div class="content">
								<div class="header">
									<span><% out.print(bookListBean.getCompanyname()); %></span> 
									<span><% out.print(bookListBean.getCarbrand()); %></span>
								</div>
								<div class="meta">
									<span><% out.print(bookListBean.getCarcity()); %></span>
								</div>
								<div class="description">
									<span>取车日期：<% out.print(bookListBean.getCarfromdate()); %></span>
									<span>归还日期：<% out.print(bookListBean.getCartodate()); %></span> 
									<br/>
									<span><% out.print(bookListBean.getCardays()); %>天</span>
									<span>最大乘客数：<% out.print(bookListBean.getCarpassengers()); %>人</span>
									<span>共 <% out.print(bookListBean.getCarprice()); %>元</span>
								</div>
							</div>
						</div>
						<% } 
						if(bookListBean.getAttractiondate().size() != 0) {
							List<String> attractionname = bookListBean.getAttractionname();
							List<String> attractionlocation = bookListBean.getAttractionlocation();
							List<String> attractionprice = bookListBean.getAttractionprice();
							List<String> attractiondate = bookListBean.getAttractiondate();
							List<String> attractionnumber = bookListBean.getAttractionnum();
							for(int i = 0; i < attractionname.size(); i++) {
						%>
								<div class="ui raised link card">
									<div class="content">
										<div class="header">
											<span><% out.print(attractionname.get(i)); %></span> 
										</div>
										<div class="meta">
											<span><% out.print(attractionlocation.get(i)); %></span>
										</div>
										<div class="description">
											<span>参观日期：<% out.print(attractiondate.get(i)); %></span>
											<span><% out.print(attractionnumber.get(i)); %>张</span>
											<span>共 <% out.print(attractionprice.get(i)); %>元</span>
										</div>
									</div>
								</div>
						<% 
							totalprice += Integer.parseInt(attractionprice.get(i));
							}
						}
						%>
						
					</div>
					<h4 class="ui dividing header">Total Price:</h4>
					<div class="ui statistic">
						<div class="label">
					    	RMB
					  	</div>
					  	<div class="value">
					    	<% out.print(totalprice); %>
					  	</div>
					</div>
					<h4 class="ui dividing header">Operate</h4>
					<button class="ui teal button" id="listsubmit">Book it now</button>
				</form>
			</div>
		</div>
		<% } %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
	<script src="../JS/Client/diy.js"></script>
</html>