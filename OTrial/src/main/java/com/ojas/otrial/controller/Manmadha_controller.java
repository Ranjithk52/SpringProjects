package com.ojas.otrial.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Manmadha_controller {

	@GetMapping(value="/otrial/api/{name}")
	public HashMap<String, String> displayName(@PathVariable String name) {
		HashMap<String, String> map=new HashMap<>();
		map.put("result", name);
		return map;
		
	}
	
	
}
