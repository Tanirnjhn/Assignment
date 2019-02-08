package com.cpgi.Person.bean;

public class Employee {
 private String name;
 private int id;
 private Address address;
 
 public Employee( int id,String name, Address address)
 {
	 super();
	 
	 this.name= name;
	 this.id=id;
	 this.address= address;
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

public void setId(int id) {
	this.id = id;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
}


}
