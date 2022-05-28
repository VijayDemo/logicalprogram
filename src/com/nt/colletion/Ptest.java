package com.nt.colletion;

import java.util.function.Predicate;

public class Ptest {

	public static void main(String[] args) {
		Predicate<Integer> p=I->(I>20);
		System.out.println(p.test(25));
		System.out.println(p.test(7));
		
		
			
		}
	}


