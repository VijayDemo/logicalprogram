package com.nt.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapTest {
	static void m1() {
		Map<String,Integer> m=new HashMap<>();
		m.put("dd", 1);
		m.put("bb", 10);
		m.put("a", 20);
		LinkedHashMap<String,Integer> map=m.entrySet().stream().sorted((i,j)->i.getValue().compareTo(j.getValue())
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(i,j)->i,LinkedHashMap::new));
		System.out.println(map);
	}
	 
		
	
	public static void main(String[] args) {
		m1();
		
		
	}

}
