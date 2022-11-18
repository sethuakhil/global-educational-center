package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepo;
@Service
public class CourseService {
	@Autowired
	CourseRepo courseRepo;
	
	public List<Course> corseList() {
		return courseRepo.findAll();
	}
	
	public void addCourse(Course newCourse) {
		courseRepo.save(newCourse);
	}
	
	public void saveCourse(Course newCourse) {
		courseRepo.save(newCourse);
	}
	public Course getCourse(long courseId) {
		
		return courseRepo.findById(courseId).get();
		
	}

}
