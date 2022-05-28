package com.nt.string;

public class Test {
	static void m1() {
		String s="vijay";
		System.out.println("after concat::"+s.concat("hi").hashCode()+" ");
		System.out.println(s.hashCode()+" "+s.getClass());
	   String st="vvhijjay";
	   char [] ch=st.toCharArray();
	   for(int i=1;i<ch.length;i=i+2) {
		   System.out.print(ch[i]);
	   }
	   
	}
	static void m2() {
		int a[]= {10,20,20,3,5,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate elements are::"+a[j]);
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		m1();
		m2();

	}

}
