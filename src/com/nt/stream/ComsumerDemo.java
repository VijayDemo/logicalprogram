package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ComsumerDemo {
	void m1() {
	String s="vijay my dog is gone dog my";
	List<String> word=Arrays.asList(s.toLowerCase().split(" "));
	Map<String, Long> map=word.stream().collect(Collectors.groupingBy(words->words,Collectors.counting()));
	System.out.println(map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComsumerDemo d=new ComsumerDemo();
		d.m1();
	

	}

}
