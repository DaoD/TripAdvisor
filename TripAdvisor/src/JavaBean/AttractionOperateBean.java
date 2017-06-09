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

public class AttractionOperateBean {
	public List<AttractionBean> getAllAttractionByCondition(String location, String range1_, String range2_) {
		String url = "http://10.79.10.65:8080/axis2/services/AttractionServices?wsdl";
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

            OMElement method = fac.createOMElement("queryAttractionByAll", omNs);
            
            OMElement symbol1 = fac.createOMElement("location", omNs);
            symbol1.addChild(fac.createOMText(symbol1, location));
            method.addChild(symbol1);
            
            OMElement symbol2 = fac.createOMElement("range1_", omNs);
            symbol2.addChild(fac.createOMText(symbol2, range1_));
            method.addChild(symbol2);
            
            OMElement symbol3 = fac.createOMElement("range2_", omNs);
            symbol3.addChild(fac.createOMText(symbol3, range2_));
            method.addChild(symbol3);
            
            method.build();
  
            result = sender.sendReceive(method);
            List<AttractionBean> attractionlist = new ArrayList<AttractionBean>();
            
            Iterator iterator =  result.getChildElements();
            while (iterator.hasNext()) {
            	OMElement omNode = (OMElement) iterator.next();
            	Iterator iterator2 = omNode.getChildElements();
            	AttractionBean tmpAttractionBean = new AttractionBean();
            	while(iterator2.hasNext()) {
            		OMElement omNode2 = (OMElement) iterator2.next();
            		switch (omNode2.getLocalName()) {
            		case "id":
            			tmpAttractionBean.setId(omNode2.getText());
            			break;
					case "location":
						tmpAttractionBean.setLocation(omNode2.getText());
						break;
					case "name":
						tmpAttractionBean.setName(omNode2.getText());
						break;
					case "price":
						tmpAttractionBean.setPrice(omNode2.getText());
						break;
					default:
						break;
					}
            	}
            	attractionlist.add(tmpAttractionBean);
            }
            return attractionlist;    
        } catch (AxisFault axisFault) {  
            axisFault.printStackTrace();  
            return new ArrayList<AttractionBean>();
        }  
	}
	
	public List<AttractionBean> getAllAttractions() {
		String url = "http://10.79.10.65:8080/axis2/services/AttractionServices?wsdl";
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

            OMElement method = fac.createOMElement("queryAttraction", omNs);
            method.build();
  
            result = sender.sendReceive(method);
            List<AttractionBean> attractionlist = new ArrayList<AttractionBean>();
            
            Iterator iterator =  result.getChildElements();
            while (iterator.hasNext()) {
            	OMElement omNode = (OMElement) iterator.next();
            	Iterator iterator2 = omNode.getChildElements();
            	AttractionBean tmpAttractionBean = new AttractionBean();
            	while(iterator2.hasNext()) {
            		OMElement omNode2 = (OMElement) iterator2.next();
            		switch (omNode2.getLocalName()) {
            		case "id":
            			tmpAttractionBean.setId(omNode2.getText());
            			break;
					case "location":
						tmpAttractionBean.setLocation(omNode2.getText());
						break;
					case "name":
						tmpAttractionBean.setName(omNode2.getText());
						break;
					case "price":
						tmpAttractionBean.setPrice(omNode2.getText());
						break;
					default:
						break;
					}
            	}
            	attractionlist.add(tmpAttractionBean);
            }
            return attractionlist;    
        } catch (AxisFault axisFault) {  
            axisFault.printStackTrace();  
            return null;
        }  
	}
}
