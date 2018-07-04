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

import com.SpringFrist.Model.Department;
import com.SpringFrist.Service.DepartmentService;

@RequestMapping("/department")
@RestController
public class DepartmentController {
	 @Autowired
	 private DepartmentService departmentService;
	     //get all department  ,localhost:8080/department/all
		  @GetMapping("/all")
		  public List<Department> Works() {
			  return departmentService.findAllDepartments();
		  }
		  //insert record to department localhost:8080/department/add
		  @PostMapping("/add")
		  public String addDepartment(@RequestBody Department departmentData) {
			   return departmentService.addDepartment(departmentData);
		  }
		  //update department data ,localhost:8080/department/update
		  @PutMapping("/update")
		    public String updateDepartment(@RequestBody Department updateDepartment) {
		    	return departmentService.updateDepartment(updateDepartment);
		    }
		  //get department record by id ,localhost:8080/department/{did}
		  @GetMapping("/{dId}")
		    public Optional<Department> oneDepartment(@PathVariable int dId) {
		    	return departmentService.findOne(dId);
		    }
		   //delete one record by id , localhost:8080/department/{did} 
		    @DeleteMapping("/{dId}")
		    public String  deleteDepartment(@PathVariable int dId) {
		    	return departmentService.delete(dId);
		    }
         }         
