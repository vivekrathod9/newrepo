package com.clc.hbm;

public class StudentEntity {
	private int stdId;
	private String stdName;
	private int stdAge;

	@Override
	public String toString() {
		return "StudentEntity [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + "]";
	}
	public StudentEntity(int stdId, String stdName, int stdAge) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}
	public StudentEntity() {
		super();
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdAge() {
		return stdAge;
	}
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
}
