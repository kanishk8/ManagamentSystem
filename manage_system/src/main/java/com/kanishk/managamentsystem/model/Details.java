package com.kanishk.managamentsystem.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

 @Entity
 @Table(name="tbl_details")
 @Setter
 @Getter
 @ToString
 @AllArgsConstructor
 @NoArgsConstructor
public class Details {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String institute;
	private String skill_set;
	private String contact_details;
	private String tentative_joining_date;
	private String location;
	private String description;
	private String  feedback;
	
	public Details() {}
	
	
	
	
	
	
	
	
	

	public Details(Integer id, String institute, String skill_set, String contact_details, String tentative_joining_date,
			String location, String description, String feedback) {
		super();
		this.id = id;
		this.institute = institute;
		this.skill_set = skill_set;
		this.contact_details = contact_details;
		this.tentative_joining_date = tentative_joining_date;
		this.location = location;
		this.description = description;
		this.feedback = feedback;
	}










	

	public Integer getId() {
		return id;
	}










	public void setId(Integer id) {
		this.id = id;
	}










	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getSkill_set() {
		return skill_set;
	}

	public void setSkill_set(String skill_set) {
		this.skill_set = skill_set;
	}

	public String getContact_details() {
		return contact_details;
	}

	public void setContact_details(String contact_details) {
		this.contact_details = contact_details;
	}

	public String getTentative_joining_date() {
		return tentative_joining_date;
	}

	public void setTentative_joining_date(String tentative_joining_date) {
		this.tentative_joining_date = tentative_joining_date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
	
	
	
	
	
	
}
