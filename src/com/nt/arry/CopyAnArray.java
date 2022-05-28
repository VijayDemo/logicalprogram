package com.nt.arry;

public class CopyAnArray {
	void m1() {
	int a[]= {1,3,6};
	int c[]=new int[a.length];
	//c is refer to a same locaion
	c=a;
	c[0]++;
	m2();
	System.out.println("a content is");
	for(int i=0;i<a.length;i++) 
		System.out.println(a[i]);
	
	
	System.out.println("c content is");
	for(int j=0;j<a.length;j++) 
		System.out.println(c[j]);
	}
	static void m2() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {
		CopyAnArray ac=new CopyAnArray();
		ac.m1();
	}

}
