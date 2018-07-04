package com.SpringFrist.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	//get all course , localhost:8080/course/all
	@GetMapping("/all")
	public List<Course> findAllCource(){
		return courseService.findAllCourses();
	}
	//add one raw , localhost:8080/course/add
	@PostMapping("/add")
	  public String addCource(@RequestBody Course courseData) {
		   return courseService.addCourse(courseData);
	  }
	 //update course data , localhost:8080/course/update
	  @PutMapping("/update")
	    public String updateCourse(@RequestBody Course updateCourse) {
	    	return courseService.updateCourse(updateCourse);
	    }
	  //get course data by id , localhost:8080/course/{did}
	  @GetMapping("/{dId}")
	    public Optional<Course> oneCourse(@PathVariable String cId) {
	    	return courseService.findOne(cId);
	    }
	    //delete one recoed by id ,localhost:8080/department/{did}
	    @DeleteMapping("/{dId}")
	    public String  deleteDepartment(@PathVariable String cId) {
	    	return courseService.delete(cId);
	    }

}
