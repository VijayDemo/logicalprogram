package com.nt.arry;

import java.util.Arrays;
import java.util.List;

public class CircularArray {
	
	static void m1() {
		int a[]= {1,5,6,9,4};
		
		int n=2;
		for(int k=0;k<n;k++) {
			int s=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=s;
		
	}
		System.out.println(Arrays.toString(a));
	}
	static void m2() {
		List<Integer> li=Arrays.asList(2,5,6,8);
		li.add(2, 10);
		
		Object[] f=li.toArray();
		System.out.println(Arrays.toString(f));
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		//m2();

	}

}
