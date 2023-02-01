package com.ojas.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.demo.model.Student;
import com.ojas.demo.repository.StudentRepository;

@RestController

public class StudentController {

	@Autowired
	private StudentRepository repository;
	
	@RequestMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		
		
		return repository.save(student);
	}
	@RequestMapping("/getall")
	public List<Student> getAll(){
		return repository.findAll();
	}
}
