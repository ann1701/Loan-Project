package com.cjc.app.fl.enquiry.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import lombok.Data;

@Entity
//@Data
public class Status_master {
	@Id
	private int status_id;
	private String status_name;
	private int status_code;
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public String getStatus_name() {
		return status_name;
	}
	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	
}
