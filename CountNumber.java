package com.Ragu02august2022;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr the number");
		int n=sc.nextInt();
		
		int count=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			count++;
			n=n/10;
			
		}
		System.out.println(count);
		
		
		

	}

}
