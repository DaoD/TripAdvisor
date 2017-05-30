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
	
	public List<AirlineBean> getAllAirlines() {
		OMElement result = null;  
        try {  
            String url = "http://10.79.10.65:8080/axis2/services/EasternAirlineServices?wsdl";  

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
}
