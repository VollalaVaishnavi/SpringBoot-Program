package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {
@Autowired	

private Studentservice obj;
@GetMapping("/home")
public String home() {
	return "Welcome to RestAPI Spring Application";
}
@GetMapping("/display") 
public List<Student> getStudent(){
	return this.obj.getStudent();
}
@PostMapping("/insertstudent")
public Student addStudent(@RequestBody Student s)  
{  
    return  this.obj.addStudent(s);
}  
@PutMapping("/update")
public Student updateStudent(@RequestBody Student s)  
{  
    return  this.obj.updateStudent(s);
} 
@DeleteMapping("/delete")
public Student deleteStudent(@PathVariable Student s) {
	 return  this.obj.deleteStudent(s);
}
}
