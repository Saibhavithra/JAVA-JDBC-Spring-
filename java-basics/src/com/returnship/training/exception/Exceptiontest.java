package com.returnship.training.exception;

import java.util.Scanner;
import java.lang.Exception;
public class Exceptiontest {

	

	public static void main (String[] args) {
		 
		  try{
			  Scanner scan = new Scanner(System.in);
		   System.out.println("Enter 10 numbers:");
		   int[] num = new int[10];
		   for(int i=0;i<10;i++){
			  num[i] = scan.nextInt();
			
		   
		 if (num[i] <0 ) 
		 {
			  throw new NegativeNumberException("Cannot be Negative Number");
	     }
		 
		 if (num[i] >100 ) 
		 {
			  throw new NumberGreaterThanException("Number Cannot be greater than 100");
	     }
		 
		 if (num[i]< 20) 
		 {
			  throw new NumberLesserThanException("Number Cannot be lesser than 20");
	     }
		   }
		 
		   System.out.println("Successfully entered positive numbers");  
		  
	}
			  catch(NegativeNumberException | NumberGreaterThanException|NumberLesserThanException e) {
				  if(e instanceof NegativeNumberException) {
					  System.out.println(e.getMessage());}
					  else if (e instanceof NumberGreaterThanException) 
						  System.out.println(e.getMessage()); 
						  else if (e instanceof NumberLesserThanException) {
							  System.out.println(e.getMessage());
					  }
				  
				
			   }
		 
	}

	
	   }



