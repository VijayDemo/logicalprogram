package com.nt.string;

public class DupliacteElements {
	 static void m1() {
	String s="vijay vijay RR mm";
	s=s.toLowerCase();
	int count;
	char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++) {
		count =1;
		for(int j=i+1;j<s.length();j++) {
			if(ch[i]==ch[j]&& ch[i]!='0') {
				count++;
				ch[j]='0';
				}
		}
		if(ch[i]!='0'&&count>1) {
			System.out.println(ch[i]);
		}
	}
	System.out.println("--------------------");
	String s1[]=s.split(" ");
	for(int i=0;i<s1.length;i++) {
		count =1;
		for(int j=i+1;j<s1.length;j++) {
			if(s1[i].equals(s1[j])) {
				count++;
				s1[j]="0";
				
			}
		}
		if(s1[i]!="0"&&count>1) {
			System.out.println("duplicate words are::"+s1[i]);
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
