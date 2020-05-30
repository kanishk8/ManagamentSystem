package com.kanishk.managamentsystem.service;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanishk.managamentsystem.model.Details;
import com.kanishk.managamentsystem.repo.DetailsRepo;

@Service
public class DetailsService {
	
	@Autowired
	private DetailsRepo detrepo;

	 //get all details
	 public List<Details> getAllDetails()
	 {
		// return details;
		List<Details> details=new ArrayList<>();
		detrepo.findAll().forEach(details::add);
		return details;
	 }
	 
	 
	 
	 //update details
	public void updateDetails(Integer id, Details det) {
		/*for(int i=0;i<details.size();i++)
		{
			Details de= details.get(i);
			if(de.getId().equals(id))
			{
				details.set(i, det);
				return ;
			}
		}*/
		detrepo.save(det);
		
	}
	public Optional<Details> getDetails(Integer id){
		
		/*for(int i=0;i<details.size();i++)
		{
			Details de= details.get(i);
			if(de.getId().equals(id))
			{
				return de;
			}
			
		}    */
		return detrepo.findById(id);
	}
	
	
	
	
	
	public void addstudent(Details det) {
		//details.add(det);
		detrepo.save(det);
	}
	public void  delDetails(Integer id) {
		
		//details.removeIf(t -> t.getId().equals(id));
		detrepo.deleteById(id);
		
		
	}

}
