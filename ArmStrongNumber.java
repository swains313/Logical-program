package com.Raghu08aug2022;

import java.util.Scanner;

public class ArmStrongNumber {
	
	static long count(long c)
	{
		int count=0;
		while(c>0)
		{
			c=c/10;
			count++;
		}return count;
	}
	
	static long fact(long r, long c)
	{
		long fact=1;
		while(c>0)
		{
			fact=fact*r;
			c--;	
		}return fact;
	}
	
	static long armStrongNumber(long n)
	{
		long c=count(n);
		long sum=0,r;
		while(n>0)
		{
			r=n%10;
			sum=sum+fact(r,c);
			n=n/10;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		long n=sc.nextInt();
		
		
		for(long i=1;n>0;i++)
		{
			long j=armStrongNumber(i);
			if(i==j)
			{
			System.out.println(i);
			n--;
			}
			
		}
		
		
			
			
			
			
		
			
		

	}

}
