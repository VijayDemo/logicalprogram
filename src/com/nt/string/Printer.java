package com.nt.string;

public class Printer {
	//static variable refernce
	private static Printer Instance;
	//prvide private consructor
	private Printer(){
		
	}
	//static method
	public static Printer getInstance() {
		if(Instance==null) {
			Instance=new Printer();
		}
		return Instance;
		
	}
	public static void main(String[] args) {
		Printer p=Printer.getInstance();
		Printer p1=Printer.getInstance();
		System.out.println(p.hashCode()+" "+p1.hashCode());
	}
}
