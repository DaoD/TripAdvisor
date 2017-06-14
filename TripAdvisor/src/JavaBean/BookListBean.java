package JavaBean;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

import de.hunsicker.jalopy.storage.Environment.Variable;

public class BookListBean {
	private String airline1;
	private String flightno1;
	private String flightclass1;
	private String flightdeparttime1;
	private String flightarrivetime1;
	private String flighttime1;
	private String flightfromcity1;
	private String flighttocity1;
	private String flightnum1;
	private String flightprice1;
	private String flightdate1;
	private String flightfid1;
	
	private String airline2;
	private String flightno2;
	private String flightclass2;
	private String flightdeparttime2;
	private String flightarrivetime2;
	private String flighttime2;
	private String flightfromcity2;
	private String flighttocity2;
	private String flightnum2;
	private String flightprice2;
	private String flightdate2;
	private String flightfid2;
	
	private String hotelname;
	private String hoteltype;
	private String hotelfromdate;
	private String hoteltodate;
	private String hoteldays;
	private String hotelprice;
	private String hotelnumber;
	private String hoteladdress;
	private String hotelstar;
	private String hotellocation;
	private String hotelid;
	
	private String companyname;
	private String carshape;
	private String carfromdate;
	private String cartodate;
	private String cardays;
	private String carprice;
	private String carid;
	private String carbrand;
	private String carenginetype;
	private String carpassengers;
	private String carcity;
	
	private List<String> attractionname;
	private List<String> attractionlocation;
	private List<String> attractiondate;
	private List<String> attractionnum;
	private List<String> attractionprice;
	private List<String> attractionid;
	
	public BookListBean() {
		this.airline1 = "";
		this.flightno1 = "";
		this.flightclass1 = "";
		this.flightdeparttime1 = "";
		this.flightarrivetime1 = "";
		this.flighttime1 = "";
		this.flightfromcity1 = "";
		this.flighttocity1 = "";
		this.flightnum1 = "";
		this.flightprice1 = "";
		this.flightdate1 = "";
		this.flightfid1 = "";
		this.airline2 = "";
		this.flightno2 = "";
		this.flightclass2 = "";
		this.flightdeparttime2 = "";
		this.flightarrivetime2 = "";
		this.flighttime2 = "";
		this.flightfromcity2 = "";
		this.flighttocity2 = "";
		this.flightnum2 = "";
		this.flightprice2 = "";
		this.flightdate2 = "";
		this.flightfid2 = "";
		this.hotelname = "";
		this.hoteltype = "";
		this.hotelfromdate = "";
		this.hoteltodate = "";
		this.hoteldays = "";
		this.hotelprice = "";
		this.hotelnumber = "";
		this.hoteladdress = "";
		this.hotelstar = "";
		this.hotellocation = "";
		this.hotelid = "";
		this.companyname = "";
		this.carshape = "";
		this.carfromdate = "";
		this.cartodate = "";
		this.cardays = "";
		this.carprice = "";
		this.carid = "";
		this.carbrand = "";
		this.carenginetype = "";
		this.carpassengers = "";
		this.carcity = "";
		this.attractionname = new ArrayList<String>();;
		this.attractionlocation = new ArrayList<String>();;
		this.attractiondate = new ArrayList<String>();;
		this.attractionnum = new ArrayList<String>();;
		this.attractionprice = new ArrayList<String>();;
		this.attractionid = new ArrayList<String>();;
	}
	
	public String getAirline1() {
		return airline1;
	}
	public void setAirline1(String airline1) {
		this.airline1 = airline1;
	}
	public String getFlightnum1() {
		return flightnum1;
	}
	public void setFlightnum1(String flightnum1) {
		this.flightnum1 = flightnum1;
	}
	public String getFlightprice1() {
		return flightprice1;
	}
	public void setFlightprice1(String flightprice1) {
		this.flightprice1 = flightprice1;
	}
	public String getFlightdate1() {
		return flightdate1;
	}
	public void setFlightdate1(String flightdate1) {
		this.flightdate1 = flightdate1;
	}
	public String getFlightfid1() {
		return flightfid1;
	}
	public void setFlightfid1(String flightfid1) {
		this.flightfid1 = flightfid1;
	}
	public String getAirline2() {
		return airline2;
	}
	public void setAirline2(String airline2) {
		this.airline2 = airline2;
	}
	public String getFlightnum2() {
		return flightnum2;
	}
	public void setFlightnum2(String flightnum2) {
		this.flightnum2 = flightnum2;
	}
	public String getFlightprice2() {
		return flightprice2;
	}
	public void setFlightprice2(String flightprice2) {
		this.flightprice2 = flightprice2;
	}
	public String getFlightdate2() {
		return flightdate2;
	}
	public void setFlightdate2(String flightdate2) {
		this.flightdate2 = flightdate2;
	}
	public String getFlightfid2() {
		return flightfid2;
	}
	public void setFlightfid2(String flightfid2) {
		this.flightfid2 = flightfid2;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHoteltype() {
		return hoteltype;
	}
	public void setHoteltype(String hoteltype) {
		this.hoteltype = hoteltype;
	}
	public String getHotelfromdate() {
		return hotelfromdate;
	}
	public void setHotelfromdate(String hotelfromdate) {
		this.hotelfromdate = hotelfromdate;
	}
	public String getHoteltodate() {
		return hoteltodate;
	}
	public void setHoteltodate(String hoteltodate) {
		this.hoteltodate = hoteltodate;
	}
	public String getHoteldays() {
		return hoteldays;
	}
	public void setHoteldays(String hoteldays) {
		this.hoteldays = hoteldays;
	}
	public String getHotelprice() {
		return hotelprice;
	}
	public void setHotelprice(String hotelprice) {
		this.hotelprice = hotelprice;
	}
	public String getHotelnumber() {
		return hotelnumber;
	}
	public void setHotelnumber(String hotelnumber) {
		this.hotelnumber = hotelnumber;
	}
	public String getHotelid() {
		return hotelid;
	}
	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getCarshape() {
		return carshape;
	}
	public void setCarshape(String carshape) {
		this.carshape = carshape;
	}
	public String getCarprice() {
		return carprice;
	}
	public void setCarprice(String carprice) {
		this.carprice = carprice;
	}
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public String getFlightno1() {
		return flightno1;
	}
	public void setFlightno1(String flightno1) {
		this.flightno1 = flightno1;
	}
	public String getFlightno2() {
		return flightno2;
	}
	public void setFlightno2(String flightno2) {
		this.flightno2 = flightno2;
	}
	public String getFlightclass1() {
		return flightclass1;
	}
	public void setFlightclass1(String flightclass1) {
		this.flightclass1 = flightclass1;
	}
	public String getFlightdeparttime1() {
		return flightdeparttime1;
	}
	public void setFlightdeparttime1(String flightdeparttime1) {
		this.flightdeparttime1 = flightdeparttime1;
	}
	public String getFlightarrivetime1() {
		return flightarrivetime1;
	}
	public void setFlightarrivetime1(String flightarrivetime1) {
		this.flightarrivetime1 = flightarrivetime1;
	}
	public String getFlightfromcity1() {
		return flightfromcity1;
	}
	public void setFlightfromcity1(String flightfromcity1) {
		this.flightfromcity1 = flightfromcity1;
	}
	public String getFlighttocity1() {
		return flighttocity1;
	}
	public void setFlighttocity1(String flighttocity1) {
		this.flighttocity1 = flighttocity1;
	}
	public String getFlightclass2() {
		return flightclass2;
	}
	public void setFlightclass2(String flightclass2) {
		this.flightclass2 = flightclass2;
	}
	public String getFlightdeparttime2() {
		return flightdeparttime2;
	}
	public void setFlightdeparttime2(String flightdeparttime2) {
		this.flightdeparttime2 = flightdeparttime2;
	}
	public String getFlightarrivetime2() {
		return flightarrivetime2;
	}
	public void setFlightarrivetime2(String flightarrivetime2) {
		this.flightarrivetime2 = flightarrivetime2;
	}
	public String getFlightfromcity2() {
		return flightfromcity2;
	}
	public void setFlightfromcity2(String flightfromcity2) {
		this.flightfromcity2 = flightfromcity2;
	}
	public String getFlighttocity2() {
		return flighttocity2;
	}
	public void setFlighttocity2(String flighttocity2) {
		this.flighttocity2 = flighttocity2;
	}
	public String getHoteladdress() {
		return hoteladdress;
	}
	public void setHoteladdress(String hoteladdress) {
		this.hoteladdress = hoteladdress;
	}
	public String getHotelstar() {
		return hotelstar;
	}
	public void setHotelstar(String hotelstar) {
		this.hotelstar = hotelstar;
	}
	public String getHotellocation() {
		return hotellocation;
	}
	public void setHotellocation(String hotellocation) {
		this.hotellocation = hotellocation;
	}
	public String getCarbrand() {
		return carbrand;
	}
	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
	}
	public String getCarenginetype() {
		return carenginetype;
	}
	public void setCarenginetype(String carenginetype) {
		this.carenginetype = carenginetype;
	}
	public String getCarpassengers() {
		return carpassengers;
	}
	public void setCarpassengers(String carpassengers) {
		this.carpassengers = carpassengers;
	}
	public String getCardays() {
		return cardays;
	}
	public void setCardays(String cardays) {
		this.cardays = cardays;
	}
	public List<String> getAttractionname() {
		return attractionname;
	}
	public void setAttractionname(List<String> attractionname) {
		this.attractionname = attractionname;
	}
	public List<String> getAttractionlocation() {
		return attractionlocation;
	}
	public void setAttractionlocation(List<String> attractionlocation) {
		this.attractionlocation = attractionlocation;
	}
	public List<String> getAttractiondate() {
		return attractiondate;
	}
	public void setAttractiondate(List<String> attractiondate) {
		this.attractiondate = attractiondate;
	}
	public List<String> getAttractionnum() {
		return attractionnum;
	}
	public void setAttractionnum(List<String> attractionnum) {
		this.attractionnum = attractionnum;
	}
	public List<String> getAttractionprice() {
		return attractionprice;
	}
	public void setAttractionprice(List<String> attractionprice) {
		this.attractionprice = attractionprice;
	}
	public List<String> getAttractionid() {
		return attractionid;
	}
	public void setAttractionid(List<String> attractionid) {
		this.attractionid = attractionid;
	}

