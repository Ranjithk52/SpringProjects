package com.ojas.springboot.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.springboot.model.User;
import com.ojas.springboot.userservice.UserService;

@RestController
@RequestMapping("/user1")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/user")
public String userCreate(@RequestBody User user) {
		
		return service.userCreate(user);
	}
		
		@GetMapping("/signin/{uname}/{pword}")
      public String signIn(@PathVariable("uname") String uname,@PathVariable("pword") String pword ) {
			
			String s=service.signIn(uname, pword);
			System.out.println(s);
			return s;
			
		}

}
