package com.nt.arry;

import java.util.Arrays;

public class LargestElement {
	public static void m1() {
	int j[]= {55,26,89,100,45,8,9};
	int g=j.length;
	Arrays.sort(j);
	System.out.println("sorrted array is::"+Arrays.toString(j));
	int k=j[g-1];
	int f=j[g-6];
	System.out.println("hight value is::"+k+" "+"low value is::"+f);
	}
	public static void main(String[] args) {
		m1();

	}

}
