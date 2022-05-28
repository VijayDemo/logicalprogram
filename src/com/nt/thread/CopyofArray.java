package com.nt.thread;

public class CopyofArray {
	static void m1() {
	int a[]= {1,5,6,5,7,8,2,7};
	int c[]=new int[a.length];
	c=a;
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
	System.out.println("------------------------");
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println("duplicate elements are::"+a[i]);
			}
				
			
		}
		
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
