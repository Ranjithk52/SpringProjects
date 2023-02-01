package com.ojas.otrial.controller;


import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/linkgen")
public class Ranjith_LinkGen {
	 @GetMapping("/welcome")
	public String welCome() throws UnknownHostException {
		 JSONObject obj = new JSONObject();
		 obj.put("message", "welcomeuser");
		JSONObject data = new JSONObject();
		String ip=Inet4Address.getLocalHost().getHostAddress();
		 for (int i = 1; i <= 3; i++) {
		 data.put("m" + i, "http://"+ip+":9999/api/linkgen/welcome/" + i);
		 }
obj.put("menu", data);
		String jsonString = obj.toString();
		  return jsonString;

	}
	 @GetMapping("/welcome/{number}")
	 public Map result(@PathVariable String number) {
		 Map<String,String> maps=new HashMap<>();
		 maps.put("result", number.substring(4, number.length()-4));
		 return maps;
		 
	 }
	

}
