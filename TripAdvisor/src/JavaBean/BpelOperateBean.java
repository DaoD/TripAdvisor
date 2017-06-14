package JavaBean;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

public class BpelOperateBean {
	public void invokeBPEL(int orderid) {
		OMElement result = null;  
        try {  
        	String url = "";
        	if(orderid == 7) {
    			url = "http://localhost:8080/ode/processes/PlanA?wsdl";
    			Options options = new Options();   
                EndpointReference targetEPR = new EndpointReference(url);  
                options.setTo(targetEPR);  
      
                ServiceClient sender = new ServiceClient();  
                sender.setOptions(options);  
      
                OMFactory fac = OMAbstractFactory.getOMFactory();  
                String tns = "http://dao.com";  
     
                OMNamespace omNs = fac.createOMNamespace(tns, "");

                OMElement method = fac.createOMElement("PlanARequest", omNs);
                  
                OMElement symbol1 = fac.createOMElement("input", omNs);
                symbol1.addChild(fac.createOMText(symbol1, ""));
                method.addChild(symbol1);
                
                method.build();
                System.out.println(method);
                result = sender.sendReceive(method);
    		}
    		else if(orderid == 8) {
    			url = "http://localhost:8080/ode/processes/PlanB?wsdl";
    			Options options = new Options();   
                EndpointReference targetEPR = new EndpointReference(url);  
                options.setTo(targetEPR);  
      
                ServiceClient sender = new ServiceClient();  
                sender.setOptions(options);  
      
                OMFactory fac = OMAbstractFactory.getOMFactory();  
                String tns = "http://dao.com";  
     
                OMNamespace omNs = fac.createOMNamespace(tns, "");

                OMElement method = fac.createOMElement("PlanBRequest", omNs);
                  
                OMElement symbol1 = fac.createOMElement("input", omNs);
                symbol1.addChild(fac.createOMText(symbol1, ""));
                method.addChild(symbol1);
                
                method.build();
                System.out.println(method);
                result = sender.sendReceive(method);
    		}
    		else {
    			url = "http://localhost:8080/ode/processes/PlanC?wsdl";
    			Options options = new Options();   
                EndpointReference targetEPR = new EndpointReference(url);  
                options.setTo(targetEPR);  
      
                ServiceClient sender = new ServiceClient();  
                sender.setOptions(options);  
      
                OMFactory fac = OMAbstractFactory.getOMFactory();  
                String tns = "http://dao.com";  
     
                OMNamespace omNs = fac.createOMNamespace(tns, "");

                OMElement method = fac.createOMElement("PlanCRequest", omNs);
                  
                OMElement symbol1 = fac.createOMElement("input", omNs);
                symbol1.addChild(fac.createOMText(symbol1, ""));
                method.addChild(symbol1);
                
                method.build();
                System.out.println(method);
                result = sender.sendReceive(method);
    		}
  
            
        } catch (AxisFault axisFault) {  
            axisFault.printStackTrace();  
        }  
	}
}
