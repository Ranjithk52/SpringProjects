package com.ojas.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springboot.model.Employee;
import com.ojas.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;
	
	public String registerEmployee(Employee employee) {
		Employee emp=emprepo.save(employee);
		if(emp!=null) {
			return "Employee registered Successfully...";
		}else {
			return "Employee not registered...";
		}
		
		
	}
	
	public Employee findbyEmailandPassword(String mail,String password) {
		
		return emprepo.findByEmailAndPassword(mail, password);
		
	}
	

}
