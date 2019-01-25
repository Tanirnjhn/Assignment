package com.cpg.prog1.bean;

import java.util.Scanner;

public class uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       String s= sc.next();
       String t="";
       for(int i=0;i<s.length();i++)
       {
    	   if(i%2==0)
    	   {
    		   t=t+Character.toUpperCase(s.charAt(i));
    		   
    	   }
    	   else
    	   {
    		   t=t+s.charAt(i);
    	   }
    	   
       }
       System.out.println(t);
	}

}
