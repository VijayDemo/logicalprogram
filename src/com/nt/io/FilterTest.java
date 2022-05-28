package com.nt.io;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(30);
		list.add(45);
		list.add(55);
		list.add(60);
		System.out.println("before fitering  list:"+list);
		List<Integer> l2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> l4=list.stream().sorted().collect(Collectors.toList());
		long li=list.stream().filter(m->m>=30).count();
		Collections.sort(list,(m,n)->m<n?1:m>n?-1:0);
		//Collections.sort(list,(l1,l2)->l1.getId()<l2.getId()?-1:l1.getId()>l2.getId()?1:0);
		
		List<Integer> l3=list.stream().map(i->i+2).collect(Collectors.toList());
		System.out.println("count"+li);
		System.out.println("using filter::"+l2);
		System.out.println("-----------------");
		System.out.println("by using map"+l3);
		System.out.println(""+l4);
		System.out.println("natural sorting::"+list);
	}

}
