package com.springtraining.methodreplacement;

public class SavingsAccount {
	
	private String accountNumber;

	public SavingsAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public SavingsAccount() {
		this.accountNumber="X1234";
	}
	
	public String getDetails()
	{
		
		return this.accountNumber;
	}

}
