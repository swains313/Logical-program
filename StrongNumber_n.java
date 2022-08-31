package com.Raghu08aug2022;

import java.util.Scanner;

public class StrongNumber_n {
	
	 static int isStrong(int n) {
		 
		 int r,sum=0;
		 
		
			 while(n>0)
			 {
				 r=n%10;
				 sum=sum+fact(r);
				 n=n/10;	 
				 
			 }return sum;
			
	 }
	

	 static int fact(int r) {
		 
		 int fact=1;
		while(r>0)
		 {
			 fact=fact*r;
			 r--;	 
		 }return fact;
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int r=isStrong(i);
			if(r==i)
				System.out.println(i);
		}
		
		
		
		
		
	}

	

}
