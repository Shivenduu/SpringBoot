package com.example.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.Student.Beans.Student;
import com.example.Student.Exception.RecordNotFound;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Services.StudentServices;

@RestController

public class StudentController {
	@Autowired
	StudentServices studentService;
	
	@GetMapping(path="/student")
	List<Student>getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@GetMapping(path="/student/{Id}")
	private Student getStudentbyId(@PathVariable int Id) throws RecordNotFound {
		
		if(studentService.getStudentbyId(Id) == null)
			{
			throw new RecordNotFound("HI HI HI HI HI");
			}
		
		else
			return studentService.getStudentbyId(Id);
	}

}
