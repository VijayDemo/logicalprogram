package com.nt.thread;

 class AgeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException(String s) {
		super(s);
		
	}
	
}
public class InvalidAgeException{
	
	static void validate(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("age is not suuficent for vote");
		}
		else {
			System.out.println("eligible for vote");
		}
		
	}


	public static void main(String[] args) {
		try {
			validate(17);
		}
		catch(AgeException ex) {
			System.out.println("exception occured::"+ex);
		}
		
	}
}

