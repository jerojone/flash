package completeDao;

public class LoggedInUserDetails {
		
	private String empId;
	private String empName;
	private String empDept;
	private String currentdate;
	private String ipAddr;
	private String forName;
	private String searchFor;
	
	public LoggedInUserDetails(String empId, String empName, String empDept, String currentdate, String ipAddr,
			String forName, String searchFor) {
		
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.currentdate = currentdate;
		this.ipAddr = ipAddr;
		this.forName = forName;
		this.searchFor = searchFor;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(String currentdate) {
		this.currentdate = currentdate;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public String getForName() {
		return forName;
	}
	public void setForName(String forName) {
		this.forName = forName;
	}
	public String getSearchFor() {
		return searchFor;
	}
	public void setSearchFor(String searchFor) {
		this.searchFor = searchFor;
	}
	
	
	
}
