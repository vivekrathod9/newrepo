package com.indexial.OneToOneBi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "City_info_bi")
public class City {

	@Id
	int cityPin;
	String cityName;
	long cityPopullation;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_dist_bi")
	District district;
	
	@Override
	public String toString() {
		return "/n City [cityPin=" + cityPin + ", cityName=" + cityName + ", cityPopullation=" + cityPopullation
				+ ", district=" + district + "]";
	}
	public City(int cityPin, String cityName, long cityPopullation, District district) {
		super();
		this.cityPin = cityPin;
		this.cityName = cityName;
		this.cityPopullation = cityPopullation;
		this.district = district;
	}
	public City() {
		super();
	}
	public int getCityPin() {
		return cityPin;
	}
	public void setCityPin(int cityPin) {
		this.cityPin = cityPin;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public long getCityPopullation() {
		return cityPopullation;
	}
	public void setCityPopullation(long cityPopullation) {
		this.cityPopullation = cityPopullation;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	
	
	
}
