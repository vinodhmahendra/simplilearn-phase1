package com.cisco.model;

public class Customer {
	
	private String firstName;
	private String lastName;

	public Customer ( String firstName , String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	//  Customer Has Account ( has - a )
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	
	
}// end of class scope
