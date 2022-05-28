package com.nt.colletion;

public class ClassA {
	static void m1() {
		String s="vijay vay dd cc";
		char []c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
