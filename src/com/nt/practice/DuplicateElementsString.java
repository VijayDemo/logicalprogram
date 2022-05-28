package com.nt.practice;

public class DuplicateElementsString {
	static void m1() {
		//duplicate elements in string
	String s="vijju rr mm";
	int count;
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		count=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]&&ch[i]!=' ') {
				count++;
				ch[j]='0';
				
			}
			
				
			}
		if(count>1&&ch[i]!='0') {
			System.out.println("duplicate elements are::"+ch[i]);
		}
	}
	String v="rocky rocky vijay vijay";
	String word[]=v.split(" ");
	for(int i=0;i<word.length;i++) {
		count=1;
		for(int j=i+1;j<word.length;j++) {
			if(word[i].equals(word[j]) ) {
				count++;
				word[j]="0";
			}
		}
		if(count>1 && word[i]!="0") {
			System.out.println("duplicate words are::"+word[i]);
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
