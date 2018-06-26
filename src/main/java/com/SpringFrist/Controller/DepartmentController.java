package com.SpringFrist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringFrist.Model.Department;
import com.SpringFrist.Service.DepartmentService;

@RequestMapping("/department")
@RestController
public class DepartmentController {
	 @Autowired
	 private DepartmentService departmentService;
	  
		  @GetMapping("/all")
		  public List<Department> Works() {
			  return departmentService.findAllDepartments();
		  }
		  
		  @PostMapping("/one")
		  public String addDepartment(@RequestBody Department departmentData) {
			   return departmentService.addDepartment(departmentData);
		  }
         }         
