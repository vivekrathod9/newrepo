package com.clc.embaded;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmbadedId implements Serializable{
	private int empId;
	private String empName;
	private int empAge;
	
	@Override
	public String toString() {
		return "\n EmbadedId [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}

	public EmbadedId(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	public EmbadedId() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}
