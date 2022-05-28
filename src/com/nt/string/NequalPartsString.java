package com.nt.string;

public class NequalPartsString {
	static void splitString(String str1, int n) {
		  int f = str1.length();
		  int part_size;
		  if (f % n != 0) {
		   System.out.println("The size of the given string is not divisible by " + n);
		 //  return;
		  } else {
		   System.out.println("The given string is: " + str1);
		   System.out.println("The string divided into " + n + " parts and they are: ");
		   part_size = f / n;
		   for (int i = 0; i < f; i++) {
		    if (i % part_size == 0) 
		    	System.out.println();
		    
		    System.out.print(str1.charAt(i));
		   }
		  }
		 }
		 public static void main(String[] args) {
		  String str1 = "abcdefghijklmnopqrstuvwxy";
		  int split_number = 5;
		  splitString(str1, split_number);
		 // m2();
		 }
		static  void m2() {
			 String s="jghsdrtryu";
			 int d=s.length();
			 int f=5;
			 if(d%f!=0) {
				 System.out.println("hi");
			 }
			 else
			 {
				 System.out.println("hello");
			 }
		 }
		}


