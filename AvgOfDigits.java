package com.Raghu05august2022;

import java.util.Scanner;

public class AvgOfDigits {
	
	public static int countDigit(int x)
	{
		int count=0;
		do {
			x=x/10;
			count++;
			
		}while(x>0);
		return count;
	}
	
	
	public static float avgOfDigit(int n1)
	{
		int count=countDigit(n1);
		
		float r,sum=0;
		
		while(n1!=0)
		{
			r=n1%10;
			sum =sum+r;
			n1=n1/10;
		}
		return sum/count;
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number   ");
		int n=sc.nextInt();
		
		float res=avgOfDigit(n);
		System.out.println("the average of digit is   :  "+res);
		
	}
}
