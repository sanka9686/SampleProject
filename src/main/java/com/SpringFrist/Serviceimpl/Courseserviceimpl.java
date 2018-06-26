package com.SpringFrist.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFrist.Model.Course;
import com.SpringFrist.Repository.CourseRepository;
import com.SpringFrist.Service.CourseService;

@Service
public class Courseserviceimpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	@Override
	public List<Course>  findAllCourses(){
		List<Course> course =courseRepository.findAll();
		return course;
	}
	@Override
	public String  addCourse(Course courseData ) {
		courseRepository.save(courseData);
		return "one course saved"; 
	}
	
	

}
