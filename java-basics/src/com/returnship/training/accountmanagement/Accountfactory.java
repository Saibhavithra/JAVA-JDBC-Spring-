package com.returnship.training.accountmanagement;

public class Accountfactory {
      public static Account getAccount(String type, int accountNumber,Customer customer,double balance,double minBalance) {
    	  if(type.equalsIgnoreCase("Savings")){
    			 return new Savingsaccount(accountNumber, customer,balance,minBalance);
    		 }
    		 else if (type.equalsIgnoreCase("Checking")){
    			 return new Checkingaccount(accountNumber, customer,balance,minBalance);
    		 }
    		 else if (type.equalsIgnoreCase("Loan")){
    			 return new Checkingaccount(accountNumber, customer,balance,minBalance);
    		 }
    		 else
    		 { return null;
      }
      }
} 
  