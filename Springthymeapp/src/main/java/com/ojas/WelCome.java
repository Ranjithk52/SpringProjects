package com.ojas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelCome {
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "welcome";
		
	}

}
