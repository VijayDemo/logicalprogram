package com.nt.pattern;

public class CharecterPattern {
	static void m1() {
		char ch='A';
		int m=3;
		for(int i=1;i<=4;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=4;j++) {
				System.out.print(ch++);
					
			}
			System.out.println();
			m--;
		
		}
	}

	public static void main(String[] args) {
		
		m1();

	}

}
