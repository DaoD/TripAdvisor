package JavaBean;

public class UserProfileBean {
	private int userid;
	private String companyname;
	private String contactnumber;
	private String country;
	private String state;
	private String address;
	private String zipcode;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getCompanyName() {
		return companyname;
	}
	public void setCompanyName(String companyName) {
		this.companyname = companyName;
	}
	public String getContactNumber() {
		return contactnumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactnumber = contactNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
