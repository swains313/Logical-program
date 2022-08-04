package com.Raghu30jul2022;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 4 number");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		double n3=sc.nextDouble();
		double n4=sc.nextDouble();
		
		double res = n1<n2 && n1<n3 && n1<n4 ? n1 : n2<n3 && n2<n4 ? n2 : n3<n4 ?n3:n4;
		
		System.out.println(res);
	}

}
