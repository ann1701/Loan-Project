package com.cjc.app.fl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import lombok.Data;

@Entity
//@Data
public class State_master {
	@Id
	private int state_id;
	private String state_name;
	private String stategst_code;
	private String state_code;
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getStategst_code() {
		return stategst_code;
	}
	public void setStategst_code(String stategst_code) {
		this.stategst_code = stategst_code;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	
}
