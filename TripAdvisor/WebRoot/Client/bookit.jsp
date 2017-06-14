<%@page import="JavaBean.BpelOperateBean"%>
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
			if(request.getParameter("hotplan") == null) {
				BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
				int userid = Integer.parseInt(String.valueOf(session.getAttribute("userid")));
				String username = (String)session.getAttribute("username");
				bookListBean.book(userid);
				bookListBean.makeBpel(username);
				bookListBean.makeArticactsWsdl(username);
			}
			else {
				String orderid = (String)request.getParameter("hotplan");
				BpelOperateBean bpelOperateBean = new BpelOperateBean();
				if(orderid.equals("7")) {
					bpelOperateBean.invokeBPEL(7);
				}
				else if(orderid.equals("8")) {
					bpelOperateBean.invokeBPEL(8);
				}
				else {
					bpelOperateBean.invokeBPEL(9);
				}
				BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
				int userid = Integer.parseInt(String.valueOf(session.getAttribute("userid")));
				bookListBean.bookByBPEL(userid);
			}
			
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