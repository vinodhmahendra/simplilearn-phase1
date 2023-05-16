package com.cisco.model;

public class Account {

	public double balance = 0.0;

	public Account(double initialBalance) {
//		balance = balance; problem ambiguity
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		this.balance += amount;
		// can you define return statement here ?
//		return ; javac
	}

	public void withdraw(double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
		} else {
			System.err.println("Insufficient balance");
		}
	}

}
