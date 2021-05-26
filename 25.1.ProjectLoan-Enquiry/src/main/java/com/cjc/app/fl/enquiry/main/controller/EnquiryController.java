package com.cjc.app.fl.enquiry.main.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fl.enquiry.main.model.Enquiry;
import com.cjc.app.fl.enquiry.main.service.EnquiryService;

@RestController
@RequestMapping("/enquiry")
public class EnquiryController {
	@Autowired
	EnquiryService es;
	
	@PostMapping("/add")
	public String saveData(@RequestBody Enquiry enq)
	{
		es.saveData(enq);
		return "Data add in database";
		
	}
	 @GetMapping("/display")
	public List<Enquiry> getData()
	{
		 List<Enquiry> list=es.getData();
		return list;
		
	}
	 @GetMapping("/get/{id}")
	 public Enquiry getDatabyid(@PathVariable("id") int id)
	 {
		 Enquiry enq=es.getDatabyid(id);
		return enq;
		 
	 }
	  @PutMapping("/update")
	 public String update(@RequestBody Enquiry enq)
	 {
		  es.saveData(enq);
		return "update successfully";
		 
	 }
	  @DeleteMapping("/delete/{id}")
	  public String deleteData(@PathVariable("id") int id)
	  {
		  es.deleteData(id);
		return "delete successfully";
		  
	  }
	

}
