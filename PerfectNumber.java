package com.Raghu08aug2022;

import java.util.Scanner;

public class PerfectNumber {
	
	
	
	
	static int isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;				
		}return sum;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		for (int i = 1; i < n; i++)
		{
			int j=isPerfect(i);	
			if (j==i)  	 
			System.out.println(i+" is a perfect number"); 
		}
		
		
		
	
		
		
		
		
			
			
		}
		
		

	

}
