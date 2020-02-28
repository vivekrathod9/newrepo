package com.indexial.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Dist_OTM")
@PrimaryKeyJoinColumn(name="id")
public class District {
	@Id
	int distPin;
	String distname;
	int totalTq;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_dist")
	List<City> city;

	@Override
	public String toString() {
		return "/n District [distPin=" + distPin + ", distname=" + distname + ", totalTq=" + totalTq + ", city=" + city
				+ "]";
	}

	public District(int distPin, String distname, int totalTq, List<City> city) {
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

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

}
