package com.tasks.polymorphism.Bank;

public class Account {
	
	int accountNumber;
	String accountHolder;
	static double balance;
	
	public Account() {}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public static double  getBalance() {
		//System.out.println("Your current Balance is : " + Account.balance);
		return balance;
	}
	
	void deposite(double amt) {
		Account.balance += amt;
		System.out.println(amt +"Rs is Deposited in Your Account !\n");
	}
	
	//overloaded with int parameter
	void deposite(int amt) {
		Account.balance += amt;
		System.out.println(amt +"Rs is Deposited in Your Account !\n");
	}
	
	void withdraw(double amt) {
		Account.balance -= amt;
		System.out.println(amt +"Rs is Withdrawn from Your Account !\n");
	}
	
	//overloaded with int parameter
	void withdraw(int amt) {
		Account.balance -= amt;
		System.out.println(amt +"Rs is Withdrawn from Your Account !\n");
	}
	
	void displayAccountInfo() {
		System.out.println("Account Holder name : " + accountHolder);
		System.out.println("Accoun No : " + accountNumber);
	}
}
