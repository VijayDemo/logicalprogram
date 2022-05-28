package com.nt.arry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertElementInArray {
	static void m1() {
	Integer a[]= {1,5,6,9,6};
	List<Integer> li=new ArrayList<Integer>(Arrays.asList(a));
	li.add(1, 11);
	Collections.swap(li, 2, 3);
	System.out.println("after swaping::"+li);
	Object [] ob=li.toArray();
	for(Object b:ob) {
	 System.out.println(b);
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
