package com.nt.thread;

public class Test {
	public static void m1(int a, int b) {
		System.out.println("values are::"+ a+" "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		InterfaceA e= (Test::m1);
		e.m1(10, 5);

	}

}
