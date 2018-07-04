package com.SpringFrist.Service;

import java.util.List;
import java.util.Optional;

import com.SpringFrist.Model.Student;

public interface StudentService {

  List<Student> findAll();
  String addStudent(Student student);
  String updateStudent(Student updateStudent);
  Optional<Student> findOne(String sId);
  String delete(String sId);
	

}
