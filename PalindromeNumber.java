package com.Ragu02august2022;


//PALINDROME NUMBER 121 //121 RIGHT    //331 //133 WRONG

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 
		
		System.out.println("Enter the number");
		int n =sc.nextInt();
		
		boolean res=palindromeNumber(n);
		
		if(res==true)
			System.out.println(n+ " : is palindrome number");
		else
			System.out.println(n+ " : is not a palindrome number");
		
		
		
	}
	
	static boolean palindromeNumber(int num)
	{
		int temp=num;;
		int remainder,reverse=0;
		while(num!=0) 
		{
			remainder=num%10;
			reverse=reverse*10+remainder;
			num=num/10;
		}
		if(reverse==temp)
			return true;
		else 
			return false;
		
	


	}

}
