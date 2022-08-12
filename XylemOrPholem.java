package com.Raghu05august2022;

import java.util.Scanner;

public class XylemOrPholem {
	public static String xylem(int n1)
	{
		
		int temp = n1, extremeSum=0, meanSum=0;
	    
	    while(temp != 0)  
	    {
	        if(temp == n1 || temp < 10)  
	            //Adds the first and last digits
	            extremeSum = extremeSum + temp % 10;  
	        else  
	            //finds the mean digits and adds  
	            meanSum = meanSum + temp % 10;
	        temp = temp / 10;  
	    }
	    if(extremeSum==meanSum)
	    
	       return " is a Xylem number";
	    
	    else
	    
	        return " is a Phloem number";
	}
	    

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		
		String res=xylem(n);
		System.out.println(res);
		
	}

}
