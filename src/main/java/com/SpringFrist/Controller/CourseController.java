package com.SpringFrist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFrist.Model.Course;
import com.SpringFrist.Service.CourseService;


@RequestMapping("/course")
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/all")
	public List<Course> findAllCource(){
		return courseService.findAllCourses();
	}
	@PostMapping("/one")
	  public String addCource(@RequestBody Course courseData) {
		   return courseService.addCourse(courseData);
	  }
	
	/*@GetMapping("/{id}")
	public Course find(@PathVariable String id) {
		return courseService.find();
	}*/
	 

}
