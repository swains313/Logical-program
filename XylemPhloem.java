package com.Ragu06august2022;

import java.util.Scanner;

public class XylemPhloem {
	
	static String xylemPhloem(int n1)
	{
		int os=0,ms=0;
		os=n1%10;
		n1=n1/10;
		
		while(n1>9)
		{
			ms=ms+n1%10;
			n1=n1/10;
			
		}
		os=os+n1;
		
		if(os==ms)
			return "xylem";
		else
		
		return "phloem";
	}

	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number  ");
		int n=sc.nextInt();
		
		
		String s=xylemPhloem(n);
		System.out.println(s);

	}

}
