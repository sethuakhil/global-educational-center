package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@SpringBootApplication
public class GlobalEducationalCenterApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(GlobalEducationalCenterApplication.class, args);
		CourseService courseRepo = context.getBean(CourseService.class);
		
		System.out.println(courseRepo.getCourse());
		
		
//		Course course = new Course();
//		course.setCourseId(1001);
//		course.setCourseName("MPC");
//		course.setDuration(12);
//		course.setFees(2000.0);
//		courseRepo.addCourse(course);
//		


	}
	

}
