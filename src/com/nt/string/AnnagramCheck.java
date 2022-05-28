package com.nt.string;

import java.util.Arrays;

public class AnnagramCheck {
	static void m1() {
	String s="ajay";
	String s1="ayja";
	
	char[] c=s.toCharArray();
	char[] r=s1.toCharArray();
	Arrays.sort(c);
	Arrays.sort(r);
	System.out.println("char arry is::"+c.toString());
	System.out.println("char arry is::"+r.toString());
	
	
	//boolean result=Arrays.equals(c, r);
	if(Arrays.equals(c, r)) {
		System.out.println("given string annagram");
	}
	else
		System.out.println("given string not an annagram");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
