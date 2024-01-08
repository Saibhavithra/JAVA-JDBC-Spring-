package com.returnship.training;
import java.util.Scanner;

public class FindCoursename{
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("What are your 5 fav Courses?");
	  
	  String[] Courses = new String[5];
	  for(int i=0;i<5;i++)
	  {Courses[i] =  scan.next();}
	  System.out.println("Let's Search a Courses");
	  System.out.println("Enter a Course Name");
	  
	  String str = scan.next();
	  int counter =0;
	  for(int i=0; i<5; i++) {
		  if(str .equals ((Courses[i])))
		  { counter++;
		  
		  }
	  }
			 if(counter ==1)
			 System.out.println(str + " IS FOUND");
			 else
				 System.out.println(str + " IS NOT FOUND"); 
			 }
  
	  }
  
	  




  
  




