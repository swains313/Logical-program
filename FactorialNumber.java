package com.Raghu01august2022;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the intger number");
		int n=sc.nextInt();
	    int  b= factorial(n);
	    System.out.println(b);
		
	}
	
	static int factorial(int n1)
	{
		int fact=1;
		for(int i=1;i<=n1;i++)
		{
			fact=fact*i;
			
			
			
			
		}return fact;
		
		
	}

}
