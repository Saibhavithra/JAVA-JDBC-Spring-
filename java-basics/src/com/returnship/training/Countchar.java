package com.returnship.training;

public class Countchar {
	 
	//static final int MAX_CHAR = 256;  
	static void getOccuringChar(String str)  
	{  
	//creating an array of size 256 (ASCII_SIZE)  
	//int count[] = new int[MAX_CHAR];  
	//finds the length of the string  
	int len = str.length();  
	int count[] = new int[len];
	//initialize count array index  
	for (int i = 0; i < len; i++)  
	
	count[str.charAt(i)]++;  
	//create an array of given String size  
	char ch[] = new char[len];  
	//int[] myIntArray = {1, 2, 3};
	


	for (int i = 0; i < len; i++)   
	{  
	ch[i] = str.charAt(i);  
	int find = 0;  
	for (int j = 0; j <= i; j++)   
	{  
	//if any matches found  
	if (str.charAt(i) == ch[j]) 
	find++;  
	}             
	if ((find == 1) && (str.charAt(i) != ' '))
		
	/*	if(Character.isWhitespace(str.charAt(i)))		
		{int x=1;}
		else*/
		
	//prints occurrence of the character   
	System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);  
	}  
	} 
	
public static void main(String args[])  
{  
String str = "hello world"; 
//function calling  
getOccuringChar(str);  
}  
}  