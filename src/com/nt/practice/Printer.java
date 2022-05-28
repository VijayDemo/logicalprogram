package com.nt.practice;



public class Printer {
	private static Printer INSTANCE;
	private Printer() {

	}
	public static Printer getinstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
			
		}
		return INSTANCE;
		
	}
	public static void main(String[] args) {
		Printer p=Printer.getinstance();
		Printer p1=Printer.getinstance();
		System.out.println(p.hashCode()+" "+p1.hashCode());
		
	}

}
