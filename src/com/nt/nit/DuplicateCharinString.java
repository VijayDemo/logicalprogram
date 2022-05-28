package com.nt.nit;

public class DuplicateCharinString {
	String f="vijju vijay";
	char []sc=new char[f.length()];
	char[] c=f.toCharArray();
	public  void display() {
	System.out.println(sc);
	System.out.println("----------");
	for(int i=0;i<f.length();i++) {
		for(int j=i+1;j<f.length();j++) {
			if(c[i]==c[j]) {
				sc[i]=c[j];
			}
		}
	}
	System.out.println(sc);
	}
	public static void main(String[] args) {
		DuplicateCharinString dc=new DuplicateCharinString();
		dc.display();
		

	}
	}

