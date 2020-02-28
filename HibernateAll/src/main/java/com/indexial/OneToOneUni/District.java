package com.indexial.OneToOneUni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dist_info")

public class District {
	@Id
	int distPin;
	String distname;
	int totalTq;

	@Override
	public String toString() {
		return "/n District [distPin=" + distPin + ", distname=" + distname + ", totalTq=" + totalTq + "]";
	}

	public District(int distPin, String distname, int totalTq) {
		super();
		this.distPin = distPin;
		this.distname = distname;
		this.totalTq = totalTq;
	}

	public District() {
		super();
	}

	public int getDistPin() {
		return distPin;
	}

	public void setDistPin(int distPin) {
		this.distPin = distPin;
	}

	public String getDistname() {
		return distname;
	}

	public void setDistname(String distname) {
		this.distname = distname;
	}

	public int getTotalTq() {
		return totalTq;
	}

	public void setTotalTq(int totalTq) {
		this.totalTq = totalTq;
	}

}
