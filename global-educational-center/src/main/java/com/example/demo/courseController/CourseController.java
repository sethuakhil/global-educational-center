package com.example.demo.courseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/index")
	public ModelAndView getCourses(){
		ModelAndView mv=new ModelAndView("courseList");
		mv.addObject("course", courseService.corseList());
		return mv;

	}
	@GetMapping("/new")
	public ModelAndView addCourses(Model model){
		ModelAndView mv=new ModelAndView("new");
//		mv.addObject("course", courseService.getCourse());
		return mv;
	}
	@GetMapping("/editCourse")
	public ModelAndView editCourses(@RequestParam("id") long id){
		ModelAndView mv=new ModelAndView("editCourse");
		mv.addObject("course", courseService.getCourse(id));
		return mv;
	} 
	
	@PostMapping("/update")
	public ModelAndView updateCourses(@ModelAttribute("course") Course course ){
		courseService.saveCourse(course);
		ModelAndView mv=new ModelAndView("redirect:/index");
		mv.addObject("course", courseService.corseList());
		return mv; 
	}
	

	@PostMapping("/save")
	public ModelAndView saveCourses(@ModelAttribute("course") Course course ){
		ModelAndView mv=new ModelAndView("redirect:/index");
		mv.addObject("course", courseService.corseList());
		return mv; 
	}
}
