package com.returnship.training.accountmanagement;

public class Requestloan extends Account {

	private double minBalance;
	
	  public Requestloan(int accountNumber,Customer customer,double balance,double minBalance )
	  {
		  super(accountNumber, customer, balance);		 
		  this.minBalance= minBalance;
	  }	  

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	
	@Override
	public  boolean withdraw (double amount)
	 
	 {
		 if ((this.getBalance() - amount) >= minBalance){
			this.setBalance(this.getBalance() - amount);
			return true;
		 }
		 
		 return false;
	   
		   
	 }
	@Override
	public  boolean saving(double amount)
	 
	 {
			this.setBalance(this.getBalance()+ amount);
			return true; 	 	   	   
	 }	 	 
}
