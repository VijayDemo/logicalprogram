package com.nt.string;

public class IndexOfString {
	static void m1() {
		String m="words java";
		System.out.println("IndexOfString.m1()"+m.indexOf("r"));
		System.out.println("sub string"+m.substring(1));
		char ch[]=m.toCharArray();
		System.out.println(ch);
		System.out.println("------------------------");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print("chars are::"+i+"eters are+"+ch[i]);
		}
		
	}
	static void m2() {
		String h="raghu";
		System.out.println("concat of string"+h.concat("java by"));
		System.out.println(h.hashCode()+" "+h.concat("hi").hashCode());
		String j=" ";
		char ch;				
		for(int i=0;i<h.length();i++) {
			ch=h.charAt(i);
			j=ch+j;
			System.out.println("revers of  string::"+j);
		}
		
		System.out.println("the lter is::"+h.charAt(4));
		
		
	}

	public static void main(String[] args) {
		m1();
		m2();
		

	}

}