	public String getFlighttime1() {
		return flighttime1;
	}

	public void setFlighttime1(String flighttime1) {
		this.flighttime1 = flighttime1;
	}

	public String getFlighttime2() {
		return flighttime2;
	}

	public void setFlighttime2(String flighttime2) {
		this.flighttime2 = flighttime2;
	}

	public String getCarcity() {
		return carcity;
	}

	public void setCarcity(String carcity) {
		this.carcity = carcity;
	}

	public String getCarfromdate() {
		return carfromdate;
	}

	public void setCarfromdate(String carfromdate) {
		this.carfromdate = carfromdate;
	}

	public String getCartodate() {
		return cartodate;
	}

	public void setCartodate(String cartodate) {
		this.cartodate = cartodate;
	}
	
	public void bookOne(String url, String functionname, List<String> args, List<String> vals) {
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

            OMElement method = fac.createOMElement(functionname, omNs);
            
            for(int i = 0; i < args.size(); i++) {
            	OMElement symbol = fac.createOMElement(args.get(i), omNs);
            	symbol.addChild(fac.createOMText(symbol, vals.get(i)));
            	method.addChild(symbol);
            }
           
            
//            OMElement symbol1 = fac.createOMElement("location", omNs);
//            symbol1.addChild(fac.createOMText(symbol1, "上海"));
//            method.addChild(symbol1);
//            
//            OMElement symbol2 = fac.createOMElement("range1_", omNs);
//            symbol2.addChild(fac.createOMText(symbol2, ""));
//            method.addChild(symbol2);
//            
//            OMElement symbol3 = fac.createOMElement("range2_", omNs);
//            symbol3.addChild(fac.createOMText(symbol3, ""));
//            method.addChild(symbol3);
//            
//            OMElement symbol4 = fac.createOMElement("num1", omNs);
//            symbol4.addChild(fac.createOMText(symbol4, ""));
//            method.addChild(symbol4);
            
            method.build();
  
            result = sender.sendReceive(method);
		} catch (AxisFault axisFault) {  
            axisFault.printStackTrace();  
        }  
	}
	
	public void book(int userid) {
		if(!this.airline1.equals("")) {
			if(this.airline1.equals("中国国航")) {
				String url = "http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl";
				String func = "addAirlineBook";
				List<String> args = new ArrayList<String>();
				args.add("num1");
				args.add("price1");
				args.add("date");
				args.add("fid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.flightnum1);
				vals.add(this.flightprice1);
				vals.add(this.flightdate1);
				vals.add(this.flightfid1);
				bookOne(url, func, args, vals);
			}
			else if(this.airline1.equals("海南航空")) {
				String url = "http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl";
				String func = "addAirlineBook";
				List<String> args = new ArrayList<String>();
				args.add("num1");
				args.add("price1");
				args.add("date");
				args.add("fid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.flightnum1);
				vals.add(this.flightprice1);
				vals.add(this.flightdate1);
				vals.add(this.flightfid1);
				bookOne(url, func, args, vals);
			}
			else {
				String url = "http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl";
				String func = "addAirlineBook";
				List<String> args = new ArrayList<String>();
				args.add("num1");
				args.add("price1");
				args.add("date");
				args.add("fid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.flightnum1);
				vals.add(this.flightprice1);
				vals.add(this.flightdate1);
				vals.add(this.flightfid1);
				bookOne(url, func, args, vals);
			}
		}
		if(!this.airline2.equals("")) {
			if(this.airline2.equals("中国国航")) {
				String url = "http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl";
				String func = "addAirlineBook";
				List<String> args = new ArrayList<String>();
				args.add("num1");
				args.add("price1");
				args.add("date");
				args.add("fid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.flightnum2);
				vals.add(this.flightprice2);
				vals.add(this.flightdate2);
				vals.add(this.flightfid2);
				bookOne(url, func, args, vals);
			}
			else if(this.airline2.equals("海南航空")) {
				String url = "http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl";
				String func = "addAirlineBook";
				List<String> args = new ArrayList<String>();
				args.add("num1");
				args.add("price1");
				args.add("date");
				args.add("fid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.flightnum2);
				vals.add(this.flightprice2);
				vals.add(this.flightdate2);
				vals.add(this.flightfid2);
				bookOne(url, func, args, vals);
			}
			else {
				String url = "http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl";
				String func = "addAirlineBook";
				List<String> args = new ArrayList<String>();
				args.add("num1");
				args.add("price1");
				args.add("date");
				args.add("fid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.flightnum2);
				vals.add(this.flightprice2);
				vals.add(this.flightdate2);
				vals.add(this.flightfid2);
				bookOne(url, func, args, vals);
			}
		}
		if(!this.hotelname.equals("")) {
			if(this.hotelname.equals("上海和平饭店")) {
				String url = "http://10.79.10.65:8080/axis2/services/HepingHotelServices?wsdl";
				String func = "addHotelBook";
				List<String> args = new ArrayList<String>();
				args.add("type");
				args.add("timein");
				args.add("timeout");
				args.add("day1");
				args.add("price1");
				args.add("pid1");
				args.add("num1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.hoteltype);
				vals.add(this.hotelfromdate);
				vals.add(this.hoteltodate);
				vals.add(this.hoteldays);
				vals.add(this.hotelprice);
				vals.add(this.hotelid);
				vals.add(this.hotelnumber);
				bookOne(url, func, args, vals);
			}
			else if(this.hotelname.equals("北京首都大酒店")) {
				String url = "http://10.79.10.65:8080/axis2/services/ShouduHotelServices?wsdl";
				String func = "addHotelBook";
				List<String> args = new ArrayList<String>();
				args.add("type");
				args.add("timein");
				args.add("timeout");
				args.add("day1");
				args.add("price1");
				args.add("pid1");
				args.add("num1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.hoteltype);
				vals.add(this.hotelfromdate);
				vals.add(this.hoteltodate);
				vals.add(this.hoteldays);
				vals.add(this.hotelprice);
				vals.add(this.hotelid);
				vals.add(this.hotelnumber);
				bookOne(url, func, args, vals);
			}
			else if(this.hotelname.startsWith("如家精选")) {
				String url = "http://10.79.10.65:8080/axis2/services/RujiaHotelServices?wsdl";
				String func = "addHotelBook";
				List<String> args = new ArrayList<String>();
				args.add("type");
				args.add("timein");
				args.add("timeout");
				args.add("day1");
				args.add("price1");
				args.add("pid1");
				args.add("num1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.hoteltype);
				vals.add(this.hotelfromdate);
				vals.add(this.hoteltodate);
				vals.add(this.hoteldays);
				vals.add(this.hotelprice);
				vals.add(this.hotelid);
				vals.add(this.hotelnumber);
				bookOne(url, func, args, vals);
			}
			else if(this.hotelname.startsWith("北京希尔顿") || this.hotelname.startsWith("上海希尔顿")) {
				String url = "http://10.79.10.65:8080/axis2/services/XierdunHotelServices?wsdl";
				String func = "addHotelBook";
				List<String> args = new ArrayList<String>();
				args.add("type");
				args.add("timein");
				args.add("timeout");
				args.add("day1");
				args.add("price1");
				args.add("pid1");
				args.add("num1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.hoteltype);
				vals.add(this.hotelfromdate);
				vals.add(this.hoteltodate);
				vals.add(this.hoteldays);
				vals.add(this.hotelprice);
				vals.add(this.hotelid);
				vals.add(this.hotelnumber);
				bookOne(url, func, args, vals);
			}
		}
		if(!this.companyname.equals("")) {
			if(this.companyname.equals("一嗨租车")) {
				String url = "http://10.79.10.65:8080/axis2/services/OhCarServices?wsdl";
				String func = "addCarBook";
				List<String> args = new ArrayList<String>();
				args.add("shape");
				args.add("day1");
				args.add("price1");
				args.add("carid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.carbrand);
				vals.add(this.cardays);
				vals.add(this.carprice);
				vals.add(this.carid);
				bookOne(url, func, args, vals);
			}
			else if(this.companyname.equals("神州租车")) {
				String url = "http://10.79.10.65:8080/axis2/services/SzCarServices?wsdl";
				String func = "addCarBook";
				List<String> args = new ArrayList<String>();
				args.add("shape");
				args.add("day1");
				args.add("price1");
				args.add("carid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.carbrand);
				vals.add(this.cardays);
				vals.add(this.carprice);
				vals.add(this.carid);
				bookOne(url, func, args, vals);
			}
		}
		if(this.attractionname.size() != 0) {
			for(int i = 0; i < attractionname.size(); i++) {
				String url = "http://10.79.10.65:8080/axis2/services/AttractionServices?wsdl";
				String func = "addAttractionBook";
				List<String> args = new ArrayList<String>();
				args.add("num1");
				args.add("price1");
				args.add("pid1");
				List<String> vals = new ArrayList<String>();
				vals.add(this.attractionnum.get(i));
				vals.add(this.attractionprice.get(i));
				vals.add(this.attractionid.get(i));
				bookOne(url, func, args, vals);
			}
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tripadvisor?useSSL=true", "root", "zyt123456");
			Statement stmt = conn.createStatement();
			String queryline = "select max(orderid) from one_order";
			ResultSet rs = stmt.executeQuery(queryline);
			int orderid = 0;
			if(rs.next()) {
				orderid = Integer.parseInt(rs.getString("max(orderid)")) + 1;
			}
			if(!this.airline1.equals("")) {
				String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `flightnumber`, `booktype`, `flightdeparttime`, `flightarrivetime`, `flighttime`, `flightfromcity`, `flighttocity`, `ordernum`, `orderprice`, `orderdate`"
						+ ") values (\'" 
						+ orderid + "\',\'" + userid + "\',\'" + 0 + "\',\'" + this.airline1 + "\',\'" + this.flightno1 + "\',\'" + this.flightclass1 + "\',\'" + this.flightdeparttime1 + "\',\'" + this.flightarrivetime1 + "\',\'" + this.flighttime1 + "\',\'" + this.flightfromcity1 + "\',\'" + this.flighttocity1 + "\',\'" + this.flightnum1 + "\',\'" + this.flightprice1 + "\',\'" + this.flightdate1 + "\')";
				stmt.executeUpdate(addline);
			}
			if(!this.airline2.equals("")) {
				String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `flightnumber`, `booktype`, `flightdeparttime`, `flightarrivetime`, `flighttime`, `flightfromcity`, `flighttocity`, `ordernum`, `orderprice`, `orderdate`"
						+ ") values (\'" 
						+ orderid + "\',\'" + userid + "\',\'" + 1 + "\',\'" + this.airline2 + "\',\'" + this.flightno2 + "\',\'" + this.flightclass2 + "\',\'" + this.flightdeparttime2 + "\',\'" + this.flightarrivetime2 + "\',\'" + this.flighttime2 + "\',\'"  + this.flightfromcity2 + "\',\'" + this.flighttocity2 + "\',\'" + this.flightnum2 + "\',\'" + this.flightprice2 + "\',\'" + this.flightdate2 + "\')";
				stmt.executeUpdate(addline);
			}
			if(!this.hotelname.equals("")) {
				String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `booktype`, `ordernum`, `orderprice`, `orderfromdate`, `ordertodate`, `orderdays`, `orderaddress`, `hotelstar`, `ordercity`"
						+ ") values (\'"
						+ orderid + "\',\'" + userid + "\',\'" + 2 + "\',\'" + this.hotelname + "\',\'" + this.hoteltype + "\',\'" + this.hotelnumber + "\',\'" + this.hotelprice + "\',\'" + this.hotelfromdate + "\',\'" + this.hoteltodate + "\',\'" + this.hoteldays + "\',\'" + this.hoteladdress + "\',\'" + this.hotelstar + "\',\'" + this.hotellocation + "\')";
				stmt.executeUpdate(addline);
			}
			if(!this.companyname.equals("")) {
				String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `booktype`, `orderprice`, `orderfromdate`, `ordertodate`, `orderdays`, `ordercity`, `carbrand`, `carenginetype`, `carpassengers`"
						+ ") values (\'"
						+ orderid + "\',\'" + userid + "\',\'" + 3 + "\',\'" + this.companyname + "\',\'" + this.carshape + "\',\'" + this.carprice + "\',\'" + this.carfromdate + "\',\'" + this.cartodate + "\',\'" + this.cardays + "\',\'" + this.carcity + "\',\'" + this.carbrand + "\',\'" + this.carenginetype + "\',\'" + this.carpassengers + "\')";
				stmt.executeUpdate(addline);
			}
			if(this.attractionname.size() != 0) {
				for(int i = 0; i < this.attractionname.size(); i++) {
					String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `ordernum`, `orderprice`, `orderdate`, `ordercity`"
							+ ") values (\'"
							+ orderid + "\',\'" + userid + "\',\'" + 4 + "\',\'" + this.attractionname.get(i) + "\',\'" + this.attractionnum.get(i) + "\',\'" + this.attractionprice.get(i) + "\',\'" + this.attractiondate.get(i) + "\',\'" + this.attractionlocation.get(i) + "\')";
					stmt.executeUpdate(addline);
				}
			}
			stmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void bookByBPEL(int userid) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tripadvisor?useSSL=true", "root", "zyt123456");
			Statement stmt = conn.createStatement();
			String queryline = "select max(orderid) from one_order";
			ResultSet rs = stmt.executeQuery(queryline);
			int orderid = 0;
			if(rs.next()) {
				orderid = Integer.parseInt(rs.getString("max(orderid)")) + 1;
			}
			if(!this.airline1.equals("")) {
				String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `flightnumber`, `booktype`, `flightdeparttime`, `flightarrivetime`, `flighttime`, `flightfromcity`, `flighttocity`, `ordernum`, `orderprice`, `orderdate`"
						+ ") values (\'" 
						+ orderid + "\',\'" + userid + "\',\'" + 0 + "\',\'" + this.airline1 + "\',\'" + this.flightno1 + "\',\'" + this.flightclass1 + "\',\'" + this.flightdeparttime1 + "\',\'" + this.flightarrivetime1 + "\',\'" + this.flighttime1 + "\',\'" + this.flightfromcity1 + "\',\'" + this.flighttocity1 + "\',\'" + this.flightnum1 + "\',\'" + this.flightprice1 + "\',\'" + this.flightdate1 + "\')";
				stmt.executeUpdate(addline);
			}
			if(!this.airline2.equals("")) {
				String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `flightnumber`, `booktype`, `flightdeparttime`, `flightarrivetime`, `flighttime`, `flightfromcity`, `flighttocity`, `ordernum`, `orderprice`, `orderdate`"
						+ ") values (\'" 
						+ orderid + "\',\'" + userid + "\',\'" + 1 + "\',\'" + this.airline2 + "\',\'" + this.flightno2 + "\',\'" + this.flightclass2 + "\',\'" + this.flightdeparttime2 + "\',\'" + this.flightarrivetime2 + "\',\'" + this.flighttime2 + "\',\'"  + this.flightfromcity2 + "\',\'" + this.flighttocity2 + "\',\'" + this.flightnum2 + "\',\'" + this.flightprice2 + "\',\'" + this.flightdate2 + "\')";
				stmt.executeUpdate(addline);
			}
			if(!this.hotelname.equals("")) {
				String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `booktype`, `ordernum`, `orderprice`, `orderfromdate`, `ordertodate`, `orderdays`, `orderaddress`, `hotelstar`, `ordercity`"
						+ ") values (\'"
						+ orderid + "\',\'" + userid + "\',\'" + 2 + "\',\'" + this.hotelname + "\',\'" + this.hoteltype + "\',\'" + this.hotelnumber + "\',\'" + this.hotelprice + "\',\'" + this.hotelfromdate + "\',\'" + this.hoteltodate + "\',\'" + this.hoteldays + "\',\'" + this.hoteladdress + "\',\'" + this.hotelstar + "\',\'" + this.hotellocation + "\')";
				stmt.executeUpdate(addline);
			}
			if(!this.companyname.equals("")) {
				String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `booktype`, `orderprice`, `orderfromdate`, `ordertodate`, `orderdays`, `ordercity`, `carbrand`, `carenginetype`, `carpassengers`"
						+ ") values (\'"
						+ orderid + "\',\'" + userid + "\',\'" + 3 + "\',\'" + this.companyname + "\',\'" + this.carshape + "\',\'" + this.carprice + "\',\'" + this.carfromdate + "\',\'" + this.cartodate + "\',\'" + this.cardays + "\',\'" + this.carcity + "\',\'" + this.carbrand + "\',\'" + this.carenginetype + "\',\'" + this.carpassengers + "\')";
				stmt.executeUpdate(addline);
			}
			if(this.attractionname.size() != 0) {
				for(int i = 0; i < this.attractionname.size(); i++) {
					String addline = "insert into one_order(`orderid`, `userid`, `ordertype`, `name`, `ordernum`, `orderprice`, `orderdate`, `ordercity`"
							+ ") values (\'"
							+ orderid + "\',\'" + userid + "\',\'" + 4 + "\',\'" + this.attractionname.get(i) + "\',\'" + this.attractionnum.get(i) + "\',\'" + this.attractionprice.get(i) + "\',\'" + this.attractiondate.get(i) + "\',\'" + this.attractionlocation.get(i) + "\')";
					stmt.executeUpdate(addline);
				}
			}
			stmt.close();
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void makeBpel(String name) {
		//<bpel:process>
		String bpelHeadString = "<bpel:process name=\"" + name + "Service\" targetNamespace=\"http://dao.com\" suppressJoinFailure=\"yes\" xmlns:tns=\"http://dao.com\" xmlns:bpel=\"http://docs.oasis-open.org/wsbpel/2.0/process/executable\">";
		List<String> bpelImportStrings = new ArrayList<String>();
		String bpelImpoetLocalString = "<bpel:import location=\"" + name + "Artifacts.wsdl\" namespace=\"http://dao.com\" importType=\"http://schemas.xmlsoap.org/wsdl/\" />";
		//<bpel:partnerLinks>
		String bpelPartnerLinkHeadString = "<bpel:partnerLink name=\"client\" partnerLinkType=\"tns:" + name + "Service\" myRole=\"" + name + "ServiceProvider\" />";
		List<String> bpelPartnerLinksString = new ArrayList<String>();
		//</bpel:partnerLinks>
		//<bpel:variables>
		String bpelFixVariablesString = "<bpel:variable name=\"input\" messageType=\"tns:" + name + "ServiceRequestMessage\"/>" + "<bpel:variable name=\"output\" messageType=\"tns:"+ name + "ResponseMessage\"/>";
		List<String> bpelDynamicVariablesString = new ArrayList<String>();
		//</bpel:variables>
		//<bpel:sequence name="main">
		String bpelReceiveString = "<bpel:receive name=\"receiveInput\" partnerLink=\"client\" portType=\"tns:" + name + "\" operation=\"process\" variable=\"input\" createInstance=\"yes\"/>";
		//<bpel:assign validate="no" name="Assign">
		List<String> bpelCopyInputStringsInit = new ArrayList<String>();
		List<String> bpelCopyInputStrings = new ArrayList<String>();
		//</bpel:assign>
		List<String> bpelInvokeStrings = new ArrayList<String>();
		//<bpel:assign validate="no" name="Assign1">
		List<String> bpelCopyOutputStringsInit = new ArrayList<String>();
		List<String> bpelCopyOutputStrings = new ArrayList<String>();
		//</bpel:assign>
		String bpelReplyString = "<bpel:reply name=\"replyOutput\" partnerLink=\"client\" portType=\"tns:" + name + "\" operation=\"process\" variable=\"output\" />";
		//</bpel:sequence>
		//</bpel:process>
		if(!this.airline1.equals("")) {
			if(this.airline1.equals("中国国航")) {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"CNPL\" partnerLinkType=\"tns:CNPLT\" partnerRole=\"CNRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"CNPLResponse\" messageType=\"tns:addAirlineBookResponse\"></bpel:variable><bpel:variable name=\"CNPLRequest\" messageType=\"tns:addAirlineBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightnum1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightprice1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightdate1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:date]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightfid1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:fid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke0\" partnerLink=\"CNPL\" operation=\"addAirlineBook\" portType=\"tns:ChinaAirlineServicesPortType\" inputVariable=\"CNPLRequest\" outputVariable=\"CNPLResponse\"></bpel:invoke>");
				bpelCopyOutputStringsInit.add("<bpel:copy><bpel:from><bpel:literal><tns:"+ name + "Response xmlns:tns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><tns:result>tns:result</tns:result></tns:" + name + "Response></bpel:literal></bpel:from><bpel:to variable=\"output\" part=\"payload\"></bpel:to></bpel:copy>");
				bpelCopyOutputStrings.add("<bpel:copy><bpel:from part=\"parameters\" variable=\"CNPLResponse\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:return]]></bpel:query></bpel:from><bpel:to part=\"payload\" variable=\"output\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:result]]></bpel:query></bpel:to></bpel:copy>");
			}
			else if(this.airline1.equals("海南航空")) {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"HNPL\" partnerLinkType=\"tns:HNPLT\" partnerRole=\"HNRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"HNPLResponse\" messageType=\"tns:addAirlineBookResponse\"></bpel:variable><bpel:variable name=\"HNPLRequest\" messageType=\"tns:addAirlineBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest\"></bpel:to></bpel:copy>");
//				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\"><ns:addAirlineBook xmlns:ns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ns:num1>ns:num1</ns:num1><ns:price1>ns:price1</ns:price1><ns:date>ns:date</ns:date><ns:fid1>ns:fid1</ns:fid1></ns:addAirlineBook></bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightnum1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightprice1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightdate1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:date]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightfid1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:fid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke0\" partnerLink=\"HNPL\" operation=\"addAirlineBook\" portType=\"tns:HainanAirlineServicesPortType\" inputVariable=\"HNPLRequest\" outputVariable=\"HNPLResponse\"></bpel:invoke>");
				bpelCopyOutputStringsInit.add("<bpel:copy><bpel:from><bpel:literal><tns:"+ name + "Response xmlns:tns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><tns:result>tns:result</tns:result></tns:" + name + "Response></bpel:literal></bpel:from><bpel:to variable=\"output\" part=\"payload\"></bpel:to></bpel:copy>");
				bpelCopyOutputStrings.add("<bpel:copy><bpel:from part=\"parameters\" variable=\"HNPLResponse\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:return]]></bpel:query></bpel:from><bpel:to part=\"payload\" variable=\"output\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:result]]></bpel:query></bpel:to></bpel:copy>");
			}
			else {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"DFPL\" partnerLinkType=\"tns:DFPLT\" partnerRole=\"DFRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"DFPLResponse\" messageType=\"tns:addAirlineBookResponse\"></bpel:variable><bpel:variable name=\"DFPLRequest\" messageType=\"tns:addAirlineBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest\"></bpel:to></bpel:copy>");
//				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\"><ns:addAirlineBook xmlns:ns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ns:num1>ns:num1</ns:num1><ns:price1>ns:price1</ns:price1><ns:date>ns:date</ns:date><ns:fid1>ns:fid1</ns:fid1></ns:addAirlineBook></bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightnum1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightprice1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightdate1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:date]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightfid1 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:fid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke0\" partnerLink=\"DFPL\" operation=\"addAirlineBook\" portType=\"tns:EasternAirlineServicesPortType\" inputVariable=\"DFPLRequest\" outputVariable=\"DFPLResponse\"></bpel:invoke>");
				bpelCopyOutputStringsInit.add("<bpel:copy><bpel:from><bpel:literal><tns:"+ name + "Response xmlns:tns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><tns:result>tns:result</tns:result></tns:" + name + "Response></bpel:literal></bpel:from><bpel:to variable=\"output\" part=\"payload\"></bpel:to></bpel:copy>");
				bpelCopyOutputStrings.add("<bpel:copy><bpel:from part=\"parameters\" variable=\"DFPLResponse\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:return]]></bpel:query></bpel:from><bpel:to part=\"payload\" variable=\"output\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:result]]></bpel:query></bpel:to></bpel:copy>");
			}
		}
		if(!this.airline2.equals("")) {
			if(this.airline2.equals("中国国航")) {
				if(!this.airline1.equals("中国国航")) {
					bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
					bpelPartnerLinksString.add("<bpel:partnerLink name=\"CNPL\" partnerLinkType=\"tns:CNPLT\" partnerRole=\"CNRole\"></bpel:partnerLink>");
				}
				bpelDynamicVariablesString.add("<bpel:variable name=\"CNPLResponse2\" messageType=\"tns:addAirlineBookResponse\"></bpel:variable><bpel:variable name=\"CNPLRequest2\" messageType=\"tns:addAirlineBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest2\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightnum2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightprice2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightdate2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:date]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightfid2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"CNPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:fid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke1\" partnerLink=\"CNPL\" operation=\"addAirlineBook\" portType=\"tns:ChinaAirlineServicesPortType\" inputVariable=\"CNPLRequest2\" outputVariable=\"CNPLResponse2\"></bpel:invoke>");
//				bpelCopyOutputStringsInit.add("<bpel:copy><bpel:from><bpel:literal><tns:"+ name + "Response xmlns:tns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><tns:result>tns:result</tns:result></tns:" + name + "Response></bpel:literal></bpel:from><bpel:to variable=\"output\" part=\"payload\"></bpel:to></bpel:copy>");
//				bpelCopyOutputStrings.add("<bpel:copy><bpel:from part=\"parameters\" variable=\"CNPLResponse\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:return]]></bpel:query></bpel:from><bpel:to part=\"payload\" variable=\"output\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:result]]></bpel:query></bpel:to></bpel:copy>");
			}
			else if(this.airline2.equals("海南航空")) {
				if(!this.airline1.equals("海南航空")) {
					bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
					bpelPartnerLinksString.add("<bpel:partnerLink name=\"HNPL\" partnerLinkType=\"tns:HNPLT\" partnerRole=\"HNRole\"></bpel:partnerLink>");
				}
				
				bpelDynamicVariablesString.add("<bpel:variable name=\"HNPLResponse2\" messageType=\"tns:addAirlineBookResponse\"></bpel:variable><bpel:variable name=\"HNPLRequest2\" messageType=\"tns:addAirlineBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest2\"></bpel:to></bpel:copy>");
//				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\"><ns:addAirlineBook xmlns:ns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ns:num1>ns:num1</ns:num1><ns:price1>ns:price1</ns:price1><ns:date>ns:date</ns:date><ns:fid1>ns:fid1</ns:fid1></ns:addAirlineBook></bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightnum2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightprice2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightdate2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:date]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightfid2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HNPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:fid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke1\" partnerLink=\"HNPL\" operation=\"addAirlineBook\" portType=\"tns:HainanAirlineServicesPortType\" inputVariable=\"HNPLRequest2\" outputVariable=\"HNPLResponse2\"></bpel:invoke>");
//				bpelCopyOutputStringsInit.add("<bpel:copy><bpel:from><bpel:literal><tns:"+ name + "Response xmlns:tns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><tns:result>tns:result</tns:result></tns:" + name + "Response></bpel:literal></bpel:from><bpel:to variable=\"output\" part=\"payload\"></bpel:to></bpel:copy>");
//				bpelCopyOutputStrings.add("<bpel:copy><bpel:from part=\"parameters\" variable=\"HNPLResponse\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:return]]></bpel:query></bpel:from><bpel:to part=\"payload\" variable=\"output\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:result]]></bpel:query></bpel:to></bpel:copy>");
			}
			else {
				if(!this.airline1.equals("东方航空")) {
					bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
					bpelPartnerLinksString.add("<bpel:partnerLink name=\"DFPL\" partnerLinkType=\"tns:DFPLT\" partnerRole=\"DFRole\"></bpel:partnerLink>");
				}
				bpelDynamicVariablesString.add("<bpel:variable name=\"DFPLResponse2\" messageType=\"tns:addAirlineBookResponse\"></bpel:variable><bpel:variable name=\"DFPLRequest2\" messageType=\"tns:addAirlineBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest2\"></bpel:to></bpel:copy>");
//				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\"><ns:addAirlineBook xmlns:ns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ns:num1>ns:num1</ns:num1><ns:price1>ns:price1</ns:price1><ns:date>ns:date</ns:date><ns:fid1>ns:fid1</ns:fid1></ns:addAirlineBook></bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightnum2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightprice2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightdate2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:date]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.flightfid2 + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"DFPLRequest2\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:fid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke1\" partnerLink=\"DFPL\" operation=\"addAirlineBook\" portType=\"tns:EasternAirlineServicesPortType\" inputVariable=\"DFPLRequest2\" outputVariable=\"DFPLResponse2\"></bpel:invoke>");
//				bpelCopyOutputStringsInit.add("<bpel:copy><bpel:from><bpel:literal><tns:"+ name + "Response xmlns:tns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><tns:result>tns:result</tns:result></tns:" + name + "Response></bpel:literal></bpel:from><bpel:to variable=\"output\" part=\"payload\"></bpel:to></bpel:copy>");
//				bpelCopyOutputStrings.add("<bpel:copy><bpel:from part=\"parameters\" variable=\"DFPLResponse\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:return]]></bpel:query></bpel:from><bpel:to part=\"payload\" variable=\"output\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:result]]></bpel:query></bpel:to></bpel:copy>");
			}
		}
		if(!this.hotelname.equals("")) {
			if(this.hotelname.equals("上海和平饭店")) {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/HepingHotelServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"HPPL\" partnerLinkType=\"tns:HPPLT\" partnerRole=\"HPRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"HPPLResponse\" messageType=\"tns:addHotelBookResponse\"></bpel:variable><bpel:variable name=\"HPPLRequest\" messageType=\"tns:addHotelBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"HPPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteltype + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HPPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:type]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelfromdate + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HPPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:timein]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteltodate + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HPPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:timeout]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteldays + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HPPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:day1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelprice + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HPPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelid + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HPPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:pid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelnumber + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"HPPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke2\" partnerLink=\"HPPL\" operation=\"addAirlineBook\" portType=\"tns:HepingHotelServicesPortType\" inputVariable=\"HPPLRequest\" outputVariable=\"HPPLResponse\"></bpel:invoke>");
//				bpelCopyOutputStringsInit.add("<bpel:copy><bpel:from><bpel:literal><tns:"+ name + "Response xmlns:tns=\"http://dao.com\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><tns:result>tns:result</tns:result></tns:" + name + "Response></bpel:literal></bpel:from><bpel:to variable=\"output\" part=\"payload\"></bpel:to></bpel:copy>");
//				bpelCopyOutputStrings.add("<bpel:copy><bpel:from part=\"parameters\" variable=\"CNPLResponse\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:return]]></bpel:query></bpel:from><bpel:to part=\"payload\" variable=\"output\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:result]]></bpel:query></bpel:to></bpel:copy>");
			}
			else if(this.hotelname.equals("北京首都大酒店")) {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/ShouduHotelServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"SDPL\" partnerLinkType=\"tns:SDPLT\" partnerRole=\"SDRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"SDPLResponse\" messageType=\"tns:addHotelBookResponse\"></bpel:variable><bpel:variable name=\"SDPLRequest\" messageType=\"tns:addHotelBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"SDPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteltype + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:type]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelfromdate + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:timein]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteltodate + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:timeout]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteldays + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:day1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelprice + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelid + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:pid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelnumber + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke2\" partnerLink=\"SDPL\" operation=\"addHotelBook\" portType=\"tns:ShouduHotelServicesPortType\" inputVariable=\"SDPLRequest\" outputVariable=\"SDPLResponse\"></bpel:invoke>");
			}
			else if(this.hotelname.startsWith("如家精选")) {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/RujiaHotelServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"RJPL\" partnerLinkType=\"tns:RJPLT\" partnerRole=\"RJRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"RJPLResponse\" messageType=\"tns:addHotelBookResponse\"></bpel:variable><bpel:variable name=\"RJPLRequest\" messageType=\"tns:addHotelBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"RJPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteltype + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"RJPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:type]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelfromdate + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"RJPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:timein]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteltodate + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"RJPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:timeout]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteldays + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"RJPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:day1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelprice + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"RJPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelid + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"RJPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:pid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelnumber + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"RJPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke2\" partnerLink=\"RJPL\" operation=\"addHotelBook\" portType=\"tns:RujiaHotelServicesPortType\" inputVariable=\"RJPLRequest\" outputVariable=\"RJPLResponse\"></bpel:invoke>");
			}
			else if(this.hotelname.startsWith("北京希尔顿") || this.hotelname.startsWith("上海希尔顿")) {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/XierdunHotelServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"XRDPL\" partnerLinkType=\"tns:XRDPLT\" partnerRole=\"XRDRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"XRDPLResponse\" messageType=\"tns:addHotelBookResponse\"></bpel:variable><bpel:variable name=\"XRDPLRequest\" messageType=\"tns:addHotelBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"XRDPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteltype + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"XRDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:type]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelfromdate + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"XRDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:timein]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteltodate + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"XRDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:timeout]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hoteldays + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"XRDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:day1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelprice + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"XRDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelid + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"XRDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:pid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.hotelnumber + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"XRDPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke2\" partnerLink=\"XRDPL\" operation=\"addHotelBook\" portType=\"tns:XierdunHotelServicesPortType\" inputVariable=\"XRDPLRequest\" outputVariable=\"XRDPLResponse\"></bpel:invoke>");
			}
		}
		if(!this.companyname.equals("")) {
			if(this.companyname.equals("一嗨租车")) {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/OhCarServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"OHPL\" partnerLinkType=\"tns:OHPLT\" partnerRole=\"OHRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"OHPLResponse\" messageType=\"tns:addCarBookResponse\"></bpel:variable><bpel:variable name=\"OHPLRequest\" messageType=\"tns:addCarBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"OHPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.carbrand + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"OHPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:shape]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.cardays + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"OHPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:day1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.carprice + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"OHPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.carid + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"OHPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:carid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke3\" partnerLink=\"OHPL\" operation=\"addCarBook\" portType=\"tns:OhCarServicesPortType\" inputVariable=\"OHPLRequest\" outputVariable=\"OHPLResponse\"></bpel:invoke>");
			}
			else if(this.companyname.equals("神州租车")) {
				bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/SzCarServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
				bpelPartnerLinksString.add("<bpel:partnerLink name=\"SZPL\" partnerLinkType=\"tns:SZPLT\" partnerRole=\"SZRole\"></bpel:partnerLink>");
				bpelDynamicVariablesString.add("<bpel:variable name=\"SZPLResponse\" messageType=\"tns:addCarBookResponse\"></bpel:variable><bpel:variable name=\"SZPLRequest\" messageType=\"tns:addCarBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"SZPLRequest\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.carbrand + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SZPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:shape]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.cardays + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SZPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:day1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.carprice + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SZPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.carid + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"SZPLRequest\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:carid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke3\" partnerLink=\"SZPL\" operation=\"addCarBook\" portType=\"tns:SzCarServicesPortType\" inputVariable=\"SZPLRequest\" outputVariable=\"SZPLResponse\"></bpel:invoke>");
			}
		}
		if(this.attractionname.size() != 0) {
			bpelImportStrings.add("<bpel:import namespace=\"http://dao.com\" location=\"http://10.79.10.65:8080/axis2/services/AttractionServices?wsdl\" importType=\"http://schemas.xmlsoap.org/wsdl/\"></bpel:import>");
			bpelPartnerLinksString.add("<bpel:partnerLink name=\"ATPL\" partnerLinkType=\"tns:ATPLT\" partnerRole=\"ATRole\"></bpel:partnerLink>");
			for(int i = 0; i < this.attractionname.size(); i++) {
				bpelDynamicVariablesString.add("<bpel:variable name=\"ATPLResponse" + i + "\" messageType=\"tns:addCarBookResponse\"></bpel:variable><bpel:variable name=\"ATPLRequest" + i + "\" messageType=\"tns:addCarBookRequest\"></bpel:variable>");
				bpelCopyInputStringsInit.add("<bpel:copy><bpel:from part=\"payload\" variable=\"input\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:input]]></bpel:query></bpel:from><bpel:to part=\"parameters\" variable=\"ATPLRequest" + i + "\"></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.attractionnum.get(i) + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"ATPLRequest" + i + "\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:num1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.attractionprice.get(i) + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"ATPLRequest" + i + "\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:price1]]></bpel:query></bpel:to></bpel:copy>");
				bpelCopyInputStrings.add("<bpel:copy><bpel:from><bpel:literal xml:space=\"preserve\">" + this.attractionid.get(i) + "</bpel:literal></bpel:from><bpel:to part=\"parameters\" variable=\"ATPLRequest" + i + "\"><bpel:query queryLanguage=\"urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0\"><![CDATA[tns:pid1]]></bpel:query></bpel:to></bpel:copy>");
				bpelInvokeStrings.add("<bpel:invoke name=\"Invoke" + (3 + i) + "\" partnerLink=\"ATPL\" operation=\"addAttractionBook\" portType=\"tns:AttractionServicesPortType\" inputVariable=\"ATPLRequest" + i + "\" outputVariable=\"ATPLResponse" + i + "\"></bpel:invoke>");
			}
		}
		String bpelAllString = "";
		bpelAllString += bpelHeadString;
		for(String str:bpelImportStrings) {
			bpelAllString += str;
		}
		bpelAllString += bpelImpoetLocalString;
		bpelAllString += "<bpel:partnerLinks>";
		bpelAllString += bpelPartnerLinkHeadString;
		for(String str:bpelPartnerLinksString) {
			bpelAllString += str;
		}
		bpelAllString += "</bpel:partnerLinks>";
		bpelAllString += "<bpel:variables>";
		bpelAllString += bpelFixVariablesString;
		for(String str:bpelDynamicVariablesString) {
			bpelAllString += str;
		}
		bpelAllString += "</bpel:variables>";
		bpelAllString += "<bpel:sequence name=\"main\">";
		bpelAllString += bpelReceiveString;
		bpelAllString += "<bpel:assign validate=\"no\" name=\"Assign\">";
		for(String str:bpelCopyInputStringsInit) {
			bpelAllString += str;
		}
		for(String str:bpelCopyInputStrings) {
			bpelAllString += str;
		}
		bpelAllString += "</bpel:assign>";
		for(String str:bpelInvokeStrings) {
			bpelAllString += str;
		}
		bpelAllString += "<bpel:assign validate=\"no\" name=\"Assign1\">";
		for(String str:bpelCopyOutputStringsInit) {
			bpelAllString += str;
		}
		for(String str:bpelCopyOutputStrings) {
			bpelAllString += str;
		}
		bpelAllString += "</bpel:assign>";
		bpelAllString += bpelReplyString;
		bpelAllString += "</bpel:sequence>";
		bpelAllString += "</bpel:process>";
		try {
			FileWriter fw = new FileWriter(new File("D:\\TripAdvisorGitRepository\\" + name + "bpel" + ".bpel"));
			fw.write(bpelAllString);
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public void makeArticactsWsdl(String name) {
		String wsdlHeaderString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><definitions xmlns=\"http://schemas.xmlsoap.org/wsdl/\" xmlns:plnk=\"http://docs.oasis-open.org/wsbpel/2.0/plnktype\" xmlns:soap=\"http://schemas.xmlsoap.org/wsdl/soap/\" xmlns:tns=\"http://dao.com\" xmlns:vprop=\"http://docs.oasis-open.org/wsbpel/2.0/varprop\" name=\"" + name + "\" targetNamespace=\"http://dao.com\">";
		List<String> partnerLinkString = new ArrayList<String>();
		List<String> importStrings = new ArrayList<String>();
		String typeString = "<types><schema xmlns=\"http://www.w3.org/2001/XMLSchema\" attributeFormDefault=\"unqualified\" elementFormDefault=\"qualified\" targetNamespace=\"http://dao.com\"><element name=\"" + name + "Request\"><complexType><sequence><element name=\"input\" type=\"string\"/></sequence></complexType></element><element name=\"" + name + "Response\"><complexType><sequence><element name=\"result\" type=\"string\"/></sequence></complexType></element></schema></types>";
		String messageString = "<message name=\"" + name + "RequestMessage\"><part element=\"tns:" + name + "Request\" name=\"payload\"/></message><message name=\"" + name + "ResponseMessage\"><part element=\"tns:" + name + "Response\" name=\"payload\"/></message>";
		String processString = "<portType name=\"" + name + "\"><operation name=\"process\"><input message=\"tns:" + name + "RequestMessage\"/><output message=\"tns:" + name + "ResponseMessage\"/></operation></portType>";
		String partnerLinkTypeString = "<plnk:partnerLinkType name=\"" + name + "\"><plnk:role name=\"" + name + "Provider\" portType=\"tns:" + name + "\"/></plnk:partnerLinkType>";
		String bindingString = "<binding name=\"" + name + "Binding\" type=\"tns:" + name + "\"><soap:binding style=\"document\" transport=\"http://schemas.xmlsoap.org/soap/http\"/><operation name=\"process\"><soap:operation soapAction=\"http://dao.com/process\"/><input><soap:body use=\"literal\"/></input><output><soap:body use=\"literal\"/></output></operation></binding>";
		String serviceString = "<service name=\"" + name + "Service\"><port binding=\"tns:" + name + "Binding\" name=\"" + name + "Port\"><soap:address location=\"http://localhost:8080/ode/processes/" + name + "\"/></port></service></definitions>";
		if(!this.airline1.equals("")) {
			if(this.airline1.equals("中国国航")) {
				partnerLinkString.add("<plnk:partnerLinkType name=\"CNPLT\"><plnk:role name=\"CNRole\" portType=\"tns:ChinaAirlineServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
			else if(this.airline1.equals("海南航空")) {
				partnerLinkString.add("<plnk:partnerLinkType name=\"HNPLT\"><plnk:role name=\"HNRole\" portType=\"tns:HainanAirlineServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
			else {
				partnerLinkString.add("<plnk:partnerLinkType name=\"DFPLT\"><plnk:role name=\"DFRole\" portType=\"tns:EasternAirlineServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
		}
		if(!this.airline2.equals("")) {
			if(this.airline2.equals("中国国航")) {
				if(!this.airline1.equals("中国国航")) {
					partnerLinkString.add("<plnk:partnerLinkType name=\"CNPLT\"><plnk:role name=\"CNRole\" portType=\"tns:ChinaAirlineServicesPortType\"/></plnk:partnerLinkType>");
					importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl\" namespace=\"http://dao.com\"/>");
				}
				
			}
			else if(this.airline2.equals("海南航空")) {
				if(!this.airline1.equals("海南航空")) {
					partnerLinkString.add("<plnk:partnerLinkType name=\"HNPLT\"><plnk:role name=\"HNRole\" portType=\"tns:HainanAirlineServicesPortType\"/></plnk:partnerLinkType>");
					importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl\" namespace=\"http://dao.com\"/>");
				}
			}
			else {
				if(!this.airline1.equals("东方航空")) {
					partnerLinkString.add("<plnk:partnerLinkType name=\"DFPLT\"><plnk:role name=\"DFRole\" portType=\"tns:EasternAirlineServicesPortType\"/></plnk:partnerLinkType>");
					importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl\" namespace=\"http://dao.com\"/>");
				}
			}
		}
		if(!this.hotelname.equals("")) {
			if(this.hotelname.equals("上海和平饭店")) {
				partnerLinkString.add("<plnk:partnerLinkType name=\"HPPLT\"><plnk:role name=\"HPRole\" portType=\"tns:HepingHotelServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/HepingHotelServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
			else if(this.hotelname.equals("北京首都大酒店")) {
				partnerLinkString.add("<plnk:partnerLinkType name=\"SDPLT\"><plnk:role name=\"SDRole\" portType=\"tns:ShouduHotelServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/ShouduHotelServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
			else if(this.hotelname.startsWith("如家精选")) {
				partnerLinkString.add("<plnk:partnerLinkType name=\"RJPLT\"><plnk:role name=\"RJRole\" portType=\"tns:RujiaHotelServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/RujiaHotelServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
			else if(this.hotelname.startsWith("北京希尔顿") || this.hotelname.startsWith("上海希尔顿")) {
				partnerLinkString.add("<plnk:partnerLinkType name=\"XRDPLT\"><plnk:role name=\"XRDRole\" portType=\"tns:XierdunHotelServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/XierdunHotelServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
		}
		if(!this.companyname.equals("")) {
			if(this.companyname.equals("一嗨租车")) {
				partnerLinkString.add("<plnk:partnerLinkType name=\"OHPLT\"><plnk:role name=\"OHRole\" portType=\"tns:OneHighCarServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/OhCarServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
			else if(this.companyname.equals("神州租车")) {
				partnerLinkString.add("<plnk:partnerLinkType name=\"SZPLT\"><plnk:role name=\"SZRole\" portType=\"tns:SzCarServicesPortType\"/></plnk:partnerLinkType>");
				importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/SzCarHotelServices?wsdl\" namespace=\"http://dao.com\"/>");
			}
		}
		if(this.attractionname.size() != 0) {
			partnerLinkString.add("<plnk:partnerLinkType name=\"ATPLT\"><plnk:role name=\"ATRole\" portType=\"tns:AttractionServicesPortType\"/></plnk:partnerLinkType>");
			importStrings.add("<import location=\"http://10.79.10.65:8080/axis2/services/AttractionServices?wsdl\" namespace=\"http://dao.com\"/>");
		}
		String wsdlAllString = wsdlHeaderString;
		for(String str:partnerLinkString) {
			wsdlAllString += str;
		}
		for(String str:importStrings) {
			wsdlAllString += str;
		}
		wsdlAllString += typeString;
		wsdlAllString += messageString;
		wsdlAllString += processString;
		wsdlAllString += partnerLinkTypeString;
		wsdlAllString += bindingString;
		wsdlAllString += serviceString;
		try {
			FileWriter fw = new FileWriter(new File("D:\\TripAdvisorGitRepository\\" + name + "bpelArtifacts.wsdl"));
			fw.write(wsdlAllString);
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
