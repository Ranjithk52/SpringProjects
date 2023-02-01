package com.ojas.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.springboot.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
