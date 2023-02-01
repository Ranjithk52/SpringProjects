package com.ojas.demo.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.demo.model.Employee;

@Repository
public interface EmployeeRepositeroy extends JpaRepository<Employee,Integer> {
	
	

}
