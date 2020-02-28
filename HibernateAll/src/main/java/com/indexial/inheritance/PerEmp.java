package com.indexial.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PERMANENT_EMPLOYEE")
@DiscriminatorValue("PERMANENT_EMP")
public class PerEmp extends Employee{
	
	String pEmp_address;
	double pEmp_sallary;
	
	@Override
	public String toString() {
		return "PerEmp [pEmp_address=" + pEmp_address + ", pEmp_sallary=" + pEmp_sallary + "]";
	}
	public PerEmp(int empId, String empName, String pEmp_address, double pEmp_sallary) {
		super(empId, empName);
		this.pEmp_address = pEmp_address;
		this.pEmp_sallary = pEmp_sallary;
	}
	public String getpEmp_address() {
		return pEmp_address;
	}
	public void setpEmp_address(String pEmp_address) {
		this.pEmp_address = pEmp_address;
	}
	public double getpEmp_sallary() {
		return pEmp_sallary;
	}
	public void setpEmp_sallary(double pEmp_sallary) {
		this.pEmp_sallary = pEmp_sallary;
	}
	public PerEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PerEmp(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}
	


}
