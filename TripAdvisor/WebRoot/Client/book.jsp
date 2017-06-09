<%@page import="JavaBean.BookListBean"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="java.util.*" %> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Client</title>
		<link rel="stylesheet" type="text/css" href="../CSS/semantic.min.css">
	</head>
	<body>
		<%
			String step = request.getParameter("step");
			if(step.equals("0")) {
				String airline = request.getParameter("airline");
				String flightid = request.getParameter("flightid");
				String flightdate = request.getParameter("flightdate");
				String flightnumber = request.getParameter("flightnumber");
				String flighttotalprice = request.getParameter("flightprice");
				String flightno = request.getParameter("flightno");
				String flightclass = request.getParameter("flightclass");
				String flightdeparttime = request.getParameter("flightdeparttime");
				String flightarrivetime = request.getParameter("flightarrivetime");
				String flightfromcity = request.getParameter("flightfromcity");
				String flighttocity = request.getParameter("flighttocity");
				BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
				bookListBean.setAirline1(airline);
				bookListBean.setFlightfid1(flightid);
				bookListBean.setFlightdate1(flightdate);
				bookListBean.setFlightnum1(flightnumber);
				bookListBean.setFlightprice1(flighttotalprice);
				bookListBean.setFlightno1(flightno);
				bookListBean.setFlightclass1(flightclass);
				bookListBean.setFlightdeparttime1(flightdeparttime);
				bookListBean.setFlightarrivetime1(flightarrivetime);
				bookListBean.setFlightfromcity1(flightfromcity);
				bookListBean.setFlighttocity1(flighttocity);
				response.sendRedirect("booksecondflight.jsp");
			}
			else if(step.equals("1")) {
				String airline = request.getParameter("airline");
				String flightid = request.getParameter("flightid");
				String flightdate = request.getParameter("flightdate");
				String flightnumber = request.getParameter("flightnumber");
				String flighttotalprice = request.getParameter("flightprice");
				String flightno = request.getParameter("flightno");
				String flightclass = request.getParameter("flightclass");
				String flightdeparttime = request.getParameter("flightdeparttime");
				String flightarrivetime = request.getParameter("flightarrivetime");
				String flightfromcity = request.getParameter("flightfromcity");
				String flighttocity = request.getParameter("flighttocity");
				BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
				bookListBean.setAirline2(airline);
				bookListBean.setFlightfid2(flightid);
				bookListBean.setFlightdate2(flightdate);
				bookListBean.setFlightnum2(flightnumber);
				bookListBean.setFlightprice2(flighttotalprice);
				bookListBean.setFlightno2(flightno);
				bookListBean.setFlightclass2(flightclass);
				bookListBean.setFlightdeparttime2(flightdeparttime);
				bookListBean.setFlightarrivetime2(flightarrivetime);
				bookListBean.setFlightfromcity2(flightfromcity);
				bookListBean.setFlighttocity2(flighttocity);
				response.sendRedirect("bookhotel.jsp");
			}
			else if(step.equals("2")) {
				String hotelname = request.getParameter("hotelname");
				String hoteltype = request.getParameter("hoteltype");
				String hotelfromdate = request.getParameter("hotelfromdate");
				String hoteltodate = request.getParameter("hoteltodate");
				String hoteldays = request.getParameter("hoteldays");
				String hoteltotalprice = request.getParameter("hotelprice");
				String hotelid = request.getParameter("hotelid");
				String hotelnumber = request.getParameter("hotelnumber");
				String hoteladdress = request.getParameter("hoteladdress");
				String hotelstar = request.getParameter("hotelstar");
				String hotellocation = request.getParameter("hotellocation");
				BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
				bookListBean.setHotelname(hotelname);
				bookListBean.setHoteltype(hoteltype);
				bookListBean.setHotelfromdate(hotelfromdate);
				bookListBean.setHoteltodate(hoteltodate);
				bookListBean.setHoteldays(hoteldays);
				bookListBean.setHotelprice(hoteltotalprice);
				bookListBean.setHotelid(hotelid);
				bookListBean.setHotelnumber(hotelnumber);
				bookListBean.setHoteladdress(hoteladdress);
				bookListBean.setHotelstar(hotelstar);
				bookListBean.setHotellocation(hotellocation);
				response.sendRedirect("bookcar.jsp");
			}
			else if(step.equals("3")) {
				String companyname = request.getParameter("companyname");
				String carshape = request.getParameter("carshape");
				String carfromdate = request.getParameter("carfromdate");
				String cartodate = request.getParameter("cartodate");
				String cardays = request.getParameter("cardays");
				String cartotalprice = request.getParameter("carprice");
				String carid = request.getParameter("carid");
				String carbrand = request.getParameter("carbrand");
				String carenginetype = request.getParameter("carenginetype");
				String carpassengers = request.getParameter("carpassengers");
				String carcity = request.getParameter("carcity");
				BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
				bookListBean.setCompanyname(companyname);
				bookListBean.setCarshape(carshape);
				bookListBean.setCarfromdate(carfromdate);
				bookListBean.setCartodate(cartodate);
				bookListBean.setCardays(cardays);
				bookListBean.setCarprice(cartotalprice);
				bookListBean.setCarid(carid);
				bookListBean.setCarbrand(carbrand);
				bookListBean.setCarenginetype(carenginetype);
				bookListBean.setCarpassengers(carpassengers);
				bookListBean.setCarcity(carcity);
				response.sendRedirect("bookattractions.jsp");
			}
			else if(step.equals("4")) {
				String idlistString = request.getParameter("idlist");
				String[] idlist = idlistString.split(" ");
				BookListBean bookListBean = (BookListBean)session.getAttribute("booklist");
				for(int i = 0; i < idlist.length; i++) {
					String id = idlist[i];
					String attractionname = request.getParameter("attractionname" + id);
					String attractionlocation = request.getParameter("attractionlocation" + id);
					String attractionprice = request.getParameter("attractionprice" + id);
					String attractiondate = request.getParameter("attractiondate" + id);
					String attractionnumber = request.getParameter("attractionnumber" + id);
					String attractionid = request.getParameter("attractionid" + id);
					bookListBean.getAttractionname().add(attractionname);
					bookListBean.getAttractionlocation().add(attractionlocation);
					bookListBean.getAttractionprice().add(attractionprice);
					bookListBean.getAttractiondate().add(attractiondate);
					bookListBean.getAttractionnum().add(attractionnumber);
					bookListBean.getAttractionid().add(attractionid);
				}
				response.sendRedirect("booklist.jsp");
			}
			
		 %>
	</body>
	<script src="../JS/jquery.min.js"></script>
	<script src="../JS/semantic.min.js"></script>
</html>