package com.example.demo.courseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/get")
	public ModelAndView getCourses(Model model){
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("course", courseService.getCourse());
		return mv;

	}
	

}
