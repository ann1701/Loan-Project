package com.cjc.app.fl.enquiry.main.service;

import java.util.List;

import com.cjc.app.fl.enquiry.main.model.Enquiry;

public interface EnquiryService {

	void saveData(Enquiry enq);

	List<Enquiry> getData();

	Enquiry getDatabyid(int id);

	void deleteData(int id);

	

}
