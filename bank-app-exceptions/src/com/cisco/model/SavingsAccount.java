package com.cisco.model;

public class SavingsAccount extends Account implements Printable{

	private double interestRate;
	
	public SavingsAccount(double initialBalance, double interestRate) {
		// invoke  a super class (Account) constructor
//		Account ( initialBalance ); invalid
		
		super ( initialBalance ); // valid
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		
		System.out.println("Saving Account Balane : " + getBalance());
		double interest = getBalance() * interestRate / 100 ;
		System.out.println("Interest :" + interest);
		deposit(interest);
	}

	@Override
	public void withdraw(double amount) {
		if ( amount <= 0) {
			System.out.println("Amount to be withdrawn should be positive");
		}else if (!isSufficientBalance(amount)) {
			System.out.println("Insufficient balance");
		}else {
			balance -= amount;
			System.out.println("Amount withdrawn successfully");
		}
		
	}
	@Override
	public void printBalance() {
		System.out.printf("Savings Account Balance: $%.2f%n", getBalance());
		
	}
}
