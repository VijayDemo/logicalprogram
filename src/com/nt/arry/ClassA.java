package com.nt.arry;

import java.util.Arrays;

public class ClassA {
	
	void m1() {
		String s="java";
		System.out.println("before concat:::"+s);
		System.out.println("after concat::"+s.concat("awsum"));
		System.out.println(s);
	}
static void m2() {
	int a[]= {10,25,65,84,15,6};
	Arrays.sort(a);
	int j=a.length;
	for(int i=0;i<a.length;i++) {
		System.out.println("hight no is::"+a[i]);
	}
	
}
	public static void main(String[] args) {
		ClassA a=new ClassA();
		a.m1();
		m2();
	}

}
