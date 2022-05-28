package com.nt.practice;

public class DuplicateElement {
	static void m1() {
		char arr[]= {'e','k','j','k','l','e','r','y','r'};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		System.out.println("-----------------------");
		int a[]= {10,5,6,8};
		int b[]=new int [a.length];
		b=a;
		for(int i=0;i<a.length;i++) {
			System.out.println("elements in a::"+a[i]);
		}
		for(int j=0;j<b.length;j++) {
			System.out.println("elements in b::"+b[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         m1();
	}

}
