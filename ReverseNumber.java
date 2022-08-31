package com.Ragu02august2022;
//REVERSE NUMBER 123  // 321

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n =sc.nextInt();
		
		int res=reverseNumber(n);
		System.out.println(res);
	}
	
	static int reverseNumber(int num)
	{
		int remainder,reverse=0;
		while(num!=0) 
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}return reverse;
	}
	

}
