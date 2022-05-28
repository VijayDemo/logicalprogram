package com.nt.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
	void display() {
		List<Integer> list=new ArrayList<>();
		list.add(25);
		list.add(50);
		list.add(24);
		list.add(15);
		list.add(8);
		System.out.println("Vowels are ::"+list);
		for(Integer t:list) {
			System.out.println("iteration of List::"+t);
		}
		System.out.println("-----------");
		Collections.sort(list);
		System.out.println("Vowels are ::"+list);
		
	}

	public static void main(String[] args) {
		ListTest lt=new ListTest();
		lt.display();
		
	}

}
