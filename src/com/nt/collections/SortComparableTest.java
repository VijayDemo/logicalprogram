package com.nt.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortComparableTest {
	
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		list.add(new Student(105,"vijju",54.2f));
		list.add(new Student(104,"ravi",56.2f));
		list.add(new Student(102,"bhavanishanker",55.2f));
		list.add(new Student(103,"srinu",58.2f));
		Collections.sort(list, (i,j)->i.getId()<j.getId()?1:i.getId()>j.getId()?-1:0);
		System.out.println("from id"+list);
		Collections.sort( list,(a,b)->a.getName().compareToIgnoreCase(b.getName()));
		System.out.println(list);
	}
		
	}


