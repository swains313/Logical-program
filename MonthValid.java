package com.Raghu30jul2022;

import java.util.Scanner;

public class MonthValid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the month no.");
		int m=sc.nextInt();
		
		switch(m)
		{
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		{
			System.out.println("Valid month number");
		}break;
		default:
		{
			System.out.println("! NOT  valid");
		}
		
		}

	}

}
