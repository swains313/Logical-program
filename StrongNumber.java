package com.Ragu02august2022;

//WAP STRONGEST  NUMBER  EX 145     1*1=1 ||  4*3*2*1=24 ||  5 *4*3*2*1=120  =120+24+1=145 MEAN TRUE

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		boolean res=strong(n);
		System.out.println(res);
		
		
	}
	
	public static int  fact(int num)
	{
//		int fact=1;
//		for(int i=1;i<=num;i++)
//		{
//			fact=fact*i;
//		}return fact;
		
		int fact=1;
		
		while(num >1)
		{
			fact =fact*num;
			num--;
			
			
		}return fact;
		
	}
	//
	
	public static boolean strong(int n1)
	{
		int temp=n1;
		int rem=0;
		int strong=0;
		while (n1!=0)
		{
			rem=n1%10;
			strong =strong+fact(rem);
			n1=n1/10;
			
		}
		
		if(temp==strong)
			return true;
		else
			return false;
	}

}
