package com.nt.practice;

public class ArmsStrongNo {
 static void m1() {	
	int no=153;
	int reminder=0;
	int arm=0;
	int temp=no;
while(no>0) {	
	reminder=no%10;
	arm+=Math.pow(reminder,3);
	no=no/10;
}
	if(temp==arm) {
		System.out.println("given no is arm");
		System.out.println(arm);
	}
	else
	{
		System.out.println("given no is not arm");
	}
}
	public static void main(String[] args) {
		m1();
		// TODO Auto-generated method stub

	}

}
