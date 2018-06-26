package com.SpringFrist.Service;

import java.util.List;
import com.SpringFrist.Model.Course;

public interface CourseService {

	List<Course> findAllCourses();
	String addCourse(Course courseData);
	//Course find(String id);

}
