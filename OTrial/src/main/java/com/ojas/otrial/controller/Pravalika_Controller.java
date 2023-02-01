//package com.ojas.otrial.controller;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/otrial/api")
//public class Pravalika_Controller {
//
//	@GetMapping("/display_name/{name}")
//	public  Map displayName(@PathVariable String name) {
//		HashMap<String, String> map=new HashMap<>();
//		map.put("Hello", name);
//		return map;	
//	}
//@GetMapping("/encode/{number}")
//	public Map encode(@PathVariable String number  ) {
//	
//	HashMap<String, String> map=new HashMap();
//		
//	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMdd"+number+"yyyy");  
//	   LocalDateTime now = LocalDateTime.now();  
//	   System.out.println(dtf.format(now));  
//	map.put("result", dtf.format(now));
//	return map;
//		
//}
//
//@GetMapping("/decode/{number}")
//public HashMap<String,String>decode(@PathVariable String number)
//{
//	HashMap<String, String> map=new HashMap<>();
//	String date=number.substring(4, number.length()-4);
//    map.put("result", date);
//    return map;
//
//}
//}
