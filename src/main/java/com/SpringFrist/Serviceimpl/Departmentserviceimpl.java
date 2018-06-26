package com.SpringFrist.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFrist.Model.Department;
import com.SpringFrist.Repository.DepartmentRepository;
import com.SpringFrist.Service.DepartmentService;

@Service
public class Departmentserviceimpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
     @Override
	public List<Department> findAllDepartments() {
    	 List<Department> departments= departmentRepository.findAll();
    	 return departments;
     }
     
	@Override
	public String addDepartment(Department departmentData) {
		departmentRepository.save(departmentData);
		return "data save works";
	}

}
