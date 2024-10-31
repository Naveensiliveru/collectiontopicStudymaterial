package com.lovenaveen;

public class Employye {
	private int empNo;
	private String empName;
	private double  salary;
	 public  Employye ( int empNo, String empName, double salary) {
		 this.empNo = empNo;
		 this .empName= empName;
		 this.salary = salary;
		 
	 }
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 

}
