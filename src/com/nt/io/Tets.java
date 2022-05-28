package com.nt.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Tets {
	static void m1() {
		List<Emplyoee> list=new ArrayList<Emplyoee>();
		list.add(new Emplyoee("VIJAY",25,250000));
		list.add(new Emplyoee("vijju", 26,2500));
		list.add(new Emplyoee("ram",27,25000));
		System.out.println(list);

		Collections.sort(list,(l1,l2)->l1.getNo()<l2.getNo()?-1:l1.getNo()>l2.getNo()?1:0);
		System.out.println(" sorted order is::"+list);
		long k=list.stream().count();
		//map
		System.out.println("------------------------------");
		List<Emplyoee> lt=list.stream().map(i->{
			if(i.getNo()>24) {
				i.setSal(i.getSal() * 1.25);
			}
			return i;
		}).collect(Collectors.toList());
		System.out.println(lt);
		System.out.println("----------------------");

//System.out.println("hight sal is::"+sal);
System.out.println("----------------------");
		List<Emplyoee> list1=list.stream().filter(i->i.getName().equalsIgnoreCase("vijay")).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(k);

	}

	public static void main(String[] args) {

		m1();



	}

}
