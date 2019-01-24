package com.cpg.prog1.bean;

public class PersonMain {
	 private String firstName;
	 private String lastName;
	 private int age;
	 private char gender;
	 private float weight;

	 public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge1(int Age) {
		this.age = Age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char Gender) {
		this.gender = Gender;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float Weight) {
		this.weight = Weight;
	}
	
	public void setAge(int age2) {
		// TODO Auto-generated method stub
		
	}
	 public PersonMain()
	 {
		 super();
		 }
	  
	 public PersonMain(String F, String L, int A, char G, float W)
	 
	 {
		 firstName=F;
		 lastName=L;
		 age=A;
		 gender=G;
		 weight=W;
		 
	 }

}
