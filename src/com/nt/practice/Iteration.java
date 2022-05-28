package com.nt.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Iteration {
	static void m1() {
		Map<String,Integer> map=new HashMap<>();
		
		
		 map.put("vijay", 8);
		 map.put("y", 1);
		 
		 TreeMap<String,Integer> t=new TreeMap<>(map);
		//Iterator<> it=t.entrySet().iterator();
		for(Map.Entry<String,Integer> d:t.entrySet()) {
			System.out.println(d.getKey()+" "+d.getValue());
		}
		
		 
	}

	public static void main(String[] args) {
		m1();

	}

}
