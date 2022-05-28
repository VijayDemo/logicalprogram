package com.nt.pattern;
//* pattern 
public class Pattern2 {
	static void m1() {
		int m=4;
		for(int i=1;i<=4;i++) {
			for(int k=1;k<=m;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++
					) {
				System.out.print("*"+" ");
			}
			System.out.println();
			m--;
		}
	}

	public static void main(String[] args) {
		m1();
	}

}
