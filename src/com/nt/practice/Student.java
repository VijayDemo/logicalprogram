package com.nt.practice;

public class Student {
	private String name;
	private Integer id;
	private String addrs;
	private Float avg;
	
			
	

	public Student(String name, Integer id, String addrs, Float avg) {
		super();
		this.name = name;
		this.id = id;
		this.addrs = addrs;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public Float getAvg() {
		return avg;
	}

	public void setAvg(Float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", addrs=" + addrs + ", avg=" + avg + "]";
	}
	

}
