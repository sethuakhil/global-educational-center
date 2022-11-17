package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GEC")

public class Course {
	
	@Id
	private Long courseId;
	private String courseName;
	private Double fees;
	private Integer duration;
	
	
	
	public Course() {
		super();
	}


	public Course(long courseId, String courseName, Double fees, Integer duration) {
		super();
		this.courseId=courseId;
		this.courseName = courseName;
		this.fees = fees;
		this.duration = duration;
	}
	public long getCourseId() {
		return courseId;
	}


	public void setCourseId(long i) {
		this.courseId = i;
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


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + ", duration="
				+ duration + "]";
	}

}
