package com.nt.colletion;
@FunctionalInterface
public interface InterfaceA {
	public void m1(float c,int f);
	
	default void  sum(int a, int b) {
		System.out.println("sum is::"+ (a+b));
	}
	
	default void  m2() {
		System.out.println("sarkavari pata");
	}
	 static void m4(int f) {
		System.out.println(f);
		
		
	}

}
