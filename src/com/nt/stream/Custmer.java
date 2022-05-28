package com.nt.stream;

public class Custmer {
	private String name;
	Integer id;
	
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
	public Custmer(String name,Integer id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Custmer [name=" + name + ", id=" + id + "]";
	}

}
