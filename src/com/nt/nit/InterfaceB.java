package com.nt.nit;

public interface InterfaceB {
	public void display();
 public default void dm() {
	 System.out.println("hi default-B");
 }
}
