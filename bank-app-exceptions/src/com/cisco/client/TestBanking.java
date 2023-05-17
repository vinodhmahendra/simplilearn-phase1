package com.cisco.client;
import  com.cisco.model.*;

// public access  make's this class available outside the package
public class TestBanking {

	//client code
	public static void main(String[] args) {
		System.out.println("Welcome to Banking APP!");
	
		//create a customer
		Customer customer  = new Customer ("Bhavya","keshavulu");
		
		//create a CheckingAccount with initial balance of 500.00
		CheckingAccount checkingAccount = new CheckingAccount(500.00, 50.0);
		
		customer.setAccount(checkingAccount);
		
		Account account;
		
		account = customer.getAccount();
		
		account.deposit(200.00);
		account.withdraw(150.00);
		
		System.out.println("Customer [" + customer.getLastName() + " , "+ customer.getFirstName()+"]");
		System.out.print("Final Balance In Checking Account : " + account.getBalance());
		SavingsAccount savingsAccount = new SavingsAccount(500.00, 3.0);
		customer.setAccount(savingsAccount);
		
		account = customer.getAccount();
		account.deposit(200.00);
		savingsAccount.addInterest();
		System.out.println("Customer [" + customer.getLastName() + " , "+ customer.getFirstName()+"]");
		System.out.print("Final Balance In Savings Account : " + account.getBalance());
		
		
		

	}

}
