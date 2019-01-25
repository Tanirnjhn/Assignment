package com.cpg.prog1.bean;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       String s= sc.next();
       int i;
       for(i=1;i<=s.length();i++)
       {
       if(i%2 != 0)
       {
         s= s.substring(0,i-1)+ "#" + s.substring(i, s.length());
         
        		
       }

	}
    System.out.println(s);   
	}

}
