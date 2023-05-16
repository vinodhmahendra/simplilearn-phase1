package com.cisco.client;
import  com.cisco.model.*;

// public access  make's this class available outside the package
public class TestBanking {

	//client code
	public static void main(String[] args) {
		System.out.println("Welcome to Banking Aapplication!");
	
		Account account ;
		account = new Account(500.00);
	
		account.deposit(1000.00);
		
		account.withdraw(200.00);
		
//		account.balance = -5000; private access
		
		System.out.println("The Final Balance : " + account.getBalance());

	}

}
