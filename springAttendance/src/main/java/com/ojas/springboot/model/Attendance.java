package com.ojas.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int atid;
	private String Date;
	private String empname;
	private String noofhours;
	private String project;
	private String description;

}
