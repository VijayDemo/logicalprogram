package com.nt.stream;
//static method
public class MethodReference  {
	
	public void  m2(float f) {
		System.out.println("floatvalue is::"+f);
		
	}
	
	
		 
	
	

	public static void main(String[] args) {
		 
		MethodReference  m=new MethodReference ();
		Interfacef d=m::m2;
		m.m2(5.6f);
		d.m1(2.5f);
		Interfacef .m5();

	}

}
