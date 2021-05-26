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
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addr_id;
	private String addr_first;
	private String addr_second;
	@OneToOne(cascade = CascadeType.ALL)
	private City_master city;
	private String pincode;
	public int getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}
	public String getAddr_first() {
		return addr_first;
	}
	public void setAddr_first(String addr_first) {
		this.addr_first = addr_first;
	}
	public String getAddr_second() {
		return addr_second;
	}
	public void setAddr_second(String addr_second) {
		this.addr_second = addr_second;
	}
	public City_master getCity() {
		return city;
	}
	public void setCity(City_master city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
