package com.tasks.polymorphism.Bank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Account Type : ");
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");
		System.out.println("3.Exit");

		int ch = sc.nextInt();

		while (true) {
			switch (ch) {
			case 1:
				System.out.print("Enter Account number :");
				int accountNumber = sc.nextInt();
				System.out.print("Enter Your Name :");
				String name = sc.next();

				Account s = new Account(accountNumber, name);
				s.displayAccountInfo();

				while (true) {
					System.out.println("Your Saving Account");
					System.out.println("1.Deposite");
					System.out.println("2.Withdraw");
					System.out.println("3.Check Balance");
					System.out.println("3.Log Out");
					int ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
						SavingAccount s1 = new SavingAccount();
						System.out.println("Enter amount to deposite :");
						int amt = sc.nextInt();
						s1.deposite(amt);
						break;
					case 2:
						SavingAccount s2 = new SavingAccount();
						System.out.println("Enter amount to withdraw :");
						int amt1 = sc.nextInt();
						s2.withdraw(amt1);
						break;
					case 3:
						Account.getBalance();
						break;
					case 4:
						System.out.println("Thank You !");
						System.exit(1);
						break;
					default:
						System.out.println("Enter Valid Input!");
						break;
					}
				}
			case 2:
				System.out.print("Enter Account number :");
				int accountNumber1 = sc.nextInt();
				System.out.print("Enter Your Name :");
				String name1 = sc.next();

				Account s1 = new Account(accountNumber1, name1);
				s1.displayAccountInfo();

				System.out.println("Your Saving Account");
				System.out.println("1.Deposite");
				System.out.println("2.Withdraw");
				System.out.println("3.Check Balance");
				System.out.println("4.Log Out");
				int ch2 = sc.nextInt();
				while (true) {
					switch (ch2) {
					case 1:
						CurrentAccount s2 = new CurrentAccount();
						System.out.println("Enter amount to deposite :");
						int amt = sc.nextInt();
						s2.deposite(amt);
						break;
					case 2:
						CurrentAccount s3 = new CurrentAccount();
						System.out.println("Enter amount to withdraw :");
						int amt1 = sc.nextInt();
						s3.withdraw(amt1);
						
						sc.close();
						break;
					case 3:
						Account.getBalance();
						break;
					case 4:
						System.out.println("Thank You !");
						System.exit(1);
						break;
					default:
						System.out.println("Enter Valid Input!");
						break;
					}
				}
			case 3:
				System.out.println("Thank You !!");
				System.exit(1);
			default:
				System.out.println("Enter Vaid Input !");
				break;
			}
		}
	}

}
