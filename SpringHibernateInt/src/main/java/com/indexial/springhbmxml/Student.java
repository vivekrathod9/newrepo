package com.indexial.springhbmxml;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class Student {
	int stdId;
	String stdName;
	Subject subject;

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", subject=" + subject + "]";
	}

	public Student(int stdId, String stdName, Subject subject) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.subject = subject;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
