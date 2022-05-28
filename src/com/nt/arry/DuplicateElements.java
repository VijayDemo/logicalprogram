package com.nt.arry;

public class DuplicateElements {
	int d[]= {5,6,6,55,88,55,88,1};
	public  void display() {
		for(int i=0;i<d.length;i++) {
			for(int j=i+1;j<d.length;j++) {
				if(d[i]==d[j]) {
					System.out.println("duplicate elements are::"+d[j]);
				}
			}
			
		}
		System.out.println("--------------------");
		
		
	}
 void m1() {
	for(int i=d.length-1;i>=0;i--) {
		System.out.println("reverse of an array::"+d[i]);
	}
	
}
	public static void main(String[] args) {
		DuplicateElements de=new DuplicateElements();
		de.display();
		de.m1();
		
	}

}
