package com.nt.io;

public class Emplyoee  {
	String name;
	private Integer no;
	private Double sal;
	
	
	public Emplyoee(String name, Integer no, double sal) {
		super();
		this.name = name;
		this.no = no;
		this.sal = sal;
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

	public Double getSal() {
		return sal;
	}

	public void setSal(double d) {
		this.sal = d;
	}

	@Override
	public String toString() {
		return "Emplyoee [name=" + name + ", no=" + no + ", sal=" + sal + "]";
	}

	
	

}
