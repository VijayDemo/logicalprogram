package com.nt.pattern;
//* pattern 
public class Pattern3 {
	static void m1() {
		for(int k=1;k<=4;k++) {
			for(int m=1;m<=k;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		m1();
	}

}
