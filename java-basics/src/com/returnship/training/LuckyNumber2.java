package com.returnship.training;
import java.util.Scanner;
public class LuckyNumber2 {

	public static void main(String[] args) {
		//int secretNumber =(int)(Math.random()*20)+1;//to generate random secret number	
		int secretNumber=7;
		System.out.println( "The Secret number is "+secretNumber);
		System.out.println("Welcome to Assignment-1:Number Guessing Game");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  :\t ");
		int intNum = sc.nextInt();
			if (intNum<=0) {
				System.out.println("Enter number between 1-20");
				System.out.println("Restart Game");
			} 
			else {
				System.out.println("  Thats a trial ==> User Get 5 turns:Good-Luck");
				for (int i = 4; i >= 0; i--) {
					System.out.println("Enter a number :\t ");
					int Fnum = sc.nextInt();
					if (Fnum==secretNumber) {
						System.out.println("You guessed right !! Congratulations");
						break;
					}
					else {
						System.out.println("you have " +(i)+ "turns\n\n");
						if (i==0) {
							System.out.println("Better Luck next time");
						}						
					}
			}
		} 
	}

}
