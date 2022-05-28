package com.nt.nit;

public class D 
{
	void m1() {
		String s="vijay by s/w";
		//String d=s.replaceAll("//s", "");
		System.out.println(s.toUpperCase());
		System.out.println(s.replaceAll("\\s", ""));
	}
	

	public static void main(String[] args) {
		D d=new D();
		d.m1();
		

	}


}
