package com.nt.colletion;

public class LamdaExpression implements InterfaceA {
	

	/*@Override
	public void m1() {
		System.out.println("hello ");
		
	}*/

	
	 public void m2() { System.out.println("takkari donga"); }
	 
	public static void main(String[] args) {
		LamdaExpression e=new LamdaExpression();
		//e.m1();
		e.m2();
		InterfaceA.m4(5);
		
		
		
	}

	@Override
	public void m1(float c, int f) {
		// TODO Auto-generated method stub
		
	}


}
