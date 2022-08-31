package com.JavaProgrammingRaguSir;
//WAP ASSECNDING ORDER

//import java.util.Scanner;
//
//public class Assecnding {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the  integer number");
//		int n1=sc.nextInt();
//		System.out.println("Enter the integer number");
//		int n2=sc.nextInt();
//		System.out.println("Enetr the integer number");
//		int n3=sc.nextInt();
//		
//		
//		if(n1>n2 && n2>n3)
//		{
//			System.out.println(n1 + " " +n2+" "+n3);
//		}
////		
//			
//		
//		
//	}
//
//}


import java.util.BitSet; 
import java.util.Scanner; 
public class Assecnding { 
 
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		int big=n1>n2 && n1>n3 ? n1 : n2>n3 ? n2:n3;
		int small=n1<n2 && n1<n3 ?n1 : n2<n2? n2:n3;
		
		System.out.println(big);
		System.out.println((n1+n2+n3)-(big+small));
		System.out.println(small);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
//		BitSet b = new BitSet(10); 
//		Scanner sc = new Scanner(System.in); 
//		// enter integers here 
//		for(int i=0;i<10;i++){ 
//			b.set(sc.nextInt()); 
//		} 
//		 
//		// print your numbers 
//		System.out.println(b.toString()); 
		
		
		
		
		
		
		
	} 
} 