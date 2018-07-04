package com.SpringFrist.Service;

import java.util.List;
import java.util.Optional;

import com.SpringFrist.Model.Course;

public interface CourseService {

	List<Course> findAllCourses();
	String addCourse(Course courseData);
	String updateCourse(Course updateCourse);
	Optional<Course> findOne(String cId);
	String delete(String cId);

}
