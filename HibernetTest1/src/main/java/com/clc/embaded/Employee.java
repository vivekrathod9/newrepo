package com.clc.embaded;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Embadabel")
public class Employee {

	@EmbeddedId
	private EmbadedId embadedId;
	private String empName;
	private int empAge;
	private String empAddress;
	
	@Override
	public String toString() {
		return "\n Employee [embadedId=" + embadedId + ", " + ", empName=" + empName + ", empAge=" + empAge
				+ ", empAddress=" + empAddress + "]";
	}
	public Employee() {
		super();
	}
	public Employee(EmbadedId embadedId,  String empName, int empAge, String empAddress) {
		super();
		this.embadedId = embadedId;
		this.empName = empName;
		this.empAge = empAge;
		this.empAddress = empAddress;
	}
	public EmbadedId getEmbadedId() {
		return embadedId;
	}
	public void setEmbadedId(EmbadedId embadedId) {
		this.embadedId = embadedId;
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
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
}
