package com.nt.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
	static void m1() {
		Integer []a= {1,5,6,4,};
		List<Integer> l=Arrays.asList(a);
	l.add(27);
	l.add(26);
		Integer [] b=l.toArray(a);
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {
	   m1();	
	}
	}


