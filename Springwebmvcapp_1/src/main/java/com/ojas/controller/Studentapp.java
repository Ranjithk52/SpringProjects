package com.ojas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.model.Student;

@Controller
public class Studentapp {
//	@RequestMapping("/hello")
//	public String display() {
//		
//		return "welcome.jsp";
//		
//	}
	@RequestMapping("/loadform")
	public String register(Model model) {
		Student stu = new Student();
		model.addAttribute(stu);
		return "form.jsp";
	}
	
	@RequestMapping("/test")
	public String Test() {
		return "hlo ranjith";
	}

}
