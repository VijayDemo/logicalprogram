package com.nt.pattern;

public class ClassA {
	static void m1() {
		int r=10;
		for(int i=4;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(r--+" ");
				
			}
			System.out.println();
		}
		int m=4;
		int n=1;
		System.out.println("--------------");
		for(int i=1;i<=4;i++) {
			
			for(int j=m;j>=1;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				
				System.out.print(n+++" ");
				
			}
			System.out.println();
			m--;
			
		}
	}

	public static void main(String[] args) {
		
		m1();

	}

}
