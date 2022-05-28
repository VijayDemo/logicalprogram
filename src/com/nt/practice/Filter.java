package com.nt.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	void m1() {
		List<Student> list=new ArrayList<>();
		list.add(new Student("vijay",26,"hyd",86.52f));
		list.add(new Student("Rocky",27,"hyd",85.52f));
		list.add(new Student("sippy",24,"kkd",87.52f));
		List<Student> li= list.stream().filter(i->i.getName().startsWith("Ro")).collect(Collectors.toList());
		System.out.println("from filter::"+li);
		
		
		
	}
	void m2() {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(90);
		list.add(80);
		list.add(10);
		list.add(75);
		List<Integer> list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("from filter::"+list1);
		System.out.println("---------------------");
		List<Integer> list2=list.stream().map(i->i+2).collect(Collectors.toList());
		System.out.println("from map:::"+list2);
		System.out.println("---------------------");
		Collections.sort(list,(l1,l2)->l1<l2?-1:l1>l2?1:0);
		System.out.println("Aecending oredr::"+list);
		Collections.sort(list,(l1,l2)->l1>l2?-1:l1<l2?1:0);
		System.out.println("Decending oredr::"+list);
		long list3=list.stream().count();
		System.out.println("count is:"+list3);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filter f=new Filter();
		f.m1();
		f.m2();

	}

}
