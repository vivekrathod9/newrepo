
package com.indexial.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "City_OTM")
@PrimaryKeyJoinColumn(name="id")
public class City {

	@Id
	int cityPin;
	String cityName;
	long cityPopullation;

	@Override
	public String toString() {
		return "/n City [cityPin=" + cityPin + ", cityName=" + cityName + ", cityPopullation=" + cityPopullation + "]";
	}

	public City(int cityPin, String cityName, long cityPopullation) {
		super();
		this.cityPin = cityPin;
		this.cityName = cityName;
		this.cityPopullation = cityPopullation;
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

}
