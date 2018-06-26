package com.SpringFrist.Service;

import java.util.List;
import com.SpringFrist.Model.Department;

public interface DepartmentService {
    
	List<Department> findAllDepartments();
	String addDepartment(Department departmentData);



	
}
