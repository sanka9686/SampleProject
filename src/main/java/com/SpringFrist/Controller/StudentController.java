package com.SpringFrist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFrist.Model.Student;
import com.SpringFrist.Service.StudentService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/all")
	public List<Student> findAllStudent(){
	     return studentService.findAll();	
	}
 
}
