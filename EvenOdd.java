package com.Raghu29july2022;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		//evenOdd();
		//even1();
		even2();

	}
	
	
	//using if else
//	public static void even()
//	{
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the number ");
//		int n=sc.nextInt();
//		
//		if(n%2==0)
//		System.out.println(n+"even");
//		else
//			System.out.println(n+"odd");
//		
//	}
	
	
	//Without using modules  LOGIC (n/2*2==n) ex-1 8/2*2==8 true ex-2 9/2*2==9
//	public static void evenOdd()
//	{
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the number ");
//		int n=sc.nextInt();
//		
//		if(n/2*2==n)
//			System.out.println("even");
//		else
//			System.out.println("odd");
//		even();
//		
//	}
	
	//using switch case
//	public static void even()
//	{
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the number ");
//		int n=sc.nextInt();
//		
//		switch(n%2)
//		{
//		case 0:
//		{
//			System.out.println("even");
//		}break;
//		case 1:
//		{
//			System.out.println("odd");
//			
//		}
//		}
//		
//		
//	}
//	
	//using conditional op(ternary)
	
//	public static void even1()
//	{
//		
//		int n=25;
//		String s=(n%2==0)?"even":"odd";
//		System.out.println(s);
//		
//	}

	
	//using bitwise op
	public static void even2()
	{
		int n=4;
		if((n&1)==0)
		System.out.println("even");
		else
			System.out.println("odd");
	}
}
