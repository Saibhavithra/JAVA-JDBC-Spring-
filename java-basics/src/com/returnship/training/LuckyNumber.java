package com.returnship.training;
import java.util.Scanner;

public class LuckyNumber {	
	public static void main(String args[]) {		
	int Counter = 0;
	int i;
	int n=5;		  
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to play Lucky Number Game");
	
	System.out.println("Guess a Number");
	for (i =0;i<n;i++) {
		//a[0] = sc.nextInt();
		int value =  sc.nextInt();	
	System.out.println("Your Guess is" + " "+ value);
	 int inputNumber = value ;
 	    if(Counter<5)
	    {	    		  	    	
	    if (inputNumber == 7)
	    {
	      Counter++;
	     // System.out.println("Your Guess is" +" "+  inputNumber); 
	      System.out.println("You found the Lucky Number in" + " " + Counter+ " "+ "attempt");
	      System.out.println("Congragulations");
	      break;
	     }
	    else
	     { Counter++;
	     System.out.println("try again");
	     System.out.println( "No of attempts:" + Counter);
	     if (Counter==5)
	     {
	    	 System.out.println("Attempt over");
	     }
	      }	  	      
	    }
 	
	  }	
	 	
}
	}		
	 
    

