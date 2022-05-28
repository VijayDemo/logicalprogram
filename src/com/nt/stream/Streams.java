package com.nt.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
	void m() {
		ArrayList<Integer> st=new ArrayList<>();
		st.add(5);
		st.add(0);
		st.add(6);
		System.out.println(st);
		System.out.println("----------");
		List<Integer> li=st.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(li);
		
	}
	static void m1() {
		HashSet<String> hs=new HashSet<>();
		hs.add("vijay");
		hs.add("ram");
		hs.add("vijju");
		System.out.println(hs);
		Set<String> s=hs.stream().filter(e->e.startsWith("v")).collect(Collectors.toSet());
		Set<String> s1=hs.stream().sorted().collect(Collectors.toSet());
		 hs.stream().sorted().forEach(System.out::println);
		 System.out.println("-----------------");
		System.out.println(s);
		System.out.println(s1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Streams s=new Streams();
		s.m();
		m1();

	}

}
