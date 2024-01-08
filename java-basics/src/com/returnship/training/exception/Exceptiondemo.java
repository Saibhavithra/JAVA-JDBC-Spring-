package com.returnship.training.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;
public class Exceptiondemo {

	   public static void main (String[] args) {
		   try {
			//   String str =show();
		//	   System.out.println();
		 //  }
		  // catch(Exception e){
		//	   System.out.println(getMessage(str));
		//   }
		   
		 //  String str =show();
		//   System.out.println(str);
		//  FileInputStream fis = null;
		/*  try {
		/*	fis = new FileInputStream("data.txt");
		   int y1=0;
		   int num = Integer.parseInt("");
		   float y = 0;
		   float x = 5/y;            
		   
		   System.out.println(x);*/
		   int y=0;
		   int x = 20;
		   if (x > 19) {
			  throw new NumberGreaterThanException("Cannot be greater than 19");
	   }
		   }
		  
	   
	   
	  // catch (ArithmeticException e) {
		 //  System.out.println("Arithmetic Exception ocurred");
	  // }
		  
		  // catch (NumberFormatException e) {
		//	   System.out.println("NumberFormatException");
		//   }

		//  catch(ArrayIndexOutOfBoundsException| NumberFormatException |FileNotFoundException|ArithmeticException|NumberGreaterThanException  e) {
			 catch(ArrayIndexOutOfBoundsException| NumberFormatException |ArithmeticException|NumberGreaterThanException  e) {
			  e.printStackTrace();
			  
			   if(e instanceof ArithmeticException) {
			  System.out.println("ArithmeticException");
		   }
			   else if(e instanceof NumberFormatException) {
					  System.out.println("NumberFormatException");
			   }
			   else if(e instanceof FileNotFoundException) {
					  System.out.println("FileNotFoundException");
			   }
			   else if(e instanceof NumberGreaterThanException) {
					  System.out.println(e.getMessage());
			   }
		  }
		/*  finally {
			  try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		 // catch (Exception e) {
		//	   System.out.println("NumberFormatException");
		 //  }fis.close();
		  */
		//  System.out.println("Program Execution continues");
	 //  }
/*public static String show()throws ArithmeticException {
	int x =0;
	int y= 5/x;
	System.out.println("Value of Y is : " + y);
	return "This method throws some exception";
	
}	*/

		   }
}