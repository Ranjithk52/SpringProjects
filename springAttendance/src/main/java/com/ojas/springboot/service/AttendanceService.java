package com.ojas.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springboot.model.Attendance;
import com.ojas.springboot.repository.AttendanceRepository;

@Service
public class AttendanceService {
	
	@Autowired
	private AttendanceRepository attendrepo;
	
	
	public String addAttendance(Attendance attend) {
		
		Attendance att=attendrepo.save(attend);
		if(att!=null) {
			return "Attendance data saved...";
		}else {
			return "Attendance data not saved..";
		}
		
	}
	
	
	public String addAllAttendance(List<Attendance> attnd) {
		
		List<Attendance> att=attendrepo.saveAll(attnd);
		if(att.size()>0) {
			return "All Attendance data saved...";
		}else {
			return "No Attendance data saved...";
		}
		
	}

}
