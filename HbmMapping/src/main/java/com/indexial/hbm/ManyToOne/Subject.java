package com.indexial.hbm.ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sub_mot")
public class Subject {
@Id
	int subId;
	String subName;
	@ManyToOne(cascade=CascadeType.ALL)
	Lecturer lecturer;
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + ", lecturer=" + lecturer + "]";
	}
	public Subject(int subId, String subName, Lecturer lecturer) {
		super();
		this.subId = subId;
		this.subName = subName;
		this.lecturer = lecturer;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
}
