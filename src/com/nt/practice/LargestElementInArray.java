package com.nt.practice;

import java.util.Arrays;

public class LargestElementInArray {
	static void m1() {
		int a[]= {10,60,20,88,100};
		Arrays.sort(a);
		for(int j=0;j<a.length;j++) {
			System.out.println("arrays sorting is::"+a[j]);
		}
		int s=a.length;
		//int j=a[s-1];
		System.out.println("big element::"+a[s-1]);
		System.out.println("copy of an array");
		int d[]=new int[a.length];
		d=a;
		for(int i=0;i<d.length;i++) {
			System.out.println("elements are ::"+d[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
