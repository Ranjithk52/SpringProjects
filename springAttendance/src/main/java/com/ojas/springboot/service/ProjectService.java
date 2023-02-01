package com.ojas.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springboot.model.Project;
import com.ojas.springboot.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectrepo;
	
	public String addProject(Project project) {
		Project prj=projectrepo.save(project);
		if(prj!=null) {
			return "Project added Successfully...";
			
		}else {
			return "Project not added..try again..";
		}
		
		
	}
	
	public List<Project> getAllProjects(){
		return projectrepo.findAll();
		
		
	}

}
