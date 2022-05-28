package com.nt.pattern;

public class Demo {
	static void m1() {
		int m=1;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(m+" ");
				m++;
			}
			System.out.println();
			
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
