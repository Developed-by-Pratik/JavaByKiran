package com.tasks.polymorphism.Bank;

public class CurrentAccount extends Account {

	@Override
	void withdraw(double amt) {
		// overdraft
		if (Account.balance <= 0) {
			Account.balance -= amt;
			System.out.println(amt + "Rs is Withdrawn from Your Account !\n");
		} else {
			Account.balance -= amt;
			System.out.println(amt + "Rs is Withdrawn from Your Account !\n");
		}
	}
	
	@Override
	void withdraw(int amt) {
		// overdraft
		if (Account.balance <= 0) {
			Account.balance -= amt;
			System.out.println(amt + "Rs is Withdrawn from Your Account !\n");
		} else {
			Account.balance -= amt;
			System.out.println(amt + "Rs is Withdrawn from Your Account !\n");
		}
	}

}
