package com.Raghu10august2022;

import java.util.Scanner;

public class PowerOfN {
	
	static int power(int n,int p)
	{
		int power=1;
//		for(int i=1;i<=p;i++)
//		{
//			power=power*n;
//		}return power;
		
		while(p>0)
		{
			power=power*n;
			p--;
		}return power;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter base n");
		int n=sc.nextInt();
		
		System.out.println("Enter the power");
		int p=sc.nextInt();
		
		int i=power(n, p);
		
		System.out.println(i);
		
		
	}

}
