package com.nt.arry;

import java.util.Arrays;

public class Test {
	static void m1() {
		int a[]= {1,2,3,4,5};
		int n=3;
		for(int k=0;k<3;k++) {
			int j=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		    a[0]=j;
	}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		m1();
		
	}

}
