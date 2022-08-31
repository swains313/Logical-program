package com.Raghu08aug2022;

import java.util.Scanner;

public class Diserian {
	
	static int diserian(int n)
	{
		int c=count(n);
		int sum=0,r;
		while(n>0)
		{
			r=n%10;
			sum=sum+fact(r,c);
			c--;
			n=n/10;
		}return sum;
	}
	
	static int count(int c)
	{
		int count=0;
		while(c>0)
		{
			c=c/10;
			count++;
		}return count;
	}
	
	static int fact(int r,int c)
	{
		int fact=1;
		while(c>0)
		{
			fact=fact*r;
			c--;
			
		}return fact;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int j=diserian(i);
			if(j==i)
				System.out.println(i);
		}
		

		
	}

}
