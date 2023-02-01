package com.ojas.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ojas.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value = "select emp from Employee emp where  emp.empEmail =?1 and emp.empConfirmPassword=?2")
	Employee findByEmailAndPassword(String empEmail ,String empConfirmPassword);

}
