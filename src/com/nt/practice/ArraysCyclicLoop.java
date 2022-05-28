package com.nt.practice;

import java.util.Arrays;

public class ArraysCyclicLoop {
	static void m1() {
	int a[]= {1,2,3,4,5,6};
	int x= a[a.length-1];
	for(int i=a.length-1;i>0;i--) {
		a[i]=a[i-1];
		a[0]=x;
		System.out.println("arrya is::"+Arrays.toString(a));

		
	}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
