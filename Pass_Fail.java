package com.Raghu30jul2022;

import java.util.Scanner;



public class Pass_Fail {
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark of JAVA");
		int java=sc.nextInt();
		System.out.println("Enter the mark of SQL");
		int sql=sc.nextInt();
		System.out.println("Enter the mark of JAVA SCRIPT");
		int js=sc.nextInt();
		System.out.println("Enter the mark of PYTHON ");
		int py=sc.nextInt();
		
		
		

		
		if(java >=0 && java<=100 && sql>=0&&sql<=100  && js>=0 && js<=100 &&py>=0&&py<=100)
		{
		    
				if(java>=30 && sql>=30 && js>=30 && py>=30)
				{
					System.out.println(" YOU [pass] ");
				}
				else 
				System.out.println(" [fail] plz study hard ");
				
			
				int totalMark=java+sql+js+py;
				
			
				if(totalMark <=400)
				{
					System.out.println("  total mark is "+totalMark );
				}
				else
					System.out.println(" check your mark again (!addition check again)");
				
				
				float percentage=(totalMark)/4;
				
				System.out.println("your percentage is "+percentage);
				
				
				if(percentage>=30 && percentage<=50)
				{
					System.out.println("3rd division  ");
					
				}
				else if(percentage>=50 && percentage<60)
				{
					System.out.println(" 2nd division ");
				}
				else if(percentage>=60 && percentage<100)
				{
					System.out.println("1st class ");
				}	
				else
					System.out.println("fail");
			
		}
		else
		{
			System.out.println("plz enter valid mark (mark should B/T (1-100)");
		}
	
		
			
		
	}

}
