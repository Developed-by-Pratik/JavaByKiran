package com.tasks.Abstraction;

public class CheckingAccount extends BankAccount {

	private double overdraftLimit;

	public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String getAccountHolderName() {
		return accountHolderName;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposite(double amount) {

		if (BankAccount.balance >= amount) {
			BankAccount.balance += amount;
			System.out.println(amount + " is Deposited !");
		} else {
			System.out.println("Overdraft Limit exceeds !");
		}

	}

	@Override
	public void withdraw(double amount) {

		if (BankAccount.balance + overdraftLimit > amount) {
			BankAccount.balance -= amount;
			System.out.println(amount + " is Withdrawn !");
		} else {
			System.out.println("Overdraft Limit exceeds !");
		}

	}

}
