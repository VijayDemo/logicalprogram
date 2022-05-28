package com.nt.practice;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	///String s="aa";
	//String s1="nn";
	void m1() {
		Map<String,Integer> m=new TreeMap<>();
		m.put("ff", 1);
		m.put("gg", 2);
		m.put("kg", 3);
	System.out.println("map values::"+m);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MapTest mt=new MapTest();
mt.m1();
	}

}
