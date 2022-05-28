package com.nt.string;

public final class ImmutableString {
	final String pno;
	//pa constructor
	public ImmutableString(String pno) {
		this.pno=pno;
	}
	//onily gettr methods
	public String getpno() {
		return pno;
		
	}
	
	public static void main(String[] args) {
		ImmutableString m=new ImmutableString("1234");
		String s=m.getpno();
		System.out.println(s);

	}

}
