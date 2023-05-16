package com.cisco.model;

public class Account {

	private double balance = 0.0;

	public Account(double initialBalance) {
//		balance = balance; problem ambiguity
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		if ( amount <= 0) {
			System.out.println("Amount to be deposited should be positive");
		}else {
			this.balance += amount;
			System.out.println("Amount deposited successfully");
		}
	}
	
	public boolean isSufficientBalance ( double amount ) {
		return this.balance >= amount;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void withdraw(double amount) {
		if (this.balance >= amount) {
			
		} else if (!isSufficientBalance(amount)) {
			System.err.println("Insufficient balance");
		}else {
			this.balance -= amount;
			System.out.println("Amount withdrawn successfully");
		}
	}

}
