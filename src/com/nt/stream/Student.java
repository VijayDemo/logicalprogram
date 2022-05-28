package com.nt.stream;

import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
	private Integer marks;
	private String name;

	public Student(Integer marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Student,String> d=s->{
			String grade="";
			int id=s.marks;
			if(id>=20)
				grade="a";
			else if(id>=30)
				grade="b";
			else 
				grade="c";
			return grade;
			
		};
		  Predicate<Student> p=c->c.marks>=20;
		 Student [] c= {
				new Student(65,"vijay"),
				new Student(25,"dd"),
				new Student(45,"cc"),
		   };
	for(Student k:c) {
		if(p.test(k)) {
		System.out.println("name::"+k.name);
		System.out.println("name::"+k.marks);
		System.out.println("=======================");
		//System.out.println(d.apply(k));
		}
		
	}
	}

}
