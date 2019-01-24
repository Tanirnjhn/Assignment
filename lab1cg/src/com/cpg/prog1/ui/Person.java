package com.cpg.prog1.ui;

import com.cpg.prog1.bean.PersonMain;

public class Person {

	public static void main(String[] args) {
		
	PersonMain p = new PersonMain("Divya", "Bharati", 20, 'F', 77.5f);
	/*(p.setFirstName("Divya");
	p.setLastName("Bharati");
	p.setAge(20);
	p.setGender('F');
    p.setWeight(77.5f);*/
    System.out.println("First Name:" +  p.getFirstName()+ "\n Last Name:"+ p.getLastName()+ "\n Age:" + p.getAge() + "\n Gender:" + p.getGender() + "\nWeight:" + p.getWeight());
	}

}
