<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="org.apache.axis2.*" %>
<%@ page import="java.util.*" %>
<%@ page import="org.apache.axiom.om.OMAbstractFactory" %>
<%@ page import="org.apache.axiom.om.OMElement" %>
<%@ page import="org.apache.axiom.om.OMFactory" %>
<%@ page import="org.apache.axiom.om.OMNamespace" %>
<%@ page import="org.apache.axis2.AxisFault" %>
<%@ page import="org.apache.axis2.addressing.EndpointReference" %>
<%@ page import="org.apache.axis2.client.Options" %>
<%@ page import="org.apache.axis2.client.ServiceClient" %>
<%@ page import="org.apache.axis2.rpc.client.RPCServiceClient" %>
<%@ page import="javax.xml.namespace.QName" %>

<%
	String url = "http://10.79.10.65:8080/axis2/services/ChinaAirlineServices?wsdl";
	EndpointReference targetEPR = new EndpointReference(url);
	Options options = new Options();
	options.setTo(targetEPR);
	ServiceClient sender = new ServiceClient();
	sender.setOptions(options);
	OMFactory fac = OMAbstractFactory.getOMFactory();
	String tns = "ttp://dao.com/";
	OMNamespace omNs = fac.createOMNamespace(tns, "");
	OMElement method = fac.createOMElement("query", omNs);
	method.build();
	OMElement result = sender.sendReceive(method);
	out.print(result);
// 	RPCServiceClient serviceClient = new RPCServiceClient();
// 	EndpointReference targetEPR = new EndpointReference(url);
// 	Options options = serviceClient.getOptions();
// 	options.setTo(targetEPR);
// 	options.setAction("urn:query");
// 	QName qname = new QName("http://jh.com", "query");
// 	Object[] parameters = new Object[] {};
// 	Class[] returnTypes = new Class[] { String.class };
// 	OMElement element = serviceClient.invokeBlocking(qname, parameters);
// 	String result = element.getFirstElement().getText();
// 	out.print(result);
	
%>