package com.cpgi.lab7.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Square {

	public static HashMap getSquares(int[] sq) {
		HashMap<Integer,Integer> m1 = new HashMap<Integer, Integer>();
		for(int number:sq)
		{
			m1.put(number, number*number);
		}
		
		
		return m1;
		
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no of elements");
		int n= scanner.nextInt();
		int sqr[]= new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			sqr[i]= scanner.nextInt();
			
		}
		System.out.println("square no");
		HashMap<Integer, Integer> t =getSquares(sqr);
		Iterator<Integer> m= t.keySet().iterator();
		while(m.hasNext())
		{
			Integer key= m.next();
			System.out.println(key+ ","+t.get(key));
			
		}
		
		
		
	}

}
