package com.nt.io;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
	static void m1()
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("ad", 4);
		map.put("sa", 2);
		map.put("ab", 3);
		map.put("hh", 1);
		LinkedHashMap<String, Integer> m=map.entrySet().stream().sorted((i,j)->
		i.getValue().compareTo(j.getValue())
		).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(i,j)->i,LinkedHashMap::new));
						System.out.println("sorted hashmap is::"+m);
				System.out.println("--------------------");
				for(Map.Entry<String,Integer> d:map.entrySet()) {
					System.out.println("hashmap::"+d.getKey()+" "+d.getValue());
					
				}
	}
				
				/*Map<String, Integer> sorted = map
		        .entrySet()
		        .stream()
		        .sorted(comparingByValue())
		        .collect(
		            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
		                LinkedHashMap::new));*/
	
	public static void main(String[] args) {
		m1();
		
	}
}
