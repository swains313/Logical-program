package com.Raghu09august2022;

import java.util.Scanner;

public class ConvestionB {
	
	//BINARY TO decimal : 110101 = 53
	
		int biToDec(int bi)
		{
			int pw=1,dec=0;
			do
			{
				int r=bi%10;
				dec=dec+r*pw;
				pw=pw*2;
				bi=bi/10;
			}while(bi!=0);
			return dec;
		}
		
		//OCTA TO HEXA DECIMAL 
		
		int octToDec(int bi)
		{
			
			int pw=1,dec=0;
			do
			{
				int r=bi%10;
				dec=dec+ r*pw;
				pw=pw*8;
				bi=bi/10;
			}while(bi!=0);
			return dec;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  binary number ");
		int n=sc.nextInt();
		
		ConvestionB c=new ConvestionB();
		
		
		
		
		System.out.println("binary   To Decimal      : "+c.biToDec(n));
		System.out.println("octal    To Decimal         :"+c.octToDec(n));

	}

}
