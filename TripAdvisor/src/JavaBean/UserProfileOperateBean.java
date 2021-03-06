package JavaBean;
import java.sql.*;

public class UserProfileOperateBean {
	private UserProfileBean userProfileBean;
	private Connection conn;
	
	public UserProfileOperateBean() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tripadvisor?useSSL=true", "root", "zyt123456");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public UserProfileBean getUserProfileBean() {
		return userProfileBean;
	}

	public void setUserProfileBean(UserProfileBean userProfileBean) {
		this.userProfileBean = userProfileBean;
	}
	
	public Boolean save() {
		int userid = userProfileBean.getUserid();
		String companyname = userProfileBean.getCompanyName();
		String contactnumber = userProfileBean.getContactNumber();
		String country = userProfileBean.getCountry();
		String state = userProfileBean.getState();
		String address = userProfileBean.getAddress();
		String zipcode = userProfileBean.getZipcode();
		try {
			Statement stmt = conn.createStatement();
			String queryline = "select userid from profile where userid = \'" + userid + "\'";
			ResultSet rs = stmt.executeQuery(queryline);
			if (rs.next()) {
				String updateline = "update profile set companyname = \'" + companyname + "\', contactnumber = \'" 
						+ contactnumber + "\', country = \'" + country + "\', state = \'" + state + "\', address = \'"
						+ address + "\', zipcode = \'" + zipcode + "\'";
				stmt.executeUpdate(updateline);
				stmt.close();
				conn.close();
				return true;
			}
			else {
				String addline = "insert into profile(`userid`, `companyname`, `contactnumber`, `country`, `state`, `address`, `zipcode`) values (\'" 
						+ userid + "\',\'" + companyname + "\',\'" + contactnumber + "\',\'" + country + "\',\'" + state + "\',\'" + address + "\',\'" + zipcode + "\')";
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
	
	public void getProfile(int userid) {
		try {
			Statement stmt = conn.createStatement();
			String queryline = "select * from profile where userid = \'" + userid + "\'";
			ResultSet rs = stmt.executeQuery(queryline);
			if(rs.next()) {
				userProfileBean.setCompanyName(rs.getString("companyname"));
				userProfileBean.setContactNumber(rs.getString("contactnumber"));
				userProfileBean.setCountry(rs.getString("country"));
				userProfileBean.setState(rs.getString("state"));
				userProfileBean.setAddress(rs.getString("address"));
				userProfileBean.setZipcode(rs.getString("zipcode"));
			}
			else {
				userProfileBean.setCompanyName("");
				userProfileBean.setContactNumber("");
				userProfileBean.setCountry("");
				userProfileBean.setState("");
				userProfileBean.setAddress("");
				userProfileBean.setZipcode("");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
