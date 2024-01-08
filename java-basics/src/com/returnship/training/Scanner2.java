package com.returnship.training;

import java.util.Scanner;

public class Scanner2 {
	static int MAX_CHAR = 256;
	public static  void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers you want to enter?");
		int n=scan.nextInt();
		System.out.println("Enter Integers");
		int[] a= new int[n];
		
		int Counter = 0;
		
		for(int i=0; i<n;i++) {
		
		a[i] = scan.nextInt();
	}
		for(int i =0;i<n; i++) 
		{
			if (a[i]% 2  == 0 )
			{Counter++;
			
			int[] b= new int[MAX_CHAR];
			b[i] = a[i];
			System.out.println(b[i]);}
			
		}			
}
}