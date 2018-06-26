package com.SpringFrist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringFrist.Model.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

	

}
