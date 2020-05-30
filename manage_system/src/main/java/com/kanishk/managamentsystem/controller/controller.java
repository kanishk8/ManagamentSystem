package com.kanishk.managamentsystem.controller;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;
import com.kanishk.managamentsystem.model.Details;

import org.aspectj.weaver.patterns.IScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kanishk.managamentsystem.service.DetailsService;

@RestController
public class controller {
	
	@Autowired
	private DetailsService detser;
	
	//get all details
	@RequestMapping("/details")
	public List<Details> getAllDetails()
	{
		return detser.getAllDetails();
	}
	
	
	//inserting value inside
	@RequestMapping(method = RequestMethod.POST, value="/details")
	public void addStu(@RequestBody Details det)
	{
		detser.addstudent(det);
	}

	
	//searching single id...
	/*@RequestMapping("/details/{id}")
	public Details  getDetail(@PathVariable String id)
	{
		return detser.getDetails(id);
	}*/
	
	
	@RequestMapping("/details/{id}")
	public Optional<Details>  getDetail(@PathVariable String id)
	{
		//System.out.print(id.getClass());
	 // System.out.print(detser.getDetails(Integer.parseInt(id)));
		return detser.getDetails(Integer.parseInt(id));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	//update single element...
	@RequestMapping(method = RequestMethod.PUT,value = "/details/{id}")
	public void updateDetails(@RequestBody Details det,@PathVariable String id)
	{
		detser.updateDetails(Integer.parseInt(id),det);
		
	}
	
	
	 
	//delete details of student depending upon its id
	@RequestMapping(method = RequestMethod.DELETE,value ="/details/{id}")
	public void  deleteDetail(@PathVariable String id)
	{
		 detser.delDetails(Integer.parseInt(id));
	}

}
