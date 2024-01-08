package com.returnship.training.accountmanagement;



public abstract class Account {
	private Customer Customer;
		  private int accountNumber ;
		  private double balance;
		  public abstract boolean withdraw(double amount); 
		  public abstract boolean saving(double amount); 
		  public Account(int accountNumber,Customer customer,double balance ) {
			  this.accountNumber = accountNumber;
			  this.Customer = customer;
			  this.balance= balance;
			  
			  
		  }
		  
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		}  