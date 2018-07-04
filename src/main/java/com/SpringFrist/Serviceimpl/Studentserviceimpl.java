package com.SpringFrist.Serviceimpl;

import java.util.List;
import java.util.Optional;

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
	@Override
	public String addStudent(Student student) {
		studentRepository.save(student);
		return "one student saved";
	}
	@Override
	public String updateStudent(Student updateStudent) {
		String msg="null";
		if(updateStudent.getsId()!=null ||updateStudent.getsId()!="") {
		studentRepository.save(updateStudent);
		msg="updated student raw "+ updateStudent;
		}
		else {
			msg="error";
		}
		return msg;
	}
	@Override
	public Optional<Student> findOne(String sId) {
		return studentRepository.findById(sId);
	
	}
	@Override
	public String delete(String sId) {
		studentRepository.deleteById(sId);
		String msg= "deleted one raw where student Id = "+sId ;
		return msg;
	}
	
}
