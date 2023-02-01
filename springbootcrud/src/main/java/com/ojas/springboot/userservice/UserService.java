package com.ojas.springboot.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.springboot.model.User;

import com.ojas.springboot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository rep;
	
	public String userCreate(User user) {
		
		User u=rep.save(user);
		if(u!=null) {
			return "User Created Successfully......";
		}else {
			return "User Not Created.....";
		}
		
	}
	 public String signIn(String uname,String pword) {
		User u=rep.findUserByUnameAndPassword(uname, pword);
		if(u!=null) {
			return "Successfully Signed In.....";
		}else {
			return "Wrong Credentials....";
		}
	 }

}
