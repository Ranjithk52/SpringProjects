package com.ojas.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.demo.model.Employee;
import com.ojas.demo.repositroy.EmployeeRepositeroy;

@Service
public class EmloyeeServices {

	@Autowired
	private EmployeeRepositeroy employeeRepositeroy;

	public String createEmployee(Employee employee) {

		Employee s = employeeRepositeroy.save(employee);
		if (s != null) {
			return "data inserted into data base";
		}
		return "data not inseted into data base";

	}

	public List<Employee> getAllEmployee() {
		return employeeRepositeroy.findAll();
	}

	public void deletbyId(int id) {
		employeeRepositeroy.deleteById(id);

	}

	public Optional<Employee> getById(int id) {

		return employeeRepositeroy.findById(id);

	}
	
	public String updateEmployee(Employee emp) {
		
		Employee s=employeeRepositeroy.saveAndFlush(emp);
		
		if (s != null) {
			return "data is updated into data base";
		}
		return "data not  updated into data base";
		
		
	}

}
