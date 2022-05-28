package com.nt.arry;

public class Bubblesort {
	
	 void m1() {
		 String s="abcmadam ggg jjk llk";
		 String d="";
		 for(int i=s.length();i>0;i--) {
			 d=d+s.charAt(i-1);
		 }
		// System.out.println(d);
		 String []f=d.split(" ", 4);
		 for(String h:f) {
			 System.out.println(h);
		 }
				}

	public static void main(String[] args) {
		Bubblesort b=new Bubblesort();
        b.m1();
	}

}
