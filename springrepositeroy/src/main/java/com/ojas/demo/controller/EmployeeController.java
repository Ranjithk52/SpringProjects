package com.ojas.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.demo.model.Employee;
import com.ojas.demo.services.EmloyeeServices;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmloyeeServices emloyeeServices;
	
	@PostMapping("/create")
	public String createEmployee(@RequestBody Employee employee) {
    
		return emloyeeServices.createEmployee(employee);
		

	}
     
	@GetMapping("/all")
	public List<Employee> getAllEmployee() {
		return emloyeeServices.getAllEmployee();
	}
	@DeleteMapping("/delete/{id}")
	public void deletbyId(@PathVariable("id") int id) {
		System.out.println(id);
		emloyeeServices.deletbyId(id);;

	}
     
	@GetMapping("/get/{id}")
	public Optional<Employee> getById(@PathVariable ("id") int id) {
          
		System.out.println(id);
		return emloyeeServices.getById(id);

	}
	
	@PutMapping("/update")
	public String updateEmployee(@RequestBody Employee emp) {
		
		return emloyeeServices.updateEmployee(emp);
		
		
	}

}
