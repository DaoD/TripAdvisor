package JavaBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceOperateBean {
	private ServiceBean serviceBean;
	private Connection conn;
	
	public ServiceOperateBean() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tripadvisor?useSSL=true", "root", "zyt123456");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public ServiceBean getServiceBean() {
		return serviceBean;
	}

	public void setServiceBean(ServiceBean serviceBean) {
		this.serviceBean = serviceBean;
	}
	
	public Boolean addService() {
		int userid = serviceBean.getUserid();
		String servicename = serviceBean.getServicename();
		String wsdladdress = serviceBean.getWsdladdress();
		String note = serviceBean.getNote();
		try {
			Statement stmt = conn.createStatement();
			String queryline = "select wsdladdress from service where wsdladdress = \'" + wsdladdress + "\'";
			ResultSet rs = stmt.executeQuery(queryline);
			if (rs.next()) {
				stmt.close();
				conn.close();
				return false;
			}
			else {
				String addline = "insert into service(`userid`, `servicename`, `wsdladdress`, `note`) values (\'" 
					 + userid + "\',\'" + servicename + "\',\'" + wsdladdress + "\',\'" + note + "\')";
				stmt.executeUpdate(addline);
				stmt.close();
				conn.close();
				return true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	public List<ServiceBean> getAllServices(int userid) {
		List<ServiceBean> servicelist = new ArrayList<ServiceBean>();
		try {
			Statement stmt = conn.createStatement();
			String queryline = "select * from service where userid = \'" + userid + "\'";
			ResultSet rs = stmt.executeQuery(queryline);
			while(rs.next()) {
				ServiceBean serviceBean = new ServiceBean();
				serviceBean.setServicename(rs.getString("servicename"));
				serviceBean.setWsdladdress(rs.getString("wsdladdress"));
				serviceBean.setAddtime(rs.getString("addtime"));
				serviceBean.setNote(rs.getString("note"));
				servicelist.add(serviceBean);
			}
			return servicelist;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
		
	}
}
