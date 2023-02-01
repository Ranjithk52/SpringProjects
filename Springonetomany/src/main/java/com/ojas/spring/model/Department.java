package com.ojas.spring.model;

import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {
	@GenericGenerator(name = "mygenerator",strategy = "increment")
	@GeneratedValue(generator = "mygenerator" ,strategy = GenerationType.AUTO)
	@Id
	private int did;
	private String dname;
	private String dloc;
	@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER)
	
	List<Employee> emp;

}
