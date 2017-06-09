package JavaBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

public class OrderOperateBean {
	
	public List<OrderBean> listOrders(int booktype, String url) {
		List<OrderBean> orderlist = new ArrayList<OrderBean>();
		if(booktype == 0) {
			OMElement result = null;  
	        try {   
	            Options options = new Options();   
	            EndpointReference targetEPR = new EndpointReference(url);  
	            options.setTo(targetEPR);  
	  
	            ServiceClient sender = new ServiceClient();  
	            sender.setOptions(options);  
	  
	            OMFactory fac = OMAbstractFactory.getOMFactory();  
	            String tns = "http://dao.com";  
	 
	            OMNamespace omNs = fac.createOMNamespace(tns, "");

	            OMElement method = fac.createOMElement("queryAirlineBook", omNs);
	            
	            method.build();
	  
	            result = sender.sendReceive(method);
	  
	            Iterator iterator =  result.getChildElements();
	            while (iterator.hasNext()) {
	            	OMElement omNode = (OMElement) iterator.next();
	            	Iterator iterator2 = omNode.getChildElements();
	            	OrderBean tmpOrderBean = new OrderBean();
	            	while(iterator2.hasNext()) {
	            		OMElement omNode2 = (OMElement) iterator2.next();
	            		switch (omNode2.getLocalName()) {
	            		case "id":
	            			tmpOrderBean.setOrderid(omNode2.getText());
	            			break;
						case "num":
							tmpOrderBean.setNumber(omNode2.getText());
							break;
						case "price":
							tmpOrderBean.setTotalprice(omNode2.getText());
							break;
						case "date":
							tmpOrderBean.setDate(omNode2.getText());
							break;
						case "booktime":
							tmpOrderBean.setOrdertime(omNode2.getText());
							break;
						case "fid":
							tmpOrderBean.setRefid(omNode2.getText());
							break;
						default:
							break;
						}
	            	}
	            	orderlist.add(tmpOrderBean);
	            }
	  
	        } catch (AxisFault axisFault) {  
	            axisFault.printStackTrace();  
	        }  
		}
		else if(booktype == 1) {
			OMElement result = null;  
	        try {   
	            Options options = new Options();   
	            EndpointReference targetEPR = new EndpointReference(url);  
	            options.setTo(targetEPR);  
	  
	            ServiceClient sender = new ServiceClient();  
	            sender.setOptions(options);  
	  
	            OMFactory fac = OMAbstractFactory.getOMFactory();  
	            String tns = "http://dao.com";  
	 
	            OMNamespace omNs = fac.createOMNamespace(tns, "");

	            OMElement method = fac.createOMElement("queryHotelBook", omNs);
	            
	            method.build();
	  
	            result = sender.sendReceive(method);
	  
	            Iterator iterator =  result.getChildElements();
	            while (iterator.hasNext()) {
	            	OMElement omNode = (OMElement) iterator.next();
	            	Iterator iterator2 = omNode.getChildElements();
	            	OrderBean tmpOrderBean = new OrderBean();
	            	while(iterator2.hasNext()) {
	            		OMElement omNode2 = (OMElement) iterator2.next();
	            		switch (omNode2.getLocalName()) {
	            		case "id":
	            			tmpOrderBean.setOrderid(omNode2.getText());
	            			break;
						case "type":
							tmpOrderBean.setType(omNode2.getText());
							break;
						case "timein":
							tmpOrderBean.setDatefrom(omNode2.getText());
							break;
						case "timeout":
							tmpOrderBean.setDateto(omNode2.getText());
							break;
						case "day":
							tmpOrderBean.setDays(omNode2.getText());
							break;
						case "price":
							tmpOrderBean.setTotalprice(omNode2.getText());
							break;
						case "booktime":
							tmpOrderBean.setOrdertime(omNode2.getText());
							break;
						case "fid":
							tmpOrderBean.setRefid(omNode2.getText());
							break;
						case "num":
							tmpOrderBean.setNumber(omNode2.getText());
							break;
						default:
							break;
						}
	            	}
	            	orderlist.add(tmpOrderBean);
	            }
	  
	        } catch (AxisFault axisFault) {  
	            axisFault.printStackTrace();  
	        }  
		}
		else if(booktype == 2) {
			OMElement result = null;  
	        try {   
	            Options options = new Options();   
	            EndpointReference targetEPR = new EndpointReference(url);  
	            options.setTo(targetEPR);  
	  
	            ServiceClient sender = new ServiceClient();  
	            sender.setOptions(options);  
	  
	            OMFactory fac = OMAbstractFactory.getOMFactory();  
	            String tns = "http://dao.com";  
	 
	            OMNamespace omNs = fac.createOMNamespace(tns, "");

	            OMElement method = fac.createOMElement("queryCarBook", omNs);
	            
	            method.build();
	  
	            result = sender.sendReceive(method);
	  
	            Iterator iterator =  result.getChildElements();
	            while (iterator.hasNext()) {
	            	OMElement omNode = (OMElement) iterator.next();
	            	Iterator iterator2 = omNode.getChildElements();
	            	OrderBean tmpOrderBean = new OrderBean();
	            	while(iterator2.hasNext()) {
	            		OMElement omNode2 = (OMElement) iterator2.next();
	            		switch (omNode2.getLocalName()) {
	            		case "id":
	            			tmpOrderBean.setOrderid(omNode2.getText());
	            			break;
						case "shape":
							tmpOrderBean.setType(omNode2.getText());
							break;
						case "day":
							tmpOrderBean.setDays(omNode2.getText());
							break;
						case "price":
							tmpOrderBean.setTotalprice(omNode2.getText());
							break;
						case "booktime":
							tmpOrderBean.setOrdertime(omNode2.getText());
							break;
						case "carid":
							tmpOrderBean.setRefid(omNode2.getText());
							break;
						default:
							break;
						}
	            	}
	            	orderlist.add(tmpOrderBean);
	            }
	  
	        } catch (AxisFault axisFault) {  
	            axisFault.printStackTrace();  
	        }  
		}
		else {
			OMElement result = null;  
	        try {   
	            Options options = new Options();   
	            EndpointReference targetEPR = new EndpointReference(url);  
	            options.setTo(targetEPR);  
	  
	            ServiceClient sender = new ServiceClient();  
	            sender.setOptions(options);  
	  
	            OMFactory fac = OMAbstractFactory.getOMFactory();  
	            String tns = "http://dao.com";  
	 
	            OMNamespace omNs = fac.createOMNamespace(tns, "");

	            OMElement method = fac.createOMElement("queryAttractionBook", omNs);
	            
	            method.build();
	  
	            result = sender.sendReceive(method);
	  
	            Iterator iterator =  result.getChildElements();
	            while (iterator.hasNext()) {
	            	OMElement omNode = (OMElement) iterator.next();
	            	Iterator iterator2 = omNode.getChildElements();
	            	OrderBean tmpOrderBean = new OrderBean();
	            	while(iterator2.hasNext()) {
	            		OMElement omNode2 = (OMElement) iterator2.next();
	            		switch (omNode2.getLocalName()) {
	            		case "id":
	            			tmpOrderBean.setOrderid(omNode2.getText());
	            			break;
						case "num":
							tmpOrderBean.setNumber(omNode2.getText());
							break;
						case "price":
							tmpOrderBean.setTotalprice(omNode2.getText());
							break;
						case "booktime":
							tmpOrderBean.setOrdertime(omNode2.getText());
							break;
						case "fid":
							tmpOrderBean.setRefid(omNode2.getText());
							break;
						default:
							break;
						}
	            	}
	            	orderlist.add(tmpOrderBean);
	            }
	  
	        } catch (AxisFault axisFault) {  
	            axisFault.printStackTrace();  
	        }  
		}
		return orderlist;
	}
	public List<String> getUserOrderList(int userid) {
		List<String> orderList = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tripadvisor?useSSL=true", "root", "zyt123456");
			Statement stmt = conn.createStatement();
			String queryline = "select * from one_order where userid = \'" + userid + "\' group by orderid";
			ResultSet rs = stmt.executeQuery(queryline);
			int count = 1;
			while (rs.next()) {
				String ordertime = rs.getString("addtime");
				String orderid = rs.getString("orderid");
				orderList.add(count + "," + ordertime + "," + orderid);
				count ++;
			}
			stmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return orderList;
	}
	public BookListBean getOrderList(int orderid) {
		BookListBean bookListBean = new BookListBean();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tripadvisor?useSSL=true", "root", "zyt123456");
			Statement stmt = conn.createStatement();
			String queryline = "select * from one_order where orderid = \'" + orderid + "\'";
			ResultSet rs = stmt.executeQuery(queryline);
			List<String> attractionname = new ArrayList<String>();
			List<String> attractionlocation = new ArrayList<String>();
			List<String> attractiondate = new ArrayList<String>();
			List<String> attractionnum = new ArrayList<String>();
			List<String> attractionprice = new ArrayList<String>();
			while (rs.next()) {
				String ordertype = rs.getString("ordertype");
				if(ordertype.equals("0")) {
					bookListBean.setAirline1(rs.getString("name"));
					bookListBean.setFlightno1(rs.getString("flightnumber"));
					bookListBean.setFlightclass1(rs.getString("booktype"));
					bookListBean.setFlightdeparttime1(rs.getString("flightdeparttime"));
					bookListBean.setFlightarrivetime1(rs.getString("flightarrivetime"));
					bookListBean.setFlighttime1(rs.getString("flighttime"));
					bookListBean.setFlightfromcity1(rs.getString("flightfromcity"));
					bookListBean.setFlighttocity1(rs.getString("flighttocity"));
					bookListBean.setFlightnum1(rs.getString("ordernum"));
					bookListBean.setFlightprice1(rs.getString("orderprice"));
					bookListBean.setFlightdate1(rs.getString("orderdate"));
				}
				else if(ordertype.equals("1")) {
					bookListBean.setAirline2(rs.getString("name"));
					bookListBean.setFlightno2(rs.getString("flightnumber"));
					bookListBean.setFlightclass2(rs.getString("booktype"));
					bookListBean.setFlightdeparttime2(rs.getString("flightdeparttime"));
					bookListBean.setFlightarrivetime2(rs.getString("flightarrivetime"));
					bookListBean.setFlighttime2(rs.getString("flighttime"));
					bookListBean.setFlightfromcity2(rs.getString("flightfromcity"));
					bookListBean.setFlighttocity2(rs.getString("flighttocity"));
					bookListBean.setFlightnum2(rs.getString("ordernum"));
					bookListBean.setFlightprice2(rs.getString("orderprice"));
					bookListBean.setFlightdate2(rs.getString("orderdate"));
				}
				else if(ordertype.equals("2")) {
					bookListBean.setHotelname(rs.getString("name"));
					bookListBean.setHoteltype(rs.getString("booktype"));
					bookListBean.setHotelfromdate(rs.getString("orderfromdate"));
					bookListBean.setHoteltodate(rs.getString("ordertodate"));
					bookListBean.setHoteldays(rs.getString("orderdays"));
					bookListBean.setHotelprice(rs.getString("orderprice"));
					bookListBean.setHotelnumber(rs.getString("ordernum"));
					bookListBean.setHoteladdress(rs.getString("orderaddress"));
					bookListBean.setHotelstar(rs.getString("hotelstar"));
					bookListBean.setHotellocation(rs.getString("ordercity"));
				}
				else if(ordertype.equals("3")) {
					bookListBean.setCompanyname(rs.getString("name"));
					bookListBean.setCarshape(rs.getString("booktype"));
					bookListBean.setCarfromdate(rs.getString("orderfromdate"));
					bookListBean.setCartodate(rs.getString("ordertodate"));
					bookListBean.setCardays(rs.getString("orderdays"));
					bookListBean.setCarprice(rs.getString("orderprice"));
					bookListBean.setCarbrand(rs.getString("carbrand"));
					bookListBean.setCarenginetype(rs.getString("carenginetype"));
					bookListBean.setCarpassengers(rs.getString("carpassengers"));
					bookListBean.setCarcity(rs.getString("ordercity"));
				}
				else {
					attractionname.add(rs.getString("name"));
					attractionlocation.add(rs.getString("ordercity"));
					attractionnum.add(rs.getString("ordernum"));
					attractiondate.add(rs.getString("orderdate"));
					attractionprice.add(rs.getString("orderprice"));
					bookListBean.setAttractionname(attractionname);
					bookListBean.setAttractionlocation(attractionlocation);
					bookListBean.setAttractionnum(attractionnum);
					bookListBean.setAttractiondate(attractiondate);
					bookListBean.setAttractionprice(attractionprice);
				}
			}
			stmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bookListBean;
	}
}
