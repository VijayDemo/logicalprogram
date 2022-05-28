package com.nt.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SubSetofString {
	static void m1() {
		String s="vijay kkk ff gg";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count =1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!=' ') {
					count++;
					ch[j]='0';
				}
				
			}
			if(ch[i]!='0'&&count>1) {
				System.out.println("duplicate elements:::"+ch[i]+"::count is"+count);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
