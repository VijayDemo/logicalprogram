package com.nt.pattern;
/*1
  23
  456
  78910*/

public class Test {
	 static void m1() {
		 int k=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}
		
	}
	 static void m2() {
		 int num=153;
		 int temp=num;
		 
		 int remindor=0;
		 int arm=0;
		 while(num>0) {
			 remindor=num%10;
			 arm+=Math.pow(remindor, 3);
//			 System.out.println(remindor);
			 num=num/10;
			 
		 }
		 if(temp == arm) {
		      System.out.println(arm);
		      System.out.println("No is"+num);
		 }
		 else {
			 System.out.println(num+" "+arm);
			 System.out.println("hai");
		 }
	 }

	public static void main(String[] args) {
		m2();

	}

}
