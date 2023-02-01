package com.ojas.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.springboot.model.Attendance;
import com.ojas.springboot.model.Employee;
import com.ojas.springboot.model.Project;
import com.ojas.springboot.service.AttendanceService;
import com.ojas.springboot.service.EmployeeService;
import com.ojas.springboot.service.ProjectService;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empservice;
	@Autowired
	private AttendanceService attendservice;
	@Autowired
	private ProjectService prjservice;
	
	@PostMapping("/register")
	public String registerEmployee(@RequestBody Employee employee) {
		return empservice.registerEmployee(employee);
	}
	
	@GetMapping("/login/{email}/{password}")
	public String findbyEmailandPassword(@PathVariable String email,@PathVariable String password) {
		
		Employee emp=empservice.findbyEmailandPassword(email, password);
		if(emp!=null) {
			return "Login Successfully...";
		}
		else {
			return "Wrong Credentials..try again..";
		}
		
	}
	
	@PostMapping("/addproject")
	public String addproject(@RequestBody Project project) {
		
		return prjservice.addProject(project);
	}
	
	@GetMapping("/allprojects")
	public List<Project> getallProjects() {
		return prjservice.getAllProjects();
		
	}
	@PostMapping("/addAttendance")
	public String addAttendance(@RequestBody Attendance attendance) {
		return attendservice.addAttendance(attendance);
		
	}
	@PostMapping("/allAttendance")
	public String addAllAttendnance(@RequestBody List<Attendance> lattendance) {
		return attendservice.addAllAttendance(lattendance);
		
	}
}
