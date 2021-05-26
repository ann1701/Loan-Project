package com.cjc.app.fl.enquiry.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fl.enquiry.main.model.Enquiry;
import com.cjc.app.fl.enquiry.main.repository.EnquiryRepository;
import com.cjc.app.fl.enquiry.main.service.EnquiryService;
@Service
public class EnquiryServiceImpl implements EnquiryService
{
	@Autowired
	EnquiryRepository er;

	@Override
	public void saveData(Enquiry enq) {
		er.save(enq);
	}

	@Override
	public List<Enquiry> getData() {
		List<Enquiry> list=er.findAll();
		return list;
	}

	@Override
	public Enquiry getDatabyid(int id) {
		Enquiry enq=er.findById(id);
		return enq;
	}

	@Override
	public void deleteData(int id) {
		er.deleteById(id);
		
	}


}
