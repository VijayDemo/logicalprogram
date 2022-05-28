package com.nt.stream;

public class MethodReference2 {
	public void m2(float i) {
		System.out.println("the value is method::"+i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReference2 m=new MethodReference2();
		Interfacef f=m::m2;
		f.m1(10);
		
		Interfacef g=i->{
			System.out.println("the of i in Interface is::"+i);
			
		};
		g.m1(6);

	}

}
