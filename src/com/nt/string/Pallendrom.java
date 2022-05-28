package com.nt.string;

import java.util.ArrayList;
import java.util.List;

public class Pallendrom {
	static void m1() {
  String s="abcmadam";
  String r=s.substring(3, 7);
  
  System.out.println(r);
  System.out.println("----------------");
  char []c=s.toCharArray();
  
  String f="";
  char ch;
   for(int i=0;i<s.length();i++) {
	   ch=s.charAt(i);
	   f=ch+f;
			}
   System.out.println("word is::"+f);
   if(s.equals(f)) {
       System.out.println("geiven string pallordrem::"+f);
   
   }
   else 
	   System.out.println("given string not palldroum");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
