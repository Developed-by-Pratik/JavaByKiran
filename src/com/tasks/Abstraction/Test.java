package com.tasks.Abstraction;

public class Test {

	public static void main(String[] args) {

		SavingAccount s = new SavingAccount("1001", "Pratik", 1000, 4);

		s.displayInfo();
		System.out.println();

		s.deposite(4000);
		System.out.println("Current Balance : " + s.getBalance() + "\n");
		s.withdraw(400);
		System.out.println("Current Balance : " + s.getBalance() + "\n");
		s.withdraw(1100);
		System.out.println("Current Balance : " + s.getBalance() + "\n");

		CheckingAccount c = new CheckingAccount("1002", "Kartik", 2000, 5000);

		c.displayInfo();
		System.out.println();

		c.deposite(4000);
		System.out.println("Current Balance : " + c.getBalance() + "\n");
		c.withdraw(400);
		System.out.println("Current Balance : " + c.getBalance() + "\n");
		c.withdraw(1100);
		System.out.println("Current Balance : " + c.getBalance() + "\n");

	}

}
