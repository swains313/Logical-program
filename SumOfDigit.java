package com.Ragu02august2022;

import java.util.Scanner;

//WAP SUM OF DIGIT  22 // 2+2

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int res=sumOfDigit(num);
		System.out.println(res);
		
		
		

	}
	
	
	public static int sumOfDigit(int n)
	{
		int sum=0;
		int rem=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}return sum;
		
	}

}
