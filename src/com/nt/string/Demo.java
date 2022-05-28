package com.nt.string;

public class Demo {
	static void m1() {
	String s="abdnit  123@!./";
	int no=0;
	int lettrs=0;
	
		for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i)!=' '&&s.charAt(i)!='@' &&!Character.isDigit(s.charAt(i))) {
			lettrs++;
			System.out.println("letter are::"+s.charAt(i));
		}
		if(!Character.isLetter(s.charAt(i))&&s.charAt(i)!='@'&& s.charAt(i)!=' ') {
			no++;
			System.out.println("given no::"+s.charAt(i));
		}
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			System.out.println("vowel are::"+s.charAt(i));
		}
		if(s.charAt(i)=='!'||s.charAt(i)=='.'||s.charAt(i)=='/') {
			System.out.println("punchuvation char::"+s.charAt(i));
		}
		
		
		
		
	}
		System.out.println("totoal lettres are::"+lettrs);
		System.out.println("totoal no are::"+no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
