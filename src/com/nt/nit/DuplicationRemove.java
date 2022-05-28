package com.nt.nit;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicationRemove {
	public static  void m1() {
		String s="Vijju";
		char []st=new char[s.length()];
		char c[]=s.toCharArray();
		/*
		  Set<Character> st=new LinkedHashSet<Character>(); for(int
		  i=0;i<s.length();i++) { st.add(c[i]);
		  
		  //System.out.println(st); //st.forEach(System.out::print); } 
		   
		 for(Character w:st) System.out.print(w);
		 */
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					st[i]=c[j];
				}
			}
			System.out.println(st[i]);
		}
		
	
	}

	public static void main(String[] args) {
		m1();

	}

}
