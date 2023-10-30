package com.tasks.polymorphism.Bank;

public class SavingAccount extends Account {
	
	private static int checkWithdraw = 0;
	
	@Override
	void withdraw(double amt) {
		if (checkWithdraw <= 3) {
			Account.balance -= amt;
			System.out.println(amt + "Rs is Withdrawn from Your Account !\n");
			checkWithdraw++;
		} else {
			System.out.println("You already withdraw 3 times !");
		}
	}
	
	@Override
	void withdraw(int amt) {
		if (checkWithdraw <= 3) {
			Account.balance -= amt;
			System.out.println(amt + "Rs is Withdrawn from Your Account !\n");
			checkWithdraw++;
		} else {
			System.out.println("You already withdraw 3 times !");
		}
	}
	
}
