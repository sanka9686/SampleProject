package com.SpringFrist.Serviceimpl;

import java.util.List;
import java.util.Optional;

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
		return "one department saved";
	}

	@Override
	public String updateDepartment(Department updateDepartment) {
		String msg="null";
		if(updateDepartment.getdId()!=0) {
			departmentRepository.save(updateDepartment);
			msg="updated department raw "+updateDepartment;
		}
		else {
			msg="error";
		}
			return msg;
	}

	@Override
	public Optional<Department> findOne(int dId) {
		return departmentRepository.findById(dId);
	}

	@Override
	public String delete(int dId) {
		departmentRepository.deleteById(dId);
		String msg="deleted onr raw where department Id = "+dId;
		return msg;
	}
	
	
}