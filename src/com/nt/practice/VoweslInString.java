package com.nt.practice;

public class VoweslInString {
	static void m1() {
		String s="Adcvowqrs124";
		//char[] c=s.toCharArray();
		int count=0;
		int count1=0;
		 s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			//c=Character.toLowerCase(c);
			if(s.charAt(i) == 'a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
				System.out.println(s.charAt(i)+" count si"+count);
				
			}
			if(s.charAt(i)>=48&&s.charAt(i)<=57) {
				count1++;
				System.out.println(s.charAt(i)+" ");
				
			}
		}
		System.out.println("total No count is::"+count1);
		String h="viiju mm tt";
		char ch[]=h.toCharArray();
		for(int i=0;i<ch.length;i++) {
			count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!=' ') {
					count++;
					ch[j]='0';
					
				}
				
			}
			if(count>1&&ch[i]>'0') {
				System.out.println(ch[i]);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		m1();
	}

}
