package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class Course {
	
	@Id
	private Long courseId;
	private String courseName;
	private Double fees;
	private Integer duration;
	public Long getCourseId() {
		return courseId;
	}
	
	
	public Course() {
		super();
	}


	public Course( String courseName, Double fees, Integer duration) {
		super();
		
		this.courseName = courseName;
		this.fees = fees;
		this.duration = duration;
	}


	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

}
