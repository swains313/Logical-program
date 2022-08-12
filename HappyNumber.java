package com.Raghu05august2022;

import java.util.Scanner;

public class HappyNumber {
	
	public static int happyNumber(int n1)
	{
		int r=0,sum=0;
		
		
			
		
		while(n1>0)
		{
			r=n1%10;
			sum=sum+(r*r);
			n1=n1/10;
		}
		return sum;
	}
	
	 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int result = n;
		while (result != 1 && result != 4)
		{
		result = happyNumber(result);
		}
		if (result ==1)
		{
		System.out.println ("It is a Happy Number");
		}
		else
		{
		System.out.println (" It is not a Happy Number");
		}
	}

}
