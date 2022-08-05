package com.Raghu05august2022;

import java.util.Scanner;

public class DifferenceB_WBiggestAndSmallest {
	
	
	public static int difference(int n3,int n4)
	{
		
		int big=n3>n4? n3 :n4;
		//int small=n3<n4? n3:n4;
		
		//return big-small;
		return big-n4;
		
	}

	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number  : ");
		int n1=sc.nextInt();
		System.out.println("Enetr the second number : ");
		int n2=sc.nextInt();
		
		int res=difference(n1,n2);
		System.out.println(" the difference between "+n1+"  and  "+n2+" is  = "+res);
		

	}

}
