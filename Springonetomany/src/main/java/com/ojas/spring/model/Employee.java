package com.ojas.spring.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.cglib.beans.BeanCopier.Generator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity


public class Employee {
	@GenericGenerator(name = "generator" ,strategy = "increment")
	@GeneratedValue(generator ="generator",strategy = GenerationType.AUTO )
	@Id
	private int eid;
	private String ename;
	private double esal;

}
