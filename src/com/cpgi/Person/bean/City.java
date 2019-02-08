package com.cpgi.Person.bean;

public class City {
	private String name;
	 
	public City(String name) {
super();
this.name=name;

	
	}

	public City() {
	
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}

}
