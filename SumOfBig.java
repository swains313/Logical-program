package com.Raghu10august2022;

import java.util.Scanner;

public class SumOfBig {
	static int biggestSmallest(int n)
	{
		
		int big,small;
		big=small=n%10;
		
		do{
			int r=n%10;
			if(r>big)
				big=r;
			
			if(r<small)
				small=r;
			
			n=n/10;
		}while(n>0);
		return big+small;
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	
	int i=biggestSmallest(n);
	System.out.println(i);
	
	

	}

}
