package JavaBean;

public class ServiceBean {
	private int serviceid;
	private int userid;
	private String servicename;
	private String wsdladdress;
	private String addtime;
	private String note;
	
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getWsdladdress() {
		return wsdladdress;
	}
	public void setWsdladdress(String wsdladdress) {
		this.wsdladdress = wsdladdress;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}
