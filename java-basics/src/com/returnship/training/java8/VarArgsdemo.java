package com.returnship.training.java8;

public class VarArgsdemo {
	public static void main(String[] args) {
		show(100,120);
		//show(100);
		show(12,45);
		show(23,56,45);
		
	}
	 //static void show(int... a) {
	 static void show(int x,int y,int... a) {
		// TODO Auto-generated method stub
		 System.out.println("No.of.arguments"+ a.length);
		 System.out.println(x); 
		 System.out.println(y); 
		 for(int n:a) {
			 System.out.println(n); 
		 }
		
	}

}
