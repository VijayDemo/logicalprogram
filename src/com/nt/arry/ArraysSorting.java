package com.nt.arry;

import java.util.Arrays;

public class ArraysSorting {
	
	public static void m1() {
		int [] a= {10,25,66,98,14,56,85,75};
		
		/*Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}*/
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
			System.out.println("sorting order is::"+a[i]);
			
		}
		
		
	}

	public static void main(String[] args) {
		m1();
		
	

}

}