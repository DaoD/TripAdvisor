<%@ page import="JavaBean.BookListBean"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Client</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
		<link rel="stylesheet" type="text/css" href="../CSS/Client/main.css">
	</head>
	<body>
		<%
			BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
			int userid = Integer.parseInt(String.valueOf(session.getAttribute("userid")));
			String username = (String)session.getAttribute("username");
			bookListBean.book(userid);
			bookListBean.makeBpel(username);
			bookListBean.makeArticactsWsdl(username);
		 %>
		 <div class="ui middle aligned center aligned grid">
			<div class="left aligned column">
				<div class="ui positive message">
					<div class="header">
						Success
					</div>
					<p>
						The book process finished.
						<br/>
						 <a href="orderlist.jsp">Return</a> to check the order.
					</p>
				</div>
			</div>
		</div>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>