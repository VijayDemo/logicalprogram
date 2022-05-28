package com.nt.io;

public class Student  {
	private String name;
	private Integer no;
	private Float avg;
	public Student(String name, Integer no, Float avg) {
		super();
		this.name = name;
		this.no = no;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", avg=" + avg + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	
	
		
	}

	


