package com.nt.practice;

public class BabbuleShort {
	static void m1() {
		int a[]= {10,2,6,47,53,24,5,8,47};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
							}
			
		}
		System.out.println(a[1]);
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
			

		}
		
	}

	public static void main(String[] args) {
		m1();

	}

}
