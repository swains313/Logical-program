package com.Ragu02august2022;

//DEFINE METHOD TO RETURN THE SUM OF SQUARE VALUE 

import java.util.Scanner;

public class SumOfSquare {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n =sc.nextInt();
		
		int res=sumOfSqaure(n);
		System.out.println(res);
		
		
	
}
	
	
	static int sumOfSqaure(int n)
	{
		 //int temp=n;
		 int rem=0;
		 int sum=0;
		 while(n!=0)
		 {
			 rem=n%10;
			 sum=sum+(rem*rem);
			 n=n/10;
		 }return sum;
		
	}

}
