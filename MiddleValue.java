package com.Raghu30jul2022;

import java.util.Scanner;

public class MiddleValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 3 number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2 && n1<n3 || n2>n3 && n2<n1)
			System.out.println(n1);
		else if(n2>n1 && n2<n3 || n2>n3 && n2<n1)
			System.out.println(n2);
		else
			System.out.println(n3);
		
		
		
		

	}
	

}
