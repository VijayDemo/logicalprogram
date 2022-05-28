package com.nt.io;


import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.sun.jdi.connect.spi.TransportService.ListenKey;

public class TestDemo {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<>();
		m.put("abc", 7);
		m.put("abd", 5);
		m.put("ac", 8);
		m.put("a", 6);
		LinkedHashMap<String,Integer>map=m.entrySet().stream().sorted((e1,e2)->
		e1.getValue().compareTo(e2.getValue())
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		System.out.println(map);
	}
	
}
	 
	


