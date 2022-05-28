package com.nt.io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("vijay",26,86.5f));
		list.add(new Student("abd",6,46.5f));
		list.add(new Student("vfd",2,66.5f));
		list.add(new Student("hggd",28,76.5f));
		Collections.sort(list,(i,j)->i.getName().compareTo(j.getName()));
		list.forEach(System.out::println);
		Optional<Student> s=list.stream().sorted(Comparator.comparingDouble(Student::getAvg).reversed()).skip(2).findFirst();
		System.out.println("heighst avg studennt::"+s);
		}
	}


