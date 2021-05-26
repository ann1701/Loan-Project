package com.cjc.app.fl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import lombok.Data;

@Entity
//@Data
public class Occupation_master {
	@Id
	private int oc_id;
	private String oc_name;
	public int getOc_id() {
		return oc_id;
	}
	public void setOc_id(int oc_id) {
		this.oc_id = oc_id;
	}
	public String getOc_name() {
		return oc_name;
	}
	public void setOc_name(String oc_name) {
		this.oc_name = oc_name;
	}
	

}
