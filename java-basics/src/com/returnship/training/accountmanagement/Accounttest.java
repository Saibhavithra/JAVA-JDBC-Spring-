package com.returnship.training.accountmanagement;
//import com.returnship.training.accountmanagement.Savingsaccount;
import java.util.Scanner;

public class Accounttest {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
				System.out.println("Enter Customer ID:");
		int custId =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Customer Name:");
		String custName=sc.nextLine();
		System.out.println("Enter Customer Email:");
		String custEmail =sc.nextLine();
		Customer  cust = new Customer(custId,custName,custEmail);
 
		System.out.println("Enter Account Number:");
		int acctNumber=sc.nextInt();
		System.out.println("Enter Account Balance  :");
	    double acctBalance =sc.nextDouble();
		System.out.println("Enter Minimum Balance:");
		double minBalance =sc.nextDouble();
		
		System.out.println("Enter type of account (Savings or Checking or Loan):");
		String type = sc.next();	
		            
	
		Account account = Accountfactory.getAccount(type, acctNumber, cust, acctBalance, minBalance);		
			
		
		System.out.println(type);
		
//if (type.equalsIgnoreCase("Savings")) {
	
	System.out.println("Enter the operation you want to perform (Save or Withdraw or loanrequest or loanpayback):");
    String operation = sc.next();
    System.out.println("Enter amount:");
	double amount =sc.nextDouble(); 
	
		{	
		
	 // if(type.equalsIgnoreCase("Savings")&&(operation.equalsIgnoreCase("Save")) )
		  if((operation.equalsIgnoreCase("Save")) || (operation.equalsIgnoreCase("loanrequest")))
		  {
		  System.out.println("success");
		if(account.saving(amount))
	
		  		
		{
			 System.out.println("Account balance after saving:"+account.getBalance());
			
		 }
		
		}
	else 
		{System.out.println("Withdraw:");
	//	double amount =sc.nextDouble();
		
		if(account.withdraw(amount))
	
		  		
		{
			 System.out.println("Account balance after withdraw:"+account.getBalance());
			
		 }
		}
		sc.close();	
		}
}
} 
//}