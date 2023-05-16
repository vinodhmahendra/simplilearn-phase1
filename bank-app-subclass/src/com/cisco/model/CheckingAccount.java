package com.cisco.model;

public class CheckingAccount extends Account {

	private double overdraftLimit;
	
	public CheckingAccount ( double initialBalance, double overdraftLimit) {
		super(initialBalance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw( double amount) {
		
		if  ( amount <= 0) {
			System.out.println("Amount to be wihdrawn should be positive");
		}else if (getBalance() - amount < -overdraftLimit) {
			System.out.println("Withdrawl would exceed your overdraft limit");
		}else {
			double newBalance = getBalance() - amount;
			setBalance(newBalance);
			System.out.println("Amount Withdrawn successfully");
		}
		
	}
	@Override
	public boolean isSufficientBalance(double amount) {
		return getBalance() + overdraftLimit >= amount;
	}
}
