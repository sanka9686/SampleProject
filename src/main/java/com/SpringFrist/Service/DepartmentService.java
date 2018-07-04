package com.SpringFrist.Service;

import java.util.List;
import java.util.Optional;

import com.SpringFrist.Model.Department;

public interface DepartmentService {
    
	List<Department> findAllDepartments();
	String addDepartment(Department departmentData);
	String updateDepartment(Department updateDepartment);
	Optional<Department> findOne(int dId);
	String delete(int dId);



	
}
