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
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enq_id;
	private String enq_name;
	private String enq_dob;
	private int enq_age;
	@OneToOne(cascade = CascadeType.ALL)
	private Address addr;
	@OneToOne(cascade = CascadeType.ALL)
	private Per_Address paddr;
	private String enq_mobileno;
	private String alt_mobileno;
	private String enq_email;
	private String pan_no;
	private String adhar_no;
	@OneToOne(cascade = CascadeType.ALL)
	private  Occupation_master oc;
	private String income;
	private String vehicle_name;
	private String req_amount;
	private String date_of_app;
	@OneToOne(cascade = CascadeType.ALL)
	private Status_master status;
	private String cibil_score;
	public int getEnq_id() {
		return enq_id;
	}
	public void setEnq_id(int enq_id) {
		this.enq_id = enq_id;
	}
	public String getEnq_name() {
		return enq_name;
	}
	public void setEnq_name(String enq_name) {
		this.enq_name = enq_name;
	}
	public String getEnq_dob() {
		return enq_dob;
	}
	public void setEnq_dob(String enq_dob) {
		this.enq_dob = enq_dob;
	}
	public int getEnq_age() {
		return enq_age;
	}
	public void setEnq_age(int enq_age) {
		this.enq_age = enq_age;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Per_Address getPaddr() {
		return paddr;
	}
	public void setPaddr(Per_Address paddr) {
		this.paddr = paddr;
	}
	public String getEnq_mobileno() {
		return enq_mobileno;
	}
	public void setEnq_mobileno(String enq_mobileno) {
		this.enq_mobileno = enq_mobileno;
	}
	public String getAlt_mobileno() {
		return alt_mobileno;
	}
	public void setAlt_mobileno(String alt_mobileno) {
		this.alt_mobileno = alt_mobileno;
	}
	public String getEnq_email() {
		return enq_email;
	}
	public void setEnq_email(String enq_email) {
		this.enq_email = enq_email;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}
	public Occupation_master getOc() {
		return oc;
	}
	public void setOc(Occupation_master oc) {
		this.oc = oc;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public String getReq_amount() {
		return req_amount;
	}
	public void setReq_amount(String req_amount) {
		this.req_amount = req_amount;
	}
	public String getDate_of_app() {
		return date_of_app;
	}
	public void setDate_of_app(String date_of_app) {
		this.date_of_app = date_of_app;
	}
	public Status_master getStatus() {
		return status;
	}
	public void setStatus(Status_master status) {
		this.status = status;
	}
	public String getCibil_score() {
		return cibil_score;
	}
	public void setCibil_score(String cibil_score) {
		this.cibil_score = cibil_score;
	}
	
	
}
