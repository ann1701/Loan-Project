package com.cjc.app.fl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import lombok.Data;
@Entity
//@Data
public class Per_Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paddr_id;
	private String paddr_first;
	private String paddr_second;
	@OneToOne(cascade = CascadeType.ALL)
	private City_master city;
	private String ppincode;
	public int getPaddr_id() {
		return paddr_id;
	}
	public void setPaddr_id(int paddr_id) {
		this.paddr_id = paddr_id;
	}
	public String getPaddr_first() {
		return paddr_first;
	}
	public void setPaddr_first(String paddr_first) {
		this.paddr_first = paddr_first;
	}
	public String getPaddr_second() {
		return paddr_second;
	}
	public void setPaddr_second(String paddr_second) {
		this.paddr_second = paddr_second;
	}
	public City_master getCity() {
		return city;
	}
	public void setCity(City_master city) {
		this.city = city;
	}
	public String getPpincode() {
		return ppincode;
	}
	public void setPpincode(String ppincode) {
		this.ppincode = ppincode;
	}
	
    
}
