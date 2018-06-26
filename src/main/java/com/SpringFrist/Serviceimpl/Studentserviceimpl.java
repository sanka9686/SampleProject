package com.SpringFrist.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringFrist.Model.Student;
import com.SpringFrist.Repository.StudentRepository;
import com.SpringFrist.Service.StudentService;

@Service
public class Studentserviceimpl implements StudentService {
    
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll(){
		List<Student> student=studentRepository.findAll();
	    return student;
	}
}
