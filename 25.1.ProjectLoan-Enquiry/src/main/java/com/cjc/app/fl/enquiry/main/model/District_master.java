package com.cjc.app.fl.enquiry.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//import lombok.Data;

@Entity
//@Data
public class District_master {
	@Id
	private int dist_id;
	private String dist_name;
	@OneToOne(cascade = CascadeType.ALL)
	private State_master state;
	public int getDist_id() {
		return dist_id;
	}
	public void setDist_id(int dist_id) {
		this.dist_id = dist_id;
	}
	public String getDist_name() {
		return dist_name;
	}
	public void setDist_name(String dist_name) {
		this.dist_name = dist_name;
	}
	public State_master getState() {
		return state;
	}
	public void setState(State_master state) {
		this.state = state;
	}
    
}
