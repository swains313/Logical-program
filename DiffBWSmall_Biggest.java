package com.Ragu06august2022;

import java.util.Scanner;

public class DiffBWSmall_Biggest {
	
	static int dNumber(int n1)
	{
		int big,small;
		big=small=n1%10;
		
		do{
			int r=n1%10;
			if(r>big)
				big=r;
			if(r<small)
				small=r;
			n1=n1/10;
				
			
		}while(n1!=0);
		return big-small;
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		int x=dNumber(n);
		System.out.println(x);

	}

}
