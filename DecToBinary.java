package com.Raghu09august2022;

import java.util.Scanner;

public class Convestion {
	
	
	
	//DECIMAL TO BINARY LIKE : 53 =  110101
	String decToBinary(int dec)
	{
		String bin="";
		do {
			int b=dec%2;
			bin=b+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
	}
	
	//DECIMAL TO OCT LIKE : 53 =  65
	String decToOct(int dec)
	{
		String oct ="";
		do {
			int o=dec%8;
			oct=o+oct;
			dec=dec/8;
		}while(dec!=0);
		return oct;
	}
	
	//DECIMAL TO HEXA DECIMAL 245 : F5
	String decToHexa(int dec)
	{
		String hexa="";
		do {
			int h=dec%16;
			if(h<10)
				hexa=h+hexa;
			else
				hexa=(char)(h+55)+hexa;
			dec=dec/16;
		}while(dec !=0);
		return hexa;
	}
	
	
	
	
	
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the number");
			int n=sc.nextInt();
			
			Convestion bi=new Convestion();
			
			System.out.println("decimal To Binary       : "+bi.decToBinary(n));
			System.out.println("decimal To Octa         : "+bi.decToOct(n));
			System.out.println("deciman To HexaDecimal  : "+bi.decToHexa(n));
			System.out.println("-----------------------------------------------");
			
			
			
		
		

	}

}
