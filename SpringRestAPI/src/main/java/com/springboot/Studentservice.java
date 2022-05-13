package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentservice {
 @Autowired
 private StudentRepository sturepo;
  
  
 public Student addStudent(Student s)
 {
	 return sturepo.save(s);
 }
 public Student updateStudent(Student s) {
	 return sturepo.save(s);
 }
 public Student deleteStudent(Student s) {
	 return sturepo.save(s);
 }
 
 public List<Student> getStudent(){
	 return sturepo.findAll();
 }
}

	 


