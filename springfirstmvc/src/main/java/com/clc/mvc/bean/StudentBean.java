package com.clc.mvc.bean;

public class StudentBean {

	private int studId;
	private String studName;
	private int studAge;
	private String studAdd;

	@Override
	public String toString() {
		return "\n StudentBean [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + ", studAdd="
				+ studAdd + "]";
	}

	public StudentBean() {
		super();
	}

	public StudentBean(int studId, String studName, int studAge, String studAdd) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
		this.studAdd = studAdd;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public String getStudAdd() {
		return studAdd;
	}

	public void setStudAdd(String studAdd) {
		this.studAdd = studAdd;
	}

}
