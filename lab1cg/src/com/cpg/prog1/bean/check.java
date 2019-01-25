package com.cpg.prog1.bean;


public class check {
	private String firstName;
	private String lastName;
	private Gender G;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getG() {
		return G;
	}
	public void setG(Gender g) {
		G= g;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public check() {
		super();
	}
 public check(String f, String L, Gender t, int A)
 {
	 firstName=f;
	 lastName=L;
	 G=t;
	 age=A;
	 
	 
 }

	}
 class checked {
public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		check c = new check("Taneesha", "Agrawal", Gender.F, 23);
	}

}


