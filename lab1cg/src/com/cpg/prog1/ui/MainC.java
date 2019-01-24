package com.cpg.prog1.ui;

import com.cpg.prog1.bean.MainClass;

public class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass s= new MainClass();
		s.setStudRollno(12);
        s.setStudName(  "Taneesha");
        s.setStudMarks(78.7f);
        System.out.println("Rollno:"+ s.getStudRollno() + "\n Name is:"+ s.getStudName() + "\n marks are:"+ s.getStudMarks());
	}

}
