package com.cpg.prog1.bean;

import java.util.Scanner;

public class Follow {
	public static void main(String[] args)
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		char[] a= s.toCharArray();
	
		for(int i=0;i<a.length;i++)
		{
		if((int)(a[i]) > (int)(a[i+1]))
		{
			count=-1;
			break;
		}
             count++;
		}
             if(count==-1)
		{ 
			System.out.println("FAlSE");
		}
		else
		{
			System.out.println("TRUE");
		}
	

}
}