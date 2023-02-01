package com.ojas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.demo.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	

}
