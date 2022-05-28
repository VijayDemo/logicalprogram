package com.nt.nit;

public interface InterfaceC {
	public void display();
 public default void msg() {
	 System.out.println("hi default-B");
 }
}
