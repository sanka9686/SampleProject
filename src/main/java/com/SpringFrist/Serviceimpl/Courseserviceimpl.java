package com.SpringFrist.Serviceimpl;

import java.util.List;
import java.util.Optional;

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
	@Override
	public String updateCourse(Course updateCourse) {
		String msg="null";
		if(updateCourse.getcId()!=null ||updateCourse.getcId()!="") {
		courseRepository.save(updateCourse);
		msg="updated student raw "+ updateCourse;
		}
		else {
			msg="error";
		}
		return msg;
	}
	@Override
	public Optional<Course> findOne(String cId) {
		return courseRepository.findById(cId);
	}
	@Override
	public String delete(String cId) {
	    courseRepository.deleteById(cId);
	    String msg= "deleted one raw where course Id = "+cId ;
		return msg;
		
	}
	
	

}
