package com.nt.nit;

public class Test {
	String s="java by Natraj";
	char c[]=s.toCharArray();
	
	void m1() {
		String s2="";
		char ch;
		//System.out.println(s2);
		
		for(int i=0;i<=s.length()-1;i++) {
			ch=s.charAt(i);
			
			s2=ch+s2;
		}
		System.out.println("reverse of a string is::"+s2);
	}
	void m2() {
		System.out.println("word by word");
		for(String st:s.split(" ")) {
			
			System.out.println(st);
		}
		for(int i=0;i<s.length();i++) {
		if(c[i]=='a'&&c[i]=='e'&&c[i]=='i'&&c[i]=='o'&&c[i]=='u')
			System.out.println("vowles r there");
		
		else {
			System.out.println("vowles r  not there");
		}
	}
	}


	public static void main(String[] args) {
		Test t1=new Test();
		t1.m1();
		t1.m2();

	}

}
