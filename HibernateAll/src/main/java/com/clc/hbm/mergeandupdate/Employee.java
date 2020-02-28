package com.clc.hbm.mergeandupdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.sf.ehcache.config.PersistenceConfiguration.Strategy;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String empName;

	@Override
	public String toString() {
		return "\n [empId=" + empId + ", empName=" + empName + "]";
	}

	public Employee() {
		super();
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
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

}
