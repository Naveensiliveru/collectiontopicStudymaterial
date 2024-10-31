package com.naveen;

public class employee {
	private int employeeId;
	private String emplyName;
	private   int yearInorg;
	private  String gender;
	public employee(int employeeId, String emplyName, int yearInorg, String gender) {
		super();
		this.employeeId = employeeId;
		this.emplyName = emplyName;
		this.yearInorg = yearInorg;
		this.gender = gender;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmplyName() {
		return emplyName;
	}
	public void setEmplyName(String emplyName) {
		this.emplyName = emplyName;
	}
	public int getYearInorg() {
		return yearInorg;
	}
	public void setYearInorg(int yearInorg) {
		this.yearInorg = yearInorg;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", emplyName=" + emplyName + ", yearInorg=" + yearInorg
				+ ", gender=" + gender + "]";
	}
	

}
