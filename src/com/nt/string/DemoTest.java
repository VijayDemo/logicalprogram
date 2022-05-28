package com.nt.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoTest{
	void m1() {
	String s="vijay is java vijay java mm hh dd mm hh";
	char [] c=s.toCharArray();
	for(int i=0;i<c.length;i++) {
		int count=1;
		for(int j=i+1;j<c.length;j++) {
			if(c[i]==c[j]&&c[i]!=' ') {
				c[j]='0';
				count++;
			}
		}
		if(c[i]!='0'&&count>1) {
			System.out.println(c[i]);
		}
	}
	}
	public static void main(java.lang.String[] args) {
		 DemoTest t=new  DemoTest();
		 t.m1();
		// TODO Auto-generated method stub
	}
	}


