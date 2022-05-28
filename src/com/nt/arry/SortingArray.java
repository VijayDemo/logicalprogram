package com.nt.arry;

import java.util.Arrays;

public class SortingArray {
	public static void m1() {
		int c[]= {2,3,6,1,8,5,6};
		
		Arrays.sort(c);
		System.out.println("elements are sorting in decending order");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		int temp;
		int k=c.length;
		int i=c[k-1];
		int d=c[k-7];
		System.out.println("max value::"+i+" "+"min value::"+d);
		System.out.println("-----------");
		for(int m=0;m<c.length;m++) {
			for(int n=1;n<c.length-1-m;n++) {
				if(c[n]>c[n+1]) {
					temp=c[n];
					c[n]=c[n+1];
					c[n+1]=temp;
				}
			}
			
		}
		for(int m=0;i<c.length;i++) {
			System.out.println(c[i]);
			
		}
		
	}

	public static void main(String[] args) {
		m1();

	}

}
