package com.tasks.Abstraction;

public class SavingAccount extends BankAccount {

	private double interestRate;

	public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
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
		if (amount > 0) {
			BankAccount.balance += amount;
			System.out.println(amount + " is Deposited !");
		} else {
			System.out.println("Enter Valid Amount !");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= BankAccount.balance) {
			BankAccount.balance -= amount;
			System.out.println(amount + " is Withdrawn !");
		} else {
			System.out.println("Insufficent Balance !");
		}
	}

}
