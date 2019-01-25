package com.cpg.prog1.bean;

import java.util.Scanner;

public class duplicate {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    String s= sc.next();
    String t="";
    char c;
    for(int i=0;i<s.length();i++)
    {
    	c=s.charAt(i);
    	if(t.indexOf(c)==-1)
    	{
    		t=t+c;
    	}}
    	System.out.println(t);
    
    
	}
}
