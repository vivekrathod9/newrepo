package com.indexial.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRACT_EMPLOYEE")
@DiscriminatorValue("CONTRACT_EMP")

public class ContEmp extends Employee {
	int cEmp_age;
	int cEmp_contract;

	@Override
	public String toString() {
		return "ContEmp [cEmp_age=" + cEmp_age + ", cEmp_contract=" + cEmp_contract + "]";
	}

	public ContEmp(int empId, String empName, int cEmp_age, int cEmp_contract) {
		super(empId, empName);
		this.cEmp_age = cEmp_age;
		this.cEmp_contract = cEmp_contract;
	}

	public int getcEmp_age() {
		return cEmp_age;
	}

	public void setcEmp_age(int cEmp_age) {
		this.cEmp_age = cEmp_age;
	}

	public int getcEmp_contract() {
		return cEmp_contract;
	}

	public void setcEmp_contract(int cEmp_contract) {
		this.cEmp_contract = cEmp_contract;
	}

	public ContEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContEmp(int empId, String empName) {
		super(empId, empName);
		// TODO Auto-generated constructor stub
	}

}
