package JavaBean;
import java.sql.*;

public class UserRegisterBean {
	private UserBean userBean;
	private Connection conn;
	
	public UserRegisterBean() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tripadvisor", "root", "zyt123456");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}
	
	public int register() {
		String username = userBean.getUsername();
		String password = userBean.getPassword();
		String email = userBean.getEmail();
		int type = userBean.getType();
		try {
			Statement stmt = conn.createStatement();
			String queryline = "select username from user where username = \'" + username + "\'";
			ResultSet rs = stmt.executeQuery(queryline);
			if (rs.next()) {
				stmt.close();
				conn.close();
				return 1;
			}
			else {
				String addline = "insert into user(`username`, `password`, `email`, `type`) values (\'" 
						+ username + "\',md5(\'" + password + "\'),\'" + email + "\',\'" + type + "\')";
				stmt.executeUpdate(addline);
				stmt.close();
				conn.close();
				return 2;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 1;
		}
	}
	
	public int check() {
		String username = userBean.getUsername();
		String password = userBean.getPassword();
		int type = userBean.getType();
		try {
			Statement stmt = conn.createStatement();
			String queryline = "select userid, username, password from user where username=\'" + username + "\' and password=md5(\'" + password + "\')";
			ResultSet rs = stmt.executeQuery(queryline);
			if(rs.next()) {
				int userid = Integer.parseInt(rs.getString("userid"));
				stmt.close();
				conn.close();
				return userid;
			}
			else {
				stmt.close();
				conn.close();
				return 0;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
	}
}
