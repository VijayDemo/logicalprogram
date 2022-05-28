package com.nt.practice;

public class Palendrum {
	static void m1() {
	 String s="madam";
	 char ch;
	 String f="";
	 for(int i=0;i<s.length();i++) {
		 
		 ch=s.charAt(i);
		 
		 f=ch+f;
	 }
	 if(s.equals(f)) {
		 System.out.println(f+":::is a pallendrum");
	 }
	 else {
		 System.out.println("is not pallendrum");
	}
	 
	}
	static void m2() {
		 String d="abcmadam";
		 String s1=d.substring(3, 8);
		 StringBuilder sb=new StringBuilder(s1);
		 System.out.println(sb);
		 System.out.println(sb.reverse());
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		//m2();

	}

}
