package com.cjc.app.fl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import lombok.Data;

@Entity
//@Data
public class City_master {
	@Id
	private int city_id;
	private String city_name;
	@OneToOne(cascade = CascadeType.ALL)
	private District_master dist;
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public District_master getDist() {
		return dist;
	}
	public void setDist(District_master dist) {
		this.dist = dist;
	}

	
}
