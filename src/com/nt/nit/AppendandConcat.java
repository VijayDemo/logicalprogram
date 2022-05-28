package com.nt.nit;

public class AppendandConcat {
	void m1() {
	String s="java is awsome";
	String s1=s.concat(" by Nataraz&HK");
	System.out.println(s1);
	StringBuffer sbf=new StringBuffer("hello word");
	System.out.println("before append::"+sbf);
	sbf.append("  this is vijay");
	System.out.println("after String append::"+sbf);
	
	}
	public static void main(String[] args) {
		AppendandConcat ac=new AppendandConcat();
		ac.m1();
		
	}

}
