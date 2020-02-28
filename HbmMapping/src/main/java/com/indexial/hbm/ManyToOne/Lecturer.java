package com.indexial.hbm.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lect_mto")
public class Lecturer {
	@Id
	int lectId;
	String lectName;
	
	@Override
	public String toString() {
		return "Lecturer [lectId=" + lectId + ", lectName=" + lectName + "]";
	}
	public Lecturer(int lectId, String lectName) {
		super();
		this.lectId = lectId;
		this.lectName = lectName;
	}
	public int getLectId() {
		return lectId;
	}
	public void setLectId(int lectId) {
		this.lectId = lectId;
	}
	public String getLectName() {
		return lectName;
	}
	public void setLectName(String lectName) {
		this.lectName = lectName;
	}
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
