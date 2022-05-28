package com.nt.nit;

import java.util.Arrays;

public class SwapFirstLast {
	public static void m1() {
		String d="java by raghu";
		String []s=d.split(" ");
		for(String t:s)
		System.out.println(t);
		System.out.println("---------");
		char[]k=d.toCharArray();
		Arrays.sort(k);
		System.out.println(k);
		
		char c=d.charAt(0);
		char c1=d.charAt(d.length()-1);
		System.out.println(c1);
		System.out.println("------");
		for(int i=0;i<d.length()-1;i++) {
			System.out.print(d.charAt(i));
		}
		
		}
		
		
	

	public static void main(String[] args) {
		m1();

	}

}
