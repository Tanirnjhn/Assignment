package com.cpgi.lab7.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArr {
	 public void getArray() {
		 int i;
		 int w[]= new int[40];
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("enter array that to be added");
		int n= scanner.nextInt();
		System.out.println("Enter element");
		 for(i=0; i<n; i++)
		 {
			w[i]=scanner.nextInt();
		 }
		StringBuilder stringBuilder= new StringBuilder();
		for(i=0; i<n; i++)
		{
			stringBuilder.append(w[i]);
			stringBuilder.append("\n");
		}
		stringBuilder.reverse();
		String[] s1= stringBuilder.toString().split("\n");
		ArrayList<String> arrayList= new ArrayList<String>(Arrays.asList(s1));
		Collections.sort(arrayList);
		System.out.println(arrayList);
	 }
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
         SortingArr a= new SortingArr();
         a.getArray();
         
	}

}
