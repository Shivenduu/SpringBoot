package com.example.Student.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Student.Beans.Student;

@Service

public class StudentServices {

	List<Student> students = new ArrayList<>();
	
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		students.add(new Student(101,"Shivendra","9936562646","Ayodhya"));
		students.add(new Student(102,"Rajesh","9947592904","Faizabad"));
		students.add(new Student(103,"Shivam","945376293","rampur"));
		return students;
	}

	public Student getStudentbyId(int Id) {
		// TODO Auto-generated method stub
		
		return students.stream().filter( o->o.getId() == (Id) ).findFirst().orElse(null);
	}

}
