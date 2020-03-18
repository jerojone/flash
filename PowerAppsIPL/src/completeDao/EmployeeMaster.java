package completeDao;

public class EmployeeMaster {

	private String empId;
	private String empName;
	private String empDept;
	private String empCat;	
	private String dob;
	private String doj;
	private String dol;
	private String sex;
	private String marStat;
	private String accNo;
	
	public EmployeeMaster(String empId, String empName, String empDept, String empCat, String dob, String doj,
			String dol, String sex, String marStat, String accNo) {
		
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empCat = empCat;
		this.dob = dob;
		this.doj = doj;
		this.dol = dol;
		this.sex = sex;
		this.marStat = marStat;
		this.accNo = accNo;
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

	public String getEmpCat() {
		return empCat;
	}

	public void setEmpCat(String empCat) {
		this.empCat = empCat;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getDol() {
		return dol;
	}

	public void setDol(String dol) {
		this.dol = dol;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMarStat() {
		return marStat;
	}

	public void setMarStat(String marStat) {
		this.marStat = marStat;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	
	

}
