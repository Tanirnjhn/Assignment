
package com.cpgi.lab7.bean;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
	
	public ArrayList RemoveElements(ArrayList l1, ArrayList l2) {
		int i;
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter no of elements");
		int n= scanner.nextInt();
		System.out.println("enter first list");
		for(i=0;i<n;i++)
		{
			l1.add(scanner.nextLine());
		}
		System.out.println("enter second list");
		for(i=0;i<n;i++)
		{
			l2.add(scanner.nextLine());
		}
		l1.removeAll(l2);
		return l1;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> l1= new ArrayList<>();
	ArrayList<String> l2= new ArrayList<>();
	Remove remove= new Remove();
	remove.RemoveElements(l1,l2);
	System.out.println(l1);

	}
	


}