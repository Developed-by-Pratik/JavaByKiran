package com.tasks.Abstraction;

public abstract class BankAccount {

	protected String accountNumber;

	protected String accountHolderName;

	protected static double balance;

	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		BankAccount.balance = balance;
	}

	public abstract String getAccountNumber();

	public abstract String getAccountHolderName();

	public abstract double getBalance();

	public abstract void deposite(double amount);

	public abstract void withdraw(double amount);

	public void displayInfo() {
		System.out.println("Account Number  : " + getAccountNumber());
		System.out.println("Account Holder  : " + getAccountHolderName());
		System.out.println("Account Balance : " + getBalance());
	}
}
