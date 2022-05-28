package com.nt.nit;

public class EualofString {
	 public static void m1() {
		String s1="Vijay";
		String s2="Vijay";
		
		System.out.println(s1.indexOf("a"));
		
		if(s1==s2) {
			System.out.println("both are eual");
		}
		else {
			System.out.println("both r not eual");
		}
		System.out.println("----");
	System.out.println(s1.equals(s2));
	
	}

	public static void main(String[] args) {
		m1();

	}

}
