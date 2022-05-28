package com.nt.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortComparatorTest {
	
	public static void main(String[] args) {
		List<Student1> list=new ArrayList<Student1>();
		list.add(new Student1(102,"bhavanishanker",55.2f));
		list.add(new Student1(105,"vijju",54.2f));
		list.add(new Student1(104,"ravi",56.2f));
		list.add(new Student1(103,"srinu",58.2f));
		//Collections.sort(list,new Student1());	
		Collections.sort(list,(l1,l2)->l1.getAvg()==l2.getAvg()?0:l1.getAvg()<l2.getAvg()?1:-1);
		//list.forEach(System.out::println);
		for( Student1 sd:list) {
			System.out.println("id are::"+sd.getId());
		}
		
		
		List<Student1> s=list.stream().map(i->{
			if(i.getAvg()>=50.2f) {
				i.setAvg(i.getAvg()*1.15);
			}
			return i;
		}).collect(Collectors.toList());
		System.out.println("value are::"+s);
		Collections.sort(list,(i,j)->i.getName().compareToIgnoreCase(j.getName()));
		System.out.println(list);
		
	}

}
