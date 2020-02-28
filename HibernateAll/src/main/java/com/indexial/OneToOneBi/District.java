package com.indexial.OneToOneBi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Dist_info_bi")

public class District {
	@Id
	int distPin;
	String distname;
	int totalTq;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_city_bi")
	City city;

	@Override
	public String toString() {
		return "/n District [distPin=" + distPin + ", distname=" + distname + ", totalTq=" + totalTq + ", city=" + city
				+ "]";
	}

	public District(int distPin, String distname, int totalTq, City city) {
		super();
		this.distPin = distPin;
		this.distname = distname;
		this.totalTq = totalTq;
		this.city = city;
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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
