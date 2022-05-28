package com.nt.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	void dispaly() {
	Set<String> st=new HashSet<String>();
	 st.add("vijay");
	 st.add("ravi");
	 st.add("ay");
	 System.out.println("value in set::"+ st);
	 System.out.println("-------------");
	 Iterator i=st.iterator();
	 while(i.hasNext()) {
		 String d=(String) i.next();
		 System.out.println(d);
	 }
	 TreeSet<String> f=new TreeSet<>(st);
	 for(Object o:f) {
		 System.out.println(o);
	 }
	}
	
	public static void main(String[] args) {
		SetTest st=new SetTest();
		st.dispaly();

	}

}
