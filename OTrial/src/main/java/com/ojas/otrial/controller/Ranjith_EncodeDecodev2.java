package com.ojas.otrial.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class Ranjith_EncodeDecodev2 {
	@GetMapping("/encode/{name}/{number}")
	public Map dictionaryexample(@PathVariable String name,@PathVariable int number) {
	Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
    dictionary.put('a', 20);
    dictionary.put('b', 21);
    dictionary.put('c', 22);
    dictionary.put('d', 23);
    dictionary.put('e', 24);
    dictionary.put('f', 25);
    dictionary.put('g', 26);
    dictionary.put('h', 27);
    dictionary.put('i', 28);
    dictionary.put('j', 29);
    dictionary.put('k', 30);
    dictionary.put('l', 31);
    dictionary.put('m', 32);
    dictionary.put('n', 33);
    dictionary.put('o', 34);
    dictionary.put('p', 35);
    dictionary.put('q', 36);
    dictionary.put('r', 37);
    dictionary.put('s', 38);
    dictionary.put('t', 39);
    dictionary.put('u', 40);
    dictionary.put('v', 41);
    dictionary.put('w', 42);
    dictionary.put('x', 43);
    dictionary.put('y', 44);
    dictionary.put('z', 45);
    dictionary.put('A', 46);
    dictionary.put('B', 47);
    dictionary.put('C', 48);
    dictionary.put('D', 49);
    dictionary.put('E', 50);
    dictionary.put('F', 51);
    dictionary.put('G', 52);
    dictionary.put('H', 53);
    dictionary.put('I', 54);
    dictionary.put('J', 55);
    dictionary.put('K', 56);
    dictionary.put('L', 57);
    dictionary.put('M', 58);
    dictionary.put('N', 59);
    dictionary.put('O', 60);
    dictionary.put('P', 61);
    dictionary.put('Q', 62);
    dictionary.put('R', 63);
    dictionary.put('S', 64);
    dictionary.put('T', 65);
    dictionary.put('U', 66);
    dictionary.put('V', 67);
    dictionary.put('W', 68);
    dictionary.put('X', 69);
    dictionary.put('Y', 70);
    dictionary.put('Z', 71);
    Map <String,String> map=new HashMap<>();
    String firsthalf="";
    char[] ch=name.toCharArray();  
    for(int i=0;i<ch.length/2;i++){  
    System.out.print(ch[i]); 
    Object value=dictionary.get(ch[i]);
    	String num=value.toString();
    	firsthalf=firsthalf+num;
    System.out.println(firsthalf);
    }
    System.out.println(firsthalf);
    String secondhalf="";
    char[] ch2=name.toCharArray();  
    for(int i=ch2.length/2;i<ch2.length;i++){  
    System.out.print(ch2[i]); 
    Object value=dictionary.get(ch2[i]);
    	String num=value.toString();
    	secondhalf=secondhalf+num;
    System.out.println(secondhalf);
    }
    System.out.println(secondhalf);
    
    map.put("result",firsthalf+number+secondhalf);
	return map;
    
    
	}
	
@GetMapping("decode/{number}")

    public Map decode(@PathVariable String number) {
	
	
    Map <String,String> map=new HashMap<>();
 
    
    map.put("result", number.substring(number.length()/2-1, number.length()/2+2));
    
    return map;
    
    
	
}
}
