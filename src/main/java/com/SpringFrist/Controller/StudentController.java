package com.SpringFrist.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFrist.Model.Student;
import com.SpringFrist.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	 //get all student  ,localhost:8080/student/all
	@GetMapping("/all")
	public List<Student> findAllStudent(){
	     return studentService.findAll();	
	}
	//insert record to student localhost:8080/student/add
    @PostMapping(value="/add",produces =MediaType.APPLICATION_JSON_VALUE
          /* headers = MediaType.APPLICATION_JSON_VALUE*/)
    @ResponseBody
    public   String addStudent(@RequestBody Student student) {
    	return studentService.addStudent(student);
    }
    
  //update student data ,localhost:8080/student/update
    @PutMapping("/update")
    public String updateStudent(@RequestBody Student updateStudent) {
    	return studentService.updateStudent(updateStudent);
    }
    //get student record by id ,localhost:8080/student/{sid}
    @GetMapping("/{sId}")
    public Optional<Student> oneStudent(@PathVariable String sId) {
    	return studentService.findOne(sId);
    }
    //delete one record by id , localhost:8080/student/{sid} 
    @DeleteMapping("/{sId}")
    public String  deleteStudent(@PathVariable String sId) {
    	return studentService.delete(sId);
    }
}

