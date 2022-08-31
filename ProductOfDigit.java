package com.Ragu02august2022;

//PRODUCT OF DIGIT 33 3*3 =9

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n =sc.nextInt();
		
		int res=sumOfSqaure(n);
		System.out.println(res);
		
		
	
}
	
	
	static int sumOfSqaure(int n)
	{
		int product = 1;
		 
        while (n != 0) {
        	int i=n%10;
           product = product * i;
            n = n / 10;
           
        }return product;
        
		

	}

}
