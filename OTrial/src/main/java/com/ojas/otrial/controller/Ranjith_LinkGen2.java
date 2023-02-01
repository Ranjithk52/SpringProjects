package com.ojas.otrial.controller;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/linkgenv2")
public class Ranjith_LinkGen2 {
	
	
	@GetMapping("/welcome/{numbers}")
	public String welCome(@PathVariable String numbers) throws UnknownHostException {
		

	 JSONObject obj = new JSONObject();
	 obj.put("message", "Welcome User Linkgenv2 Demo");
	JSONObject data = new JSONObject();
	String ip=Inet4Address.getLocalHost().getHostAddress();
	 for (int i = 1; i <= 3; i++) {
	 data.put("e" + i, "http://"+ip+":9999/api/linkgenv2/encode/" +(Integer.parseInt(numbers)-1+i ));
	 }
	 
	 for (int i = 1; i <= 3; i++) {
		 int x=(int)( Math.random()*((numbers.length()-3)-0+1)+0);
			
	
			
			String results= x+"l"+(x+2)+"l"+numbers.substring(0, x)+(Integer.parseInt(numbers)+i )+numbers.substring(x+2, numbers.length());
		 
		 data.put("d" + i, "http://"+ip+":9999/api/linkgenv2/decode/"+results);
		 }
obj.put("menu", data);
	String jsonString = obj.toString();
	  return jsonString;
}
	 @GetMapping("/encode/{number}")
	 public Map encode(@PathVariable String number) throws UnknownHostException {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));
			
			String number2="";		
				for(int i=0;i<=10;i++) {
				number2=number2+String.valueOf(Integer.parseInt(String.valueOf(dtf.format(now).charAt(1)))*i);
			}
			System.out.println(number2);
			System.out.println(dtf.format(now).charAt(0));
		int x =(int)( Math.random()*((number2.length()-3)-0+1)+0);
		System.out.println(x+"hello");
		String results= x+"l"+(x+2)+"l"+number2.substring(0, x)+number+number2.substring(x+2, number2.length());
		Map<String,String> map=new HashMap<>();
		 map.put("result", results);
		 
		return map;
		
		
		
		 
	 }
	 @GetMapping("/decode/{number}")
	 public Map decode(@PathVariable String number) {
		 Map<String,String> map=new HashMap<>();
		 System.out.println(Character.getNumericValue(number.charAt(0)));
		 String result=number.substring(Character.getNumericValue(number.charAt(0))+4, Character.getNumericValue(number.charAt(2)+4)+1);
		 map.put("result",result);
		 return map;
		 
	 }
	 
}

