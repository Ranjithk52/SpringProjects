package com.ojas.otrial.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/otrial/api")
public class Ranjith_Controller {
	
	@GetMapping("/display_name_{name}")
	public Map display_name(@PathVariable String name) {
		Map<String, String> map=new HashMap<>();
		map.put("result","Hello "+name);
		return map;
	}
	@GetMapping("/encode/{number}")
	public Map encode(@PathVariable int number) {
		Map<String,String> map=new HashMap<>();
		
		
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMdd"+number+"yyyy");
			   LocalDateTime now = LocalDateTime.now();
			  
		map.put("result", dtf.format(now));
			
		
		return map;
	}
	
	@GetMapping("/decode/{number}")
	public Map encode(@PathVariable String number) {
		Map<String,String> map=new HashMap<>();
		
		  
		
		map.put("result", number.substring(4, number.length()-4));
			
			return map;
		
	}
	
	
	
}
