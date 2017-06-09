package JavaBean;
import java.sql.*;
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

public class AirlineOperateBean {
	private AirlineBean airlineBean;

	public AirlineBean getAirlineBean() {
		return airlineBean;
	}

	public void setAirlineBean(AirlineBean airlineBean) {
		this.airlineBean = airlineBean;
	}
	
	private List<AirlineBean> getAirlineByCondition(String url, String from, String to, String class1, String range1_, String range2_) {
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

            OMElement method = fac.createOMElement("queryAirlineByAll", omNs);
            
            OMElement symbol1 = fac.createOMElement("from", omNs);
            symbol1.addChild(fac.createOMText(symbol1, from));
            method.addChild(symbol1);
            
            OMElement symbol2 = fac.createOMElement("to", omNs);
            symbol2.addChild(fac.createOMText(symbol2, to));
            method.addChild(symbol2);
            
            OMElement symbol3 = fac.createOMElement("class1", omNs);
            symbol3.addChild(fac.createOMText(symbol3, class1));
            method.addChild(symbol3);
            
            OMElement symbol4 = fac.createOMElement("range1_", omNs);
            symbol4.addChild(fac.createOMText(symbol4, range1_));
            method.addChild(symbol4);
            
            OMElement symbol5 = fac.createOMElement("range2_", omNs);
            symbol5.addChild(fac.createOMText(symbol5, range2_));
            method.addChild(symbol5);
            
            method.build();
  
            result = sender.sendReceive(method);
            List<AirlineBean> airlinelist = new ArrayList<AirlineBean>();
            
            Iterator iterator =  result.getChildElements();
            while (iterator.hasNext()) {
            	OMElement omNode = (OMElement) iterator.next();
            	Iterator iterator2 = omNode.getChildElements();
            	AirlineBean tmpAirlineBean = new AirlineBean();
            	while(iterator2.hasNext()) {
            		OMElement omNode2 = (OMElement) iterator2.next();
            		switch (omNode2.getLocalName()) {
            		case "id":
            			tmpAirlineBean.setId(omNode2.getText());
            			break;
					case "flightid":
						tmpAirlineBean.setFlightno(omNode2.getText());
						break;
					case "name":
						tmpAirlineBean.setAirline(omNode2.getText());
						break;
					case "type":
						tmpAirlineBean.setFlightclass(omNode2.getText());
						break;
					case "start_time":
						tmpAirlineBean.setDeparttime(omNode2.getText());
						break;
					case "end_time":
						tmpAirlineBean.setArrivetime(omNode2.getText());
						break;
					case "source":
						tmpAirlineBean.setFromcity(omNode2.getText());
						break;
					case "target":
						tmpAirlineBean.setTocity(omNode2.getText());
						break;
					case "flighttime":
						tmpAirlineBean.setFlighttime(omNode2.getText());
						break;
					case "price":
						tmpAirlineBean.setPrice(omNode2.getText());
						break;
					default:
						break;
					}
            	}
            	airlinelist.add(tmpAirlineBean);
            }
            return airlinelist;    
        } catch (AxisFault axisFault) {  
            axisFault.printStackTrace();  
            return new ArrayList<AirlineBean>();
        }  
	}
	
	private List<AirlineBean> getAirlineByCompany(String url) {
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

            OMElement method = fac.createOMElement("queryAirline", omNs);
            method.build();
  
            result = sender.sendReceive(method);
            List<AirlineBean> airlinelist = new ArrayList<AirlineBean>();
            
            Iterator iterator =  result.getChildElements();
            while (iterator.hasNext()) {
            	OMElement omNode = (OMElement) iterator.next();
            	Iterator iterator2 = omNode.getChildElements();
            	AirlineBean tmpAirlineBean = new AirlineBean();
            	while(iterator2.hasNext()) {
            		OMElement omNode2 = (OMElement) iterator2.next();
            		switch (omNode2.getLocalName()) {
            		case "id":
            			tmpAirlineBean.setId(omNode2.getText());
            			break;
					case "flightid":
						tmpAirlineBean.setFlightno(omNode2.getText());
						break;
					case "name":
						tmpAirlineBean.setAirline(omNode2.getText());
						break;
					case "type":
						tmpAirlineBean.setFlightclass(omNode2.getText());
						break;
					case "start_time":
						tmpAirlineBean.setDeparttime(omNode2.getText());
						break;
					case "end_time":
						tmpAirlineBean.setArrivetime(omNode2.getText());
						break;
					case "source":
						tmpAirlineBean.setFromcity(omNode2.getText());
						break;
					case "target":
						tmpAirlineBean.setTocity(omNode2.getText());
						break;
					case "flighttime":
						tmpAirlineBean.setFlighttime(omNode2.getText());
						break;
					case "price":
						tmpAirlineBean.setPrice(omNode2.getText());
						break;
					default:
						break;
					}
            	}
            	airlinelist.add(tmpAirlineBean);
            }
            return airlinelist;    
        } catch (AxisFault axisFault) {  
            axisFault.printStackTrace();  
            return null;
        }  
	}
	
	public List<AirlineBean> getAllAirlines() {

            String url = "http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl";  
            String url2 = "http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl";
            String url3 = "http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl";
            
            List<AirlineBean> airlinelist = getAirlineByCompany(url);
            List<AirlineBean> airlinelist2 = getAirlineByCompany(url2);
            List<AirlineBean> airlinelist3 = getAirlineByCompany(url3);
            
            airlinelist.addAll(airlinelist2);
            airlinelist.addAll(airlinelist3);
            return airlinelist;
	}
	
	public List<AirlineBean> getAllAirlinesByCondition(String from, String to, String class1, String range1_, String range2_) {
		String url = "http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl";  
        String url2 = "http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl";
        String url3 = "http://10.79.10.65:8080/axis2/services/HainanAirlineServices?wsdl";
        
        List<AirlineBean> airlinelist = getAirlineByCondition(url, from, to, class1, range1_, range2_);
        List<AirlineBean> airlinelist2 = getAirlineByCondition(url2, from, to, class1, range1_, range2_);
        List<AirlineBean> airlinelist3 = getAirlineByCondition(url3, from, to, class1, range1_, range2_);
        
        airlinelist.addAll(airlinelist2);
        airlinelist.addAll(airlinelist3);
        return airlinelist;
	}
}
