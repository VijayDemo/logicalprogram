package com.nt.nit;

import java.util.ArrayList;
import java.util.List;

public class AllCount {
	String s="NarashIT#123";
	char [] c=s.toCharArray();
	int count1=0,count2=0,count3=0;
	public  void m1() {
		List<Character> list=new ArrayList<Character>();
		List<Character> list1=new ArrayList<Character>();
		List<Character> list2=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			
			if(c[i]>=65&&c[i]<=90||c[i]>=97&&c[i]<=122) {
				list.add(c[i]);
			}
			else if(c[i]>=48&&c[i]<=57) {
				list1.add(c[i]);
			}
			else
				list2.add(c[i]);
		}
		System.out.println("characters r::"+list);
		System.out.println("character  size::"+list.size());
		System.out.println("number are::"+list1);
		System.out.println("Number size::"+list1.size());
		System.out.println("symbuls are::"+list2);
		System.out.println("sysmble size::"+list2.size());
	}

	public static void main(String[] args) {
		AllCount ac=new AllCount();
		ac.m1();

	}

}
