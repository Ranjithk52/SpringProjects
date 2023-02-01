package com.ojas.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.springboot.model.Attendance;
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

}
