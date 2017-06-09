package JavaBean;

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

public class CarOperateBean {
	
	private List<CarBean> getCarByCondition(String url, String location, String range1_, String range2_, String passengernum) {
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

            OMElement method = fac.createOMElement("queryCarByAll", omNs);
            
            OMElement symbol1 = fac.createOMElement("location", omNs);
            symbol1.addChild(fac.createOMText(symbol1, location));
            method.addChild(symbol1);
            
            OMElement symbol2 = fac.createOMElement("range1_", omNs);
            symbol2.addChild(fac.createOMText(symbol2, range1_));
            method.addChild(symbol2);
            
            OMElement symbol3 = fac.createOMElement("range2_", omNs);
            symbol3.addChild(fac.createOMText(symbol3, range2_));
            method.addChild(symbol3);
            
            OMElement symbol4 = fac.createOMElement("num1", omNs);
            symbol4.addChild(fac.createOMText(symbol4, passengernum));
            method.addChild(symbol4);
            
            method.build();
  
            result = sender.sendReceive(method);
            List<CarBean> carlist = new ArrayList<CarBean>();
            
            Iterator iterator =  result.getChildElements();
            while (iterator.hasNext()) {
            	OMElement omNode = (OMElement) iterator.next();
            	Iterator iterator2 = omNode.getChildElements();
            	CarBean tmpCarBean = new CarBean();
            	while(iterator2.hasNext()) {
            		OMElement omNode2 = (OMElement) iterator2.next();
            		switch (omNode2.getLocalName()) {
            		case "id":
            			tmpCarBean.setId(omNode2.getText());
            			break;
					case "companyname":
						tmpCarBean.setCompanyname(omNode2.getText());
						break;
					case "location":
						tmpCarBean.setLocation(omNode2.getText());
						break;
					case "name":
						tmpCarBean.setName(omNode2.getText());
						break;
					case "person":
						tmpCarBean.setPerson(omNode2.getText());
						break;
					case "shape":
						tmpCarBean.setShape(omNode2.getText());
						break;
					case "type":
						tmpCarBean.setType(omNode2.getText());
						break;
					case "price":
						tmpCarBean.setPrice(omNode2.getText());
						break;
					default:
						break;
					}
            	}
            	carlist.add(tmpCarBean);
            }
            return carlist;    
        } catch (AxisFault axisFault) {  
            axisFault.printStackTrace();  
            return new ArrayList<CarBean>();
        }  
	}
	
	private List<CarBean> getCarByCompany(String url) {
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

            OMElement method = fac.createOMElement("query", omNs);
            method.build();
  
            result = sender.sendReceive(method);
            List<CarBean> carlist = new ArrayList<CarBean>();
            
            Iterator iterator =  result.getChildElements();
            while (iterator.hasNext()) {
            	OMElement omNode = (OMElement) iterator.next();
            	Iterator iterator2 = omNode.getChildElements();
            	CarBean tmpCarBean = new CarBean();
            	while(iterator2.hasNext()) {
            		OMElement omNode2 = (OMElement) iterator2.next();
            		switch (omNode2.getLocalName()) {
            		case "id":
            			tmpCarBean.setId(omNode2.getText());
            			break;
					case "companyname":
						tmpCarBean.setCompanyname(omNode2.getText());
						break;
					case "location":
						tmpCarBean.setLocation(omNode2.getText());
						break;
					case "name":
						tmpCarBean.setName(omNode2.getText());
						break;
					case "person":
						tmpCarBean.setPerson(omNode2.getText());
						break;
					case "shape":
						tmpCarBean.setShape(omNode2.getText());
						break;
					case "type":
						tmpCarBean.setType(omNode2.getText());
						break;
					case "price":
						tmpCarBean.setPrice(omNode2.getText());
						break;
					default:
						break;
					}
            	}
            	carlist.add(tmpCarBean);
            }
            return carlist;    
        } catch (AxisFault axisFault) {  
            axisFault.printStackTrace();  
            return null;
        }  
	}
	
	public List<CarBean> getAllCars() {
		String url = "http://10.79.10.65:8080/axis2/services/SzCarServices?wsdl";
		String url2 = "http://10.79.10.65:8080/axis2/services/OhCarServices?wsdl";
		
		List<CarBean> carlist = getCarByCompany(url);
		List<CarBean> carlist2 = getCarByCompany(url2);
		
		carlist.addAll(carlist2);
		
		return carlist;
		
	}
	
	public List<CarBean> getAllCarsByCondition(String location, String range1_, String range2_, String passengersnum) {
		String url = "http://10.79.10.65:8080/axis2/services/SzCarServices?wsdl";
		String url2 = "http://10.79.10.65:8080/axis2/services/OhCarServices?wsdl";
		
		List<CarBean> carlist = getCarByCondition(url, location, range1_, range2_, passengersnum);
		List<CarBean> carlist2 = getCarByCondition(url2, location, range1_, range2_, passengersnum);
		
		carlist.addAll(carlist2);
		
		return carlist;
		
	}
}
