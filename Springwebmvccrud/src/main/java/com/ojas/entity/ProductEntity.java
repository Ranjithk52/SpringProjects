package com.ojas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductEntity {
	@Id
	@Column(name = "PID")
	@GenericGenerator(name = "myGenerator",strategy = "increment")
	@GeneratedValue(generator = "myGenerator",strategy = GenerationType.AUTO )
	
	private int pid;
	private String pname;
	private int qty;
	private int price;

}
