package com.cpg.prog1.ui;

import com.cpg.prog1.bean.check;
import com.cpg.prog1.bean.Gender;
public class checked {
public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		check p = new check("Taneesha", "Agrawal", Gender.F, 23);
		System.out.println("First Name:" +  p.getFirstName()+ "\n Last Name:"+ p.getLastName()+ "\n Age:" + p.getAge() + "\n Gender:" + p.getGender() + "\nWeight:" + p.getWeight()); );
		
	}

}
