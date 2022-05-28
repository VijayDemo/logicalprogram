package com.nt.practice;

public class ReverseodString {
	static void m1() {
		String m="mm jk t tyz zi";
		char ch;
		String k=" ";
		char [] c=m.toCharArray(); 
		int count=0;
		/*for(int i=0;i<m.length();i++) {
			ch=m.charAt(i);
			k=ch+k;
			}
		System.out.println("string is::->"+k);*/
		for(int i=0;i<m.length();i++) {
			count =1;
			for(int j=i+1;j<m.length();j++) {
				if(c[i]==c[j]&&c[i]!=' ') {
					count ++;
					c[j]='0';
				}
				
				}
			if(count>1&&c[i]!='0') {
				System.out.println(c[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
