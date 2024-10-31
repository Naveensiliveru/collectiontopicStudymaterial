package com.loverBoy;

import java.util.Objects;

public class Employee {
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empName, other.empName) && empNo == other.empNo
				&& Double.doubleToLongBits(empSalary) == Double.doubleToLongBits(other.empSalary);
	}
private int empNo;
 private String  empName;
 private  double  empSalary;
 public   Employee( int empNo, String  empName , double empSalary) {
	 this .empNo = empNo;
	 this .empName = empName;
	 this .empSalary = empSalary;
	 
	 
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
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
 
 
}
