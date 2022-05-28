package com.nt.collections;

import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
	
	private Integer id;
	private String name;
	private double avg;
	public Student1(int id,String name,float avg) {
		this.id=id;
		this.name=name;
		this.avg=avg;
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double d) {
		this.avg = d;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", avg=" + avg + "]";
	}


	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return o1.getId().compareTo(o2.getId());
	}


	


//	@Override
//	public int compare(Student1 os1, Student1 os2) {
//		if(os1.getAvg()==os2.getAvg()) {
//			return 0;
//		}
//		else if(os1.getAvg()>os2.getAvg()) {
//		return 1;
//	}
//	else {
//		return -1;
//	
//	}
//}


	
}