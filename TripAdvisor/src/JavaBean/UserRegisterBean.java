package JavaBean;
import java.sql.*;

public class UserRegisterBean {
	private UserBean userBean;
	private Connection conn;
	
	public UserRegisterBean() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tripadvisor", "root", "zyt5023767");
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
	
	public int register() throws Exception {
		String username = userBean.getUsername();
		String password = userBean.getPassword();
		String email = userBean.getEmail();
		String nickname = userBean.getNickname();
		int type = userBean.getType();
		try {
			Statement stmt = conn.createStatement();
			String queryline = "select username from user where username = \'" + username + "\' or nickname = \'" + nickname + "\'";
			ResultSet rs = stmt.executeQuery(queryline);
			if (rs.next()) {
				return 1;
			}
			else {
				String addline = "insert into user(`username`, `password`, `email`, `nickname`, `type`) values (\'" 
						+ username + "\',md5(\'" + password + "\'),\'" + email + "\',\'" + nickname + "\',\'" + type + "\')";
				stmt.executeUpdate(addline);
				return 2;
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}
}
